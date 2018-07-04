package com.sys.pro;

public class Kaoqin {
	private int kaoId;
	private String kaoName;
	private String kaoSex;
	private int status;
	private int kaoNumber;
	public int getKaoId() {
		return kaoId;
	}
	public void setKaoId(int kaoId) {
		this.kaoId = kaoId;
	}
	public String getKaoName() {
		return kaoName;
	}
	public void setKaoName(String kaoName) {
		this.kaoName = kaoName;
	}
	public String getKaoSex() {
		return kaoSex;
	}
	public void setKaoSex(String kaoSex) {
		this.kaoSex = kaoSex;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getKaoNumber() {
		return kaoNumber;
	}
	public void setKaoNumber(int kaoNumber) {
		this.kaoNumber = kaoNumber;
	}
	@Override
	public String toString() {
		return "Kaoqin [kaoId=" + kaoId + ", kaoName=" + kaoName + ", kaoSex="
				+ kaoSex + ", status=" + status + ", kaoNumber=" + kaoNumber
				+ "]";
	} 
	
}
