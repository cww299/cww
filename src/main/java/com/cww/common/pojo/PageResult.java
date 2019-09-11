package com.cww.common.pojo;

import java.util.List;

import org.springframework.data.domain.Page;

public class PageResult<T> {
	
	public PageResult(){
	}

	public PageResult(Page<T> pageResult,PageParameter page){
		setCurrPage(page.getPage()+1);
		setRows(pageResult.getContent());
		setTotal(pageResult.getTotalElements());
	}
	/*
	 * 结果总数量
	 */
	private long total;
	
	/*
	 * 返回的数据集
	 */
	private List<T> rows;
	
	/*
	 * 当前页数 
	 */
	private int currPage;
	
	public int getCurrPage() {
		return currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long l) {
		this.total = l;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	
	
}
