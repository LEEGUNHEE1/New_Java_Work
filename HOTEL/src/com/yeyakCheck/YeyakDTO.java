package com.yeyakCheck;

public class YeyakDTO {

	private String Id;

	private int roomNum;

	private String inTime;

	private String outTime;

	private int sumPrice;


	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	public String getInTime() {
		return inTime;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public String getOutTime() {
		return outTime;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	public int getSumPrice() {
		return sumPrice;
	}

	public void setSumPrice(int sumPrice) {
		this.sumPrice = sumPrice;
	}

	@Override
	public String toString() {

		String str = "";

		System.out.println("---------------------------------------------------------------------------------");

		str = str.format("호수 : %d | 입실시간 : %s | 퇴실시간 : %s | 총 금액 : %d",
				roomNum, inTime, outTime, sumPrice);

		return str;

	}

}
