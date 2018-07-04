package com.sys.enity;

public class Dept {
	private int deptId;
	private String deptName;
	private String deptRemark;
	private int deptStatus;
	
	
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptRemark() {
		return deptRemark;
	}
	public void setDeptRemark(String deptRemark) {
		this.deptRemark = deptRemark;
	}
	public int getDeptStatus() {
		return deptStatus;
	}
	public void setDeptStatus(int deptStatus) {
		this.deptStatus = deptStatus;
	}
	@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", deptName=" + deptName
				+ ", deptRemark=" + deptRemark + ", deptStatus=" + deptStatus
				+ "]";
	}
	
	
}
