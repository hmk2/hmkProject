package com.sys.pro;
/**
 * �˵�ʵ����
 * @author quezg(aliax)
 *
 */
public class Menu {
	private int menuId;
	private String menuName;
	private String menuUrl;
	private String menTarget;
	private int parentId;
	private int status;
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuUrl() {
		return menuUrl;
	}
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	public String getMenTarget() {
		return menTarget;
	}
	public void setMenTarget(String menTarget) {
		this.menTarget = menTarget;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", menuName=" + menuName
				+ ", menuUrl=" + menuUrl + ", menTarget=" + menTarget
				+ ", parentId=" + parentId + ", status=" + status + "]";
	}

	
}
