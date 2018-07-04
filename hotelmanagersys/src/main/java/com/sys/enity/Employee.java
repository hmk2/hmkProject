package com.sys.enity;


public class Employee {
	private int employeeId;	
	private String employeeName;
	private String employeePwd;
	private int employeeIncome;
	private long employeePhone;
	private String employeeMail;
	private String employeeRemark;
	private int employeeStatus;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeePwd() {
		return employeePwd;
	}
	public void setEmployeePwd(String employeePwd) {
		this.employeePwd = employeePwd;
	}
	public int getEmployeeIncome() {
		return employeeIncome;
	}
	public void setEmployeeIncome(int employeeIncome) {
		this.employeeIncome = employeeIncome;
	}

	public long getEmployeePhone() {
		return employeePhone;
	}
	public void setEmployeePhone(long employeePhone) {
		this.employeePhone = employeePhone;
	}
	public String getEmployeeMail() {
		return employeeMail;
	}
	public void setEmployeeMail(String employeeMail) {
		this.employeeMail = employeeMail;
	}
	public String getEmployeeRemark() {
		return employeeRemark;
	}
	public void setEmployeeRemark(String employeeRemark) {
		this.employeeRemark = employeeRemark;
	}
	public int getEmployeeStatus() {
		return employeeStatus;
	}
	public void setEmployeeStatus(int employeeStatus) {
		this.employeeStatus = employeeStatus;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", employeePwd=" + employeePwd
				+ ", employeeIncome=" + employeeIncome + ", employeePhone="
				+ employeePhone + ", employeeMail=" + employeeMail
				+ ", employeeRemark=" + employeeRemark + ", employeeStatus="
				+ employeeStatus + "]";
	}
}
