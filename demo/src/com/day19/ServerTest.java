package com.day19;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.sound.sampled.Port;

public class ServerTest extends Frame implements ActionListener, Runnable {
	private static final long serialVersionUID = 1L;

	private TextArea ta = new TextArea();
	private TextField tf = new TextField();

	private ServerSocket ss;
	private Socket sc;

	public ServerTest() {

		add(ta, BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);

		tf.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {

				System.exit(0);
			}

		});

		setTitle("채팅 서버");
		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {

		new ServerTest().serverStart();

	}

	public void serverStart() {

		try {

			ss = new ServerSocket(7777);
			ta.setText("서버 시작");

			// 클라이언트가 접속해 오기를 기다림
			sc = ss.accept();

			// 상대가 보내는 메세지를 받음
			Thread th = new Thread(this);
			th.start();

		} catch (Exception e) {

		}

	}

	@Override
	public void run() {
		// 메세지를 받는 코딩
		String str;
		String ip;

		try {

			// 클라이언트가 접속하지 않았으면
			if (sc == null) {
				return;
			}

			// 상대가 보내는 메세지를 받음
			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			// 클라이언트 ip 받아서 출력
			ip = sc.getInetAddress().getHostAddress();
			ta.append("\r\n[" + ip + "] 접속");

			// 클라이언트 메세지 출력

			while ((str = br.readLine()) != null) {

				ta.append("\r\n" + str);

			}

		} catch (Exception e) {
			ta.append("\r\n클라이언트 연결 종료");
			// 연결 끊키면 소켓들 청소
			sc = null;
			ss = null;
		}

	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		// 메세지 보내는 코딩

		String str = tf.getText();

		if (str.trim().equals("")) {
			return;
		}

		if (sc == null) {
			return;
		}
		
		try {
			//OutputStream os = sc.getOutputStream();
			PrintWriter pw = new PrintWriter(sc.getOutputStream(),true);//true는 flush
			
			pw.println("서버]" + str);//클라이언트한테 보냄
			
			ta.append("\r\n서버]" + str);//내 화면에 보임
			
			tf.setText("");
			tf.requestFocus();
			
		} catch (Exception e) {
			ta.append("\r\n클라이언트와 연결 끊김");
			ss=null;
			sc=null;
		}
		

	}

}