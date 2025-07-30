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

		setTitle("ä�� ����");
		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {

		new ServerTest().serverStart();

	}

	public void serverStart() {

		try {

			ss = new ServerSocket(7777);
			ta.setText("���� ����");

			// Ŭ���̾�Ʈ�� ������ ���⸦ ��ٸ�
			sc = ss.accept();

			// ��밡 ������ �޼����� ����
			Thread th = new Thread(this);
			th.start();

		} catch (Exception e) {

		}

	}

	@Override
	public void run() {
		// �޼����� �޴� �ڵ�
		String str;
		String ip;

		try {

			// Ŭ���̾�Ʈ�� �������� �ʾ�����
			if (sc == null) {
				return;
			}

			// ��밡 ������ �޼����� ����
			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			// Ŭ���̾�Ʈ ip �޾Ƽ� ���
			ip = sc.getInetAddress().getHostAddress();
			ta.append("\r\n[" + ip + "] ����");

			// Ŭ���̾�Ʈ �޼��� ���

			while ((str = br.readLine()) != null) {

				ta.append("\r\n" + str);

			}

		} catch (Exception e) {
			ta.append("\r\nŬ���̾�Ʈ ���� ����");
			// ���� ��Ű�� ���ϵ� û��
			sc = null;
			ss = null;
		}

	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		// �޼��� ������ �ڵ�

		String str = tf.getText();

		if (str.trim().equals("")) {
			return;
		}

		if (sc == null) {
			return;
		}
		
		try {
			//OutputStream os = sc.getOutputStream();
			PrintWriter pw = new PrintWriter(sc.getOutputStream(),true);//true�� flush
			
			pw.println("����]" + str);//Ŭ���̾�Ʈ���� ����
			
			ta.append("\r\n����]" + str);//�� ȭ�鿡 ����
			
			tf.setText("");
			tf.requestFocus();
			
		} catch (Exception e) {
			ta.append("\r\nŬ���̾�Ʈ�� ���� ����");
			ss=null;
			sc=null;
		}
		

	}

}