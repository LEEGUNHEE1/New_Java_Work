package com.db;

import java.sql.Connection;

//jdbc

public class TestDB {

	public static void main(String[] args) {
		
		
		Connection conn = DBConn.getConnection();
		
		if (conn==null) {
			System.out.println("�����ͺ��̽� ���� ����");
			System.exit(0);
		}else {
			System.out.println("�����ͺ��̽� ���� ����");
		}
		
		DBConn.close();
	}

}
