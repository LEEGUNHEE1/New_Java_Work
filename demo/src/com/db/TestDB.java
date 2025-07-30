package com.db;

import java.sql.Connection;

//jdbc

public class TestDB {

	public static void main(String[] args) {
		
		
		Connection conn = DBConn.getConnection();
		
		if (conn==null) {
			System.out.println("데이터베이스 연결 실패");
			System.exit(0);
		}else {
			System.out.println("데이터베이스 연결 성공");
		}
		
		DBConn.close();
	}

}
