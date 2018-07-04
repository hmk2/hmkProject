package com.sys.enity;

public class Discount {
	private int discountId;
	private float discountNum;
	private int discounStatus;
	public int getDiscountId() {
		return discountId;
	}
	public void setDiscountId(int discountId) {
		this.discountId = discountId;
	}
	public float getDiscountNum() {
		return discountNum;
	}
	public void setDiscountNum(float discountNum) {
		this.discountNum = discountNum;
	}
	public int getDiscounStatus() {
		return discounStatus;
	}
	public void setDiscounStatus(int discounStatus) {
		this.discounStatus = discounStatus;
	}
	@Override
	public String toString() {
		return "Discount [discountId=" + discountId + ", discountNum="
				+ discountNum + ", discounStatus=" + discounStatus + "]";
	}
	
	
}
