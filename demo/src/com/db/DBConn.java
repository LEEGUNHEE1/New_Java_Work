package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	
	//ip,port �� �����
	private static Connection dbConn;
	
	//db����
	
	public static Connection getConnection(){
		if (dbConn == null) {
			try {
				//type4���
				String url = "jdbc:oracle:thin:@192.168.0.18:1521:xe";
				
				String user = "suzi";
				String pwd = "a123";
				
				//�ٸ� Ŭ���� �д� Ŭ����
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//db���� ��Ʈ�� ����
				dbConn = DriverManager.getConnection(url, user, pwd);
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		return dbConn;
	}
	
	
	//db����
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
		//������ �ʱ�ȭ
		dbConn=null;
	
	}
	
}
