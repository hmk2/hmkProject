package com.sys.enity;

public class Room {
	
	private int roomId;
	private int roomPrice;
	private String roomRemark;
	private int roomStatus;
	private String image;
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public int getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(int roomPrice) {
		this.roomPrice = roomPrice;
	}
	public String getRoomRemark() {
		return roomRemark;
	}
	public void setRoomRemark(String roomRemark) {
		this.roomRemark = roomRemark;
	}
	public int getRoomStatus() {
		return roomStatus;
	}
	public void setRoomStatus(int roomStatus) {
		this.roomStatus = roomStatus;
	}
	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomPrice=" + roomPrice
				+ ", roomRemark=" + roomRemark + ", roomStatus=" + roomStatus
				+ ", image=" + image + "]";
	}

	
	
}
