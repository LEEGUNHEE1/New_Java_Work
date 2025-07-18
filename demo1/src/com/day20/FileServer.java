package com.day20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {

	class WorkThread extends Thread {

		private Socket sc;

		public WorkThread(Socket sc) {
			this.sc = sc;
		}

		@Override
		public void run() {

			try {

				ObjectInputStream ois = new ObjectInputStream(sc.getInputStream());

				

				FileOutputStream fos = null;
				Object ob = null;

				while ((ob = ois.readObject()) != null) {
					if (ob instanceof FileInfo) {
						
						FileInfo info = (FileInfo)ob;
						
						if (info.getCode() == 100) { //전송 시작
							
							String str = new String(info.getData());
							fos = new FileOutputStream(str);
							
							System.out.println(str + "파일 전송 시작!!");
							
							
						}else if (info.getCode() == 110) {//전송중
							
							if (fos == null) {
								break;
							}
							
							fos.write(info.getData(),0,info.getSize());
							System.out.println(info.getSize() + "bytes 받는중!!");
							
							
						}else if (info.getCode() == 200) {//전송종료
							
							if (fos==null) {
								break;
							}
							
							String str = new String(info.getData());
							fos.close();
							
							System.out.println(str + "파일 전송 끝!!");
							
						}
						
					}
				}

			} catch (Exception e) {

			}

		}

	}

	public void serverStart() {

		try {

			ServerSocket ss = new ServerSocket(7777);
			System.out.println("클라이언트 접속 대기중");

			Socket sc = ss.accept();
			
			System.out.println("클라이언트 접속!!");

			WorkThread wt = new WorkThread(sc);
			wt.start();

		} catch (Exception e) {

		}

	}

	public static void main(String[] args) {

		new FileServer().serverStart();

	}

}