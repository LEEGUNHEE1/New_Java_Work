package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;

import oracle.jdbc.OracleTypes;

public class ScoreDAO {// Date Access Object (SQL����)
	
	int result = 0;

	Connection conn = DBConn.getConnection();

	// CallableStatement
	CallableStatement cstmt = null;
	String sql;
	
	ResultSet rs;
	
	// insert
	public int insertData(ScoreDTO dto) {

		result = 0;
		
		
		try {

			// ?�� ������ �� �ڸ� ǥ��
			sql = "{call insertScore(?,?,?,?,?)}";//?�� �Է°�
			
			//sql���� �˻�
			cstmt = conn.prepareCall(sql);

			cstmt.setString(1, dto.getHak());
			cstmt.setString(2, dto.getName());
			cstmt.setInt(3, dto.getKor());
			cstmt.setInt(4, dto.getEng());
			cstmt.setInt(5, dto.getMat());

			result = cstmt.executeUpdate();

			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;

	}

	// update

	public int updateDate(ScoreDTO dto) {

		int result = 0;

		Connection conn = DBConn.getConnection();

		// CallableStatement
		CallableStatement cstmt = null;
		String sql;

		try {
			
			sql="{call updateScore(?,?,?,?)}";
			
			cstmt = conn.prepareCall(sql);
			
			cstmt.setString(1, dto.getHak());
			cstmt.setInt(2, dto.getKor());
			cstmt.setInt(3, dto.getEng());
			cstmt.setInt(4, dto.getMat());
			
			result = cstmt.executeUpdate();
			
			cstmt.close();
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	//delete
	public int deleteDate(String hak){
		
		result = 0;
		
		try {
			
			sql = "{call deleteScore(?)}";
			
			cstmt = conn.prepareCall(sql);
			
			cstmt.setString(1, hak);
			
			result = cstmt.executeUpdate();
			
			cstmt.close();
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
		
	}
	
	//selectAll
	//ResultSet�� �̵��� ����,List<ScoreDTO>�� �־ �̵�
	public List<ScoreDTO> getLists(){
		
		List<ScoreDTO> lists = new ArrayList<ScoreDTO>();
		
		try {
			
			sql = "{call selectAllScore(?)}"; //?�� �޴°�
			
			cstmt = conn.prepareCall(sql);
			
			//out �Ķ���� �ڷ��� ����
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);//oracle.jdbc�� OracleTypes, sql�� ��ȯ���� cursor
			
			//���ν��� ����
			cstmt.executeQuery();
			
			//out�Ķ���Ͱ� ���� ����,ObjectŸ���̶� �ٿ�ĳ����
			rs = (ResultSet)cstmt.getObject(1);
			
			while (rs.next()) {
				
				ScoreDTO dto = new ScoreDTO();
				
				dto.setHak(rs.getString("hak"));
				dto.setName(rs.getString("name"));
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setTot(rs.getInt("tot"));
				dto.setAvg(rs.getInt("avg"));
				dto.setRank(rs.getInt("rank"));
				
				lists.add(dto);
				
			}
			rs.close();
			cstmt.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return lists;
		
	}
	
	//selectHak
	public ScoreDTO getListHak(String hak) {
		
		ScoreDTO dto=null;
		
		try {
			
			sql = "{call selectHakScore(?,?)}";
			
			cstmt = conn.prepareCall(sql);
			
			//out�Ķ���� �ڷ��� ����
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);//1�� ?�� out��,2�� ?�� in��
			
			//in �Ķ����
			cstmt.setString(2, hak);//2�� ?
			
			cstmt.executeQuery();
			
			rs = (ResultSet)cstmt.getObject(1); //1�� ? ����
			
			if (rs.next()) {
				
				dto = new ScoreDTO();
				
				dto.setHak(rs.getString("hak"));
				dto.setName(rs.getString("name"));
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setTot(rs.getInt("tot"));
				dto.setAvg(rs.getInt("avg"));
				
				rs.close();
				cstmt.close();
				
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return dto;
	}
	
	//selectName
	public List<ScoreDTO> getListName(String name){
		
		List<ScoreDTO> lists = new ArrayList<ScoreDTO>();
		
		try {
			
			sql = "{call selectNameScore(?,?)}";
			
			cstmt = conn.prepareCall(sql);
			
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			
			cstmt.setString(2, name);
			
			cstmt.executeQuery();
			
			rs = (ResultSet)cstmt.getObject(1);
			
			while (rs.next()) {
				
				ScoreDTO dto = new ScoreDTO();
				
				dto.setHak(rs.getString("hak"));
				dto.setName(rs.getString("name"));
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setTot(rs.getInt("tot"));
				dto.setAvg(rs.getInt("avg"));
				
				lists.add(dto);
				
			}
			
			rs.close();
			cstmt.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return lists;
		
	}
	
	

}
