package com.day30;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;


import com.db.DBConn;

//����Ŀ�Բ���
public class Test1 {

	public static void main(String[] args) {

		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		String sql = null;

		Scanner sc = new Scanner(System.in);

		int ch;
		int id;
		String name, birth, tel;

		try {
			while (true) {

				do {
					System.out.print("1.�Է� 2.��� 3.����");
					ch = sc.nextInt();
				} while (ch < 1 || ch > 3);

				switch (ch) {
				case 1:
					//�⺻������ true
					conn.setAutoCommit(false);
					System.out.print("���̵�[����] : ");
					id=sc.nextInt();
					
					System.out.print("�̸� : ");
					name=sc.next();
					
					System.out.print("����[yyyy-mm-dd] : ");
					birth=sc.next();
					
					
					System.out.print("��ȭ��ȣ : ");
					tel = sc.next();
					
					//test1
					sql=String.format("insert into test1(id,name) values (%d,'%s')", id,name);
					stmt = conn.createStatement();
					stmt.executeUpdate(sql);
					
					stmt.close();
					
					//test2
					sql=String.format("insert into test2(id,birth) values (%d,'%s')", id,birth);
					stmt = conn.createStatement();
					stmt.executeUpdate(sql);
					
					stmt.close();
					
					//test3
					sql=String.format("insert into test3(id,tel) values (%d,'%s')", id,tel);
					stmt = conn.createStatement();
					stmt.executeUpdate(sql);
					
					stmt.close();
					
					conn.commit();
					
					break;
				case 2:
					break;
				case 3:
					DBConn.close();
					System.exit(0);
					break;
				default:
					break;
				}

			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
