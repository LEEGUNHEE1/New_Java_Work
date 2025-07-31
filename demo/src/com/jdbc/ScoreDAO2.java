package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;

public class ScoreDAO2 {// Date Access Object (SQL문장)
	
	int result = 0;

	Connection conn = DBConn.getConnection();

	// PreparedStatement
	PreparedStatement pstmt = null;
	String sql;
	
	ResultSet rs;
	
	// insert
	public int insertData(ScoreDTO dto) {

		result = 0;
		
		
		try {

			// ?로 데이터 들어갈 자리 표시
			sql = "insert into score(hak,name,kor,eng,mat) values(?,?,?,?,?)";
			
			//sql문장 검사
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getHak());
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getKor());
			pstmt.setInt(4, dto.getEng());
			pstmt.setInt(5, dto.getMat());

			result = pstmt.executeUpdate();

			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;

	}

	// update

	public int updateDate(ScoreDTO dto) {

		int result = 0;

		Connection conn = DBConn.getConnection();

		// PreparedStatement
		PreparedStatement pstmt = null;
		String sql;

		try {
			
			sql="update score set kor=?,eng=?,mat=? where hak=?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, dto.getKor());
			pstmt.setInt(2, dto.getEng());
			pstmt.setInt(3, dto.getMat());
			pstmt.setString(4, dto.getHak());
			
			result = pstmt.executeUpdate();
			
			pstmt.close();
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	//delete
	public int deleteDate(String hak){
		
		result = 0;
		
		try {
			
			sql = "delete score where hak=?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, hak);
			
			result = pstmt.executeUpdate();
			
			pstmt.close();
			
			
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
			
			sql = "select hak,name,kor,eng,mat,(kor+eng+mat) tot,(kor+eng+mat)/3 avg,"
					+ "rank() over(order by (kor+eng+mat) desc) rank from score";
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
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
			pstmt.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return lists;
		
	}
	
	//selectHak
	public ScoreDTO getListHak(String hak) {
		
		ScoreDTO dto=null;
		
		try {
			
			sql = "select hak,name,kor,eng,mat,(kor+eng+mat) tot,(kor+eng+mat)/3 avg from score where hak = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, hak);
			
			rs = pstmt.executeQuery();
			
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
				pstmt.close();
				
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
			
			sql = "select hak,name,kor,eng,mat,(kor+eng+mat) tot,(kor+eng+mat)/3 avg from score where name = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			
			rs = pstmt.executeQuery();
			
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
			pstmt.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return lists;
		
	}
	
	

}
