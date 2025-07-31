package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.db.DBConn;

//DB�� ������ �ִ� ������ ���
//Statement
//Preparedstatement - ���� ���̾�, ���� ���������� �˻���
//Callablestatement - procedure�� ������������� ���


public class Test1 {

	public static void main(String[] args) {
		
		Connection conn = DBConn.getConnection();
		
		if (conn==null) {
			
			System.out.println("���� ����");
			System.exit(0);
			
		}
		
		//DB�����ϴ� �ܰ�
		//1.DriverManager�� Connection�� ����
		//2.Connection�� statement�� ����
		//3.statement�� SQL������ ����
		
		try {
			
			//���� �� ������ autocommit
			
			Statement stmt = conn.createStatement();
			String sql;
			int result;
			
			
			
			/*
			//insert
			sql = "insert into score (hak,name,kor,eng,mat) values('333','���μ�',90,60,50)";
			
			result = stmt.executeUpdate(sql);//dml�� executeUpdate,select�� executeQuery
			
			//�����ϸ� 1, �����ϸ� 0 ��ȯ
			if (result==1) {
				System.out.println("�߰�����");
			}
			*/
			
			/*
			//update
			sql="update score set kor=100,eng=100,mat=100 where hak = 111";
			
			result = stmt.executeUpdate(sql);
			
			if (result==1) {
				System.out.println("��������");
			}
			*/
			
			/*
			//delete
			sql = "delete score where hak='222'";
			
			result = stmt.executeUpdate(sql);
			
			if (result ==1) {
				System.out.println("��������");
			}
			*/
			
			//select
			
			//DB���� ������ ���̺� ��� ��
			ResultSet rs;
			
			String hak,name;
			int kor,eng,mat,tot,avg,rank;
			
			sql = "select hak,name,kor,eng,mat,(kor+eng+mat) tot,(kor+eng+mat)/3 avg,"
					+ "rank() over (order by (kor+eng+mat) desc) rank from score";
			
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				
			//�ε���, �÷��� �ٵ�
			hak = rs.getString(1);
			name = rs.getString("name");
			kor = rs.getInt("kor");
			eng = rs.getInt(4);
			mat = rs.getInt("mat");
			tot = rs.getInt("tot");
			avg = rs.getInt(7);
			rank = rs.getInt("rank");
			
			System.out.printf("%3s %4s %3d %3d %3d %3d %3d %3d\n",hak,name,kor,eng,mat,tot,avg,rank);
			
			}
			//�������� �� �ݾ���, rs�� �ݾ���ߵ�
			rs.close();
			stmt.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());

		}
		DBConn.close();
		
	}

}
