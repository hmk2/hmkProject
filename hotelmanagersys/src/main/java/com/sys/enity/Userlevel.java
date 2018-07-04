package com.sys.enity;

public class Userlevel {
	private int userLevelId;
	private String userLevelName;
	private String userLevelRemark;
	private int userLevelStatus;
	public int getUserLevelId() {
		return userLevelId;
	}
	public void setUserLevelId(int userLevelId) {
		this.userLevelId = userLevelId;
	}
	public String getUserLevelName() {
		return userLevelName;
	}
	public void setUserLevelName(String userLevelName) {
		this.userLevelName = userLevelName;
	}
	public String getUserLevelRemark() {
		return userLevelRemark;
	}
	public void setUserLevelRemark(String userLevelRemark) {
		this.userLevelRemark = userLevelRemark;
	}
	public int getUserLevelStatus() {
		return userLevelStatus;
	}
	public void setUserLevelStatus(int userLevelStatus) {
		this.userLevelStatus = userLevelStatus;
	}
	@Override
	public String toString() {
		return "Userlevel [userLevelId=" + userLevelId + ", userLevelName="
				+ userLevelName + ", userLevelRemark=" + userLevelRemark
				+ ", userLevelStatus=" + userLevelStatus + "]";
	}
	
	
}
