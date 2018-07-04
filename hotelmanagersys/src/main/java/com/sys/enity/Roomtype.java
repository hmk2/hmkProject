package com.sys.enity;

public class Roomtype {
	private int roomTypeId;
	private String roomTypeName;
	private String roomTypeRemark;
	private int roomTypeStatus;
	public int getRoomTypeId() {
		return roomTypeId;
	}
	public void setRoomTypeId(int roomTypeId) {
		this.roomTypeId = roomTypeId;
	}
	public String getRoomTypeName() {
		return roomTypeName;
	}
	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}
	public String getRoomTypeRemark() {
		return roomTypeRemark;
	}
	public void setRoomTypeRemark(String roomTypeRemark) {
		this.roomTypeRemark = roomTypeRemark;
	}
	public int getRoomTypeStatus() {
		return roomTypeStatus;
	}
	public void setRoomTypeStatus(int roomTypeStatus) {
		this.roomTypeStatus = roomTypeStatus;
	}
	@Override
	public String toString() {
		return "Roomtype [roomTypeId=" + roomTypeId + ", roomTypeName="
				+ roomTypeName + ", roomTypeRemark=" + roomTypeRemark
				+ ", roomTypeStatus=" + roomTypeStatus + "]";
	}
	
	
}
