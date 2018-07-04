package com.sys.enity;

public class Page {
		// 第几页
		private int page;
		// 每页大小
		private int rows;
		public int getPage() {
			return page;
		}
		public void setPage(int page) {
			this.page = page;
		}
		public int getRows() {
			return rows;
		}
		public void setRows(int rows) {
			this.rows = rows;
		}
		@Override
		public String toString() {
			return "Page [page=" + page + ", rows=" + rows + "]";
		}
		
}
