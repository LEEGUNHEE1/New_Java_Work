package com.roomCheck;

public class RoomDTO {
	
	private int roomNum;
	private String roomGrade;
	private String oceanView;
	private String singRoom;
	private String exiestBath;
	private int price;
	private int inwon;
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	public String getRoomGrade() {
		return roomGrade;
	}
	public void setRoomGrade(String roomGrade) {
		this.roomGrade = roomGrade;
	}
	public String getOceanView() {
		return oceanView;
	}
	public void setOceanView(String oceanView) {
		this.oceanView = oceanView;
	}
	public String getSingRoom() {
		return singRoom;
	}
	public void setSingRoom(String singRoom) {
		this.singRoom = singRoom;
	}
	public String getExiestBath() {
		return exiestBath;
	}
	public void setExiestBath(String exiestBath) {
		this.exiestBath = exiestBath;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getInwon() {
		return inwon;
	}
	public void setInwon(int inwon) {
		this.inwon = inwon;
	}
	
	@Override
	public String toString() {
		String str="";
		System.out.println("----------------------------------------------");
		System.out.println("���� ����");
		str += str.format("ȣ�� : %d\n", roomNum);
		str += str.format("���� ��� : %s\n", roomGrade);
		str += str.format("���Ǻ� : %s\n", oceanView);
		str += str.format("�뷡�� : %s\n", singRoom);
		str += str.format("���� ���� : %s\n",exiestBath);
		str += str.format("���� ���� : %d\n",price);
		str += str.format("��� ������ �ο� : %d\n",inwon);
		
		return str;
	}
	
}
