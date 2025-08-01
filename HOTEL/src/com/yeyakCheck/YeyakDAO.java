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

	// ���� ���� ��ü select
	public List<YeyakDTO> selectAllYeyak(String id) {
		
		this.id=id;

		List<YeyakDTO> lists = new ArrayList<YeyakDTO>();

		try {

			sql = "SELECT ȣ��,�Խǽð�,��ǽð�,�ѱݾ� FROM RESERVE where id = ?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				YeyakDTO dto = new YeyakDTO();

				dto.setRoomNum(rs.getInt("ȣ��"));
				dto.setInTime(rs.getString("�Խǽð�"));
				dto.setOutTime(rs.getString("��ǽð�"));
				dto.setSumPrice(rs.getInt("�ѱݾ�"));

				lists.add(dto);
			}

			rs.close();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return lists;

	}

	//���� ����
	public YeyakDTO updateYeyak(int currentRoomNum,int changeRoomNum,String inTime,String outTime) {
		
		YeyakDTO dto = new YeyakDTO();

		try {

			sql = "UPDATE reserve set ȣ��=?,�Խǽð�=?,��ǽð�=?,"
					+ "�ѱݾ� = (select �ݾ� from room where ȣ�� = ?) - "
					+ "(select ������ from USERINFO a, GRADESALE b where a.ID=? and "
					+ "a.����ڵ�� = b.����ڵ��) where ȣ�� = ?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, changeRoomNum);
			pstmt.setString(2, inTime);
			pstmt.setString(3, outTime);
			pstmt.setInt(4, changeRoomNum);
			pstmt.setString(5, id);
			pstmt.setInt(6, currentRoomNum);

			pstmt.executeUpdate();

			
			
			sql = "SELECT ȣ��,�Խǽð�,��ǽð�,�ѱݾ� FROM RESERVE where ȣ�� = ?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, changeRoomNum);

			rs = pstmt.executeQuery();

			if (rs.next()) {

				dto.setRoomNum(rs.getInt("ȣ��"));
				dto.setInTime(rs.getString("�Խǽð�"));
				dto.setOutTime(rs.getString("��ǽð�"));
				dto.setSumPrice(rs.getInt("�ѱݾ�"));

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
			
			sql = "delete reserve where ȣ�� = ?";
			
			pstmt= conn.prepareStatement(sql);
			
			pstmt.setInt(1, roomNum);
			
			result = pstmt.executeUpdate();
			
					
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
		
	}

}
