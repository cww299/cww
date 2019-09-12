package com.cww.common.pojo;


public class PageParameter{

	private int page = 0;
	
	private int size = 10;
	

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page-1;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
