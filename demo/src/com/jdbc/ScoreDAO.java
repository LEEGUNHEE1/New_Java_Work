package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;

import oracle.jdbc.OracleTypes;

public class ScoreDAO {// Date Access Object (SQL문장)
	
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

			// ?로 데이터 들어갈 자리 표시
			sql = "{call insertScore(?,?,?,?,?)}";//?는 입력값
			
			//sql문장 검사
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
	//ResultSet은 이동을 못함,List<ScoreDTO>에 넣어서 이동
	public List<ScoreDTO> getLists(){
		
		List<ScoreDTO> lists = new ArrayList<ScoreDTO>();
		
		try {
			
			sql = "{call selectAllScore(?)}"; //?는 받는값
			
			cstmt = conn.prepareCall(sql);
			
			//out 파라미터 자료형 설정
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);//oracle.jdbc의 OracleTypes, sql의 반환값이 cursor
			
			//프로시져 실행
			cstmt.executeQuery();
			
			//out파라미터값 리턴 받음,Object타입이라 다운캐스팅
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
			
			//out파라미터 자료형 설정
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);//1번 ?가 out값,2번 ?가 in값
			
			//in 파라미터
			cstmt.setString(2, hak);//2번 ?
			
			cstmt.executeQuery();
			
			rs = (ResultSet)cstmt.getObject(1); //1번 ? 저장
			
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
