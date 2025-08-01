package com.roomCheck;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;
import com.yeyakCheck.YeyakDTO;

public class RoomDAO {

	Connection conn = DBConn.getConnection();

	PreparedStatement pstmt;

	String sql = "";

	ResultSet rs;

	// 모든 객실 확인

	public List<RoomDTO> selectAllRoom() {

		List<RoomDTO> lists = new ArrayList<RoomDTO>();

		try {

			sql = "select 호수,객실등급,오션뷰,노래방,욕조여부,금액,이용인원 from room";

			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				RoomDTO dto = new RoomDTO();

				dto.setRoomNum(rs.getInt("호수"));
				dto.setRoomGrade(rs.getString("객실등급"));
				dto.setOceanView(rs.getString("오션뷰"));
				dto.setSingRoom(rs.getString("노래방"));
				dto.setExiestBath(rs.getString("욕조여부"));
				dto.setPrice(rs.getInt("금액"));
				dto.setInwon(rs.getInt("이용인원"));

				lists.add(dto);

			}
			rs.close();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return lists;
	}

	// 빈 객실 확인
	public List<RoomDTO> emptyRoom() {

		List<RoomDTO> lists = new ArrayList<RoomDTO>();

		try {

			sql = "select a.호수 호수,객실등급,오션뷰,노래방,욕조여부,금액,이용인원,b.호수 b호수 "
					+ "from room a,reserve b where a.호수 = b.호수(+) and b.호수 is null";

			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				RoomDTO dto = new RoomDTO();

				dto.setRoomNum(rs.getInt("호수"));
				dto.setRoomGrade(rs.getString("객실등급"));
				dto.setOceanView(rs.getString("오션뷰"));
				dto.setSingRoom(rs.getString("노래방"));
				dto.setExiestBath(rs.getString("욕조여부"));
				dto.setPrice(rs.getInt("금액"));
				dto.setInwon(rs.getInt("이용인원"));

				lists.add(dto);

			}

			rs.close();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return lists;

	}

	// 예약된 객실 확인
	public List<RoomDTO> yeyakRoom() {

		List<RoomDTO> lists = new ArrayList<RoomDTO>();

		try {

			sql = "select a.호수 호수,객실등급,오션뷰,노래방,욕조여부,금액,이용인원 from room a,reserve b " + "where a.호수 = b.호수";

			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				RoomDTO dto = new RoomDTO();

				dto.setRoomNum(rs.getInt("호수"));
				dto.setRoomGrade(rs.getString("객실등급"));
				dto.setOceanView(rs.getString("오션뷰"));
				dto.setSingRoom(rs.getString("노래방"));
				dto.setExiestBath(rs.getString("욕조여부"));
				dto.setPrice(rs.getInt("금액"));
				dto.setInwon(rs.getInt("이용인원"));

				lists.add(dto);

			}
			rs.close();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return lists;
	}

	// yetak에서 받은 번호의 룸 확인
	public RoomDTO yeyakRoomCheck(int roomNum) {
		

		RoomDTO dto = new RoomDTO();
		
		System.out.println(roomNum);

		try {

			sql = "select 호수,객실등급,오션뷰,노래방,욕조여부,금액,이용인원 from room where 호수 = ?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, roomNum);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				
				dto.setRoomNum(rs.getInt("호수"));
				dto.setRoomGrade(rs.getString("객실등급"));
				dto.setOceanView(rs.getString("오션뷰"));
				dto.setSingRoom(rs.getString("노래방"));
				dto.setExiestBath(rs.getString("욕조여부"));
				dto.setPrice(rs.getInt("금액"));
				dto.setInwon(rs.getInt("이용인원"));
				
			}

			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return dto;
	}

}
