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
		System.out.println("객실 정보");
		str += str.format("호수 : %d\n", roomNum);
		str += str.format("객실 등급 : %s\n", roomGrade);
		str += str.format("오션뷰 : %s\n", oceanView);
		str += str.format("노래방 : %s\n", singRoom);
		str += str.format("욕조 여부 : %s\n",exiestBath);
		str += str.format("객실 가격 : %d\n",price);
		str += str.format("사용 가능한 인원 : %d\n",inwon);
		
		return str;
	}
	
}
