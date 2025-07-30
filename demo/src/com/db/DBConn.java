package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	
	//ip,port 등 저장소
	private static Connection dbConn;
	
	//db연결
	
	public static Connection getConnection(){
		if (dbConn == null) {
			try {
				//type4방식
				String url = "jdbc:oracle:thin:@192.168.0.18:1521:xe";
				
				String user = "suzi";
				String pwd = "a123";
				
				//다른 클래스 읽는 클래스
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//db연결 스트림 만듬
				dbConn = DriverManager.getConnection(url, user, pwd);
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		return dbConn;
	}
	
	
	//db종료
	public static void close()
	{
		if (dbConn!=null) {
			try {
			
				if (!dbConn.isClosed()) {
					
					dbConn.close();
					
				}
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		//닫을때 초기화
		dbConn=null;
	
	}
	
}
