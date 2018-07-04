package com.sys.pro;

public class Authorization {
	private int auId;
	private String auName;
	private String auUrl;
	private int status;
	public int getAuId() {
		return auId;
	}
	public void setAuId(int auId) {
		this.auId = auId;
	}
	public String getAuName() {
		return auName;
	}
	public void setAuName(String auName) {
		this.auName = auName;
	}
	public String getAuUrl() {
		return auUrl;
	}
	public void setAuUrl(String auUrl) {
		this.auUrl = auUrl;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Authorization [auId=" + auId + ", auName=" + auName
				+ ", auUrl=" + auUrl + ", status=" + status + "]";
	}

	
}
