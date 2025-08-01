package com.yeyakCheck;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;

public class YeyakDAO {

	Connection conn = DBConn.getConnection();

	PreparedStatement pstmt;

	String sql;

	ResultSet rs;
	
	String id;

	// 예약 내역 전체 select
	public List<YeyakDTO> selectAllYeyak(String id) {
		
		this.id=id;

		List<YeyakDTO> lists = new ArrayList<YeyakDTO>();

		try {

			sql = "SELECT 호수,입실시간,퇴실시간,총금액 FROM RESERVE where id = ?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				YeyakDTO dto = new YeyakDTO();

				dto.setRoomNum(rs.getInt("호수"));
				dto.setInTime(rs.getString("입실시간"));
				dto.setOutTime(rs.getString("퇴실시간"));
				dto.setSumPrice(rs.getInt("총금액"));

				lists.add(dto);
			}

			rs.close();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return lists;

	}

	//예약 수정
	public YeyakDTO updateYeyak(int currentRoomNum,int changeRoomNum,String inTime,String outTime) {
		
		YeyakDTO dto = new YeyakDTO();

		try {

			sql = "UPDATE reserve set 호수=?,입실시간=?,퇴실시간=?,"
					+ "총금액 = (select 금액 from room where 호수 = ?) - "
					+ "(select 할인율 from USERINFO a, GRADESALE b where a.ID=? and "
					+ "a.사용자등급 = b.사용자등급) where 호수 = ?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, changeRoomNum);
			pstmt.setString(2, inTime);
			pstmt.setString(3, outTime);
			pstmt.setInt(4, changeRoomNum);
			pstmt.setString(5, id);
			pstmt.setInt(6, currentRoomNum);

			pstmt.executeUpdate();

			
			
			sql = "SELECT 호수,입실시간,퇴실시간,총금액 FROM RESERVE where 호수 = ?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, changeRoomNum);

			rs = pstmt.executeQuery();

			if (rs.next()) {

				dto.setRoomNum(rs.getInt("호수"));
				dto.setInTime(rs.getString("입실시간"));
				dto.setOutTime(rs.getString("퇴실시간"));
				dto.setSumPrice(rs.getInt("총금액"));

			}
			
			rs.close();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return dto;

	}
	
	public int deleteYeyak(int roomNum) {
		
		int result=0;
		
		try {
			
			sql = "delete reserve where 호수 = ?";
			
			pstmt= conn.prepareStatement(sql);
			
			pstmt.setInt(1, roomNum);
			
			result = pstmt.executeUpdate();
			
					
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
		
	}

}
