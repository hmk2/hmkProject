package com.sys.enity;

public class News {
	private int newsId;
	private String newsAuthor;
	private String newsTime;
	private String newsContent;
	private String newsRemark;
	private int newsStatus;
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getNewsAuthor() {
		return newsAuthor;
	}
	public void setNewsAuthor(String newsAuthor) {
		this.newsAuthor = newsAuthor;
	}

	public String getNewsTime() {
		return newsTime;
	}
	public void setNewsTime(String newsTime) {
		this.newsTime = newsTime;
	}
	public String getNewsContent() {
		return newsContent;
	}
	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}
	public String getNewsRemark() {
		return newsRemark;
	}
	public void setNewsRemark(String newsRemark) {
		this.newsRemark = newsRemark;
	}
	public int getNewsStatus() {
		return newsStatus;
	}
	public void setNewsStatus(int newsStatus) {
		this.newsStatus = newsStatus;
	}
	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", newsAuthor=" + newsAuthor
				+ ", newsTime=" + newsTime + ", newsContent=" + newsContent
				+ ", newsRemark=" + newsRemark + ", newsStatus=" + newsStatus
				+ "]";
	}
}
