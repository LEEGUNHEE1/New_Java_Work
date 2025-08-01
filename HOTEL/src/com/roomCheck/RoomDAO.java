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

	// ��� ���� Ȯ��

	public List<RoomDTO> selectAllRoom() {

		List<RoomDTO> lists = new ArrayList<RoomDTO>();

		try {

			sql = "select ȣ��,���ǵ��,���Ǻ�,�뷡��,��������,�ݾ�,�̿��ο� from room";

			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				RoomDTO dto = new RoomDTO();

				dto.setRoomNum(rs.getInt("ȣ��"));
				dto.setRoomGrade(rs.getString("���ǵ��"));
				dto.setOceanView(rs.getString("���Ǻ�"));
				dto.setSingRoom(rs.getString("�뷡��"));
				dto.setExiestBath(rs.getString("��������"));
				dto.setPrice(rs.getInt("�ݾ�"));
				dto.setInwon(rs.getInt("�̿��ο�"));

				lists.add(dto);

			}
			rs.close();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return lists;
	}

	// �� ���� Ȯ��
	public List<RoomDTO> emptyRoom() {

		List<RoomDTO> lists = new ArrayList<RoomDTO>();

		try {

			sql = "select a.ȣ�� ȣ��,���ǵ��,���Ǻ�,�뷡��,��������,�ݾ�,�̿��ο�,b.ȣ�� bȣ�� "
					+ "from room a,reserve b where a.ȣ�� = b.ȣ��(+) and b.ȣ�� is null";

			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				RoomDTO dto = new RoomDTO();

				dto.setRoomNum(rs.getInt("ȣ��"));
				dto.setRoomGrade(rs.getString("���ǵ��"));
				dto.setOceanView(rs.getString("���Ǻ�"));
				dto.setSingRoom(rs.getString("�뷡��"));
				dto.setExiestBath(rs.getString("��������"));
				dto.setPrice(rs.getInt("�ݾ�"));
				dto.setInwon(rs.getInt("�̿��ο�"));

				lists.add(dto);

			}

			rs.close();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return lists;

	}

	// ����� ���� Ȯ��
	public List<RoomDTO> yeyakRoom() {

		List<RoomDTO> lists = new ArrayList<RoomDTO>();

		try {

			sql = "select a.ȣ�� ȣ��,���ǵ��,���Ǻ�,�뷡��,��������,�ݾ�,�̿��ο� from room a,reserve b " + "where a.ȣ�� = b.ȣ��";

			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				RoomDTO dto = new RoomDTO();

				dto.setRoomNum(rs.getInt("ȣ��"));
				dto.setRoomGrade(rs.getString("���ǵ��"));
				dto.setOceanView(rs.getString("���Ǻ�"));
				dto.setSingRoom(rs.getString("�뷡��"));
				dto.setExiestBath(rs.getString("��������"));
				dto.setPrice(rs.getInt("�ݾ�"));
				dto.setInwon(rs.getInt("�̿��ο�"));

				lists.add(dto);

			}
			rs.close();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return lists;
	}

	// yetak���� ���� ��ȣ�� �� Ȯ��
	public RoomDTO yeyakRoomCheck(int roomNum) {
		

		RoomDTO dto = new RoomDTO();
		
		System.out.println(roomNum);

		try {

			sql = "select ȣ��,���ǵ��,���Ǻ�,�뷡��,��������,�ݾ�,�̿��ο� from room where ȣ�� = ?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, roomNum);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				
				dto.setRoomNum(rs.getInt("ȣ��"));
				dto.setRoomGrade(rs.getString("���ǵ��"));
				dto.setOceanView(rs.getString("���Ǻ�"));
				dto.setSingRoom(rs.getString("�뷡��"));
				dto.setExiestBath(rs.getString("��������"));
				dto.setPrice(rs.getInt("�ݾ�"));
				dto.setInwon(rs.getInt("�̿��ο�"));
				
			}

			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return dto;
	}

}
