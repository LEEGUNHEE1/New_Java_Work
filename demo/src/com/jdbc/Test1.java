package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.db.DBConn;

//DB에 데이터 넣는 세가지 방법
//Statement
//Preparedstatement - 제일 많이씀, 쿼리 정상적인지 검사함
//Callablestatement - procedure가 만들어져있을때 사용


public class Test1 {

	public static void main(String[] args) {
		
		Connection conn = DBConn.getConnection();
		
		if (conn==null) {
			
			System.out.println("연결 실패");
			System.exit(0);
			
		}
		
		//DB연결하는 단계
		//1.DriverManager가 Connection을 생성
		//2.Connection이 statement를 생성
		//3.statement가 SQL쿼리를 실행
		
		try {
			
			//언어에서 들어간 쿼리는 autocommit
			
			Statement stmt = conn.createStatement();
			String sql;
			int result;
			
			
			
			/*
			//insert
			sql = "insert into score (hak,name,kor,eng,mat) values('333','정인선',90,60,50)";
			
			result = stmt.executeUpdate(sql);//dml은 executeUpdate,select는 executeQuery
			
			//성공하면 1, 실패하면 0 반환
			if (result==1) {
				System.out.println("추가성공");
			}
			*/
			
			/*
			//update
			sql="update score set kor=100,eng=100,mat=100 where hak = 111";
			
			result = stmt.executeUpdate(sql);
			
			if (result==1) {
				System.out.println("수정성공");
			}
			*/
			
			/*
			//delete
			sql = "delete score where hak='222'";
			
			result = stmt.executeUpdate(sql);
			
			if (result ==1) {
				System.out.println("삭제성공");
			}
			*/
			
			//select
			
			//DB에서 가져온 테이블 담는 곳
			ResultSet rs;
			
			String hak,name;
			int kor,eng,mat,tot,avg,rank;
			
			sql = "select hak,name,kor,eng,mat,(kor+eng+mat) tot,(kor+eng+mat)/3 avg,"
					+ "rank() over (order by (kor+eng+mat) desc) rank from score";
			
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				
			//인덱스, 컬럼명 다됨
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
			//마지막에 다 닫아줌, rs도 닫아줘야됨
			rs.close();
			stmt.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());

		}
		DBConn.close();
		
	}

}
