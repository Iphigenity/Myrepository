package cn.QQWeb.utils;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.mapping.Array;

public class pageBean {
	
	//总记录数
	private Integer totalCount;
	//每页显示数
	private Integer pageSize;
	//总页数
	private Integer totalPage;
	//当前页数
	private Integer currentPage;
	//显示内容集合
	private List list;
	
	//构造函数
	public pageBean(Integer totalCount, Integer pageSize, Integer currentPage) {
		
		this.totalCount = totalCount;
		this.pageSize = pageSize;
		this.currentPage = currentPage;
		
		//判断当前页数,若果为空或小于1则显示第一页
		if(this.currentPage == null) {
			this.currentPage = 1;
		}
		//为每页显示数赋初值
		if(this.pageSize == null) {
			this.pageSize = 4;
		}
//		//每页显示数不应大于总数
//		if(this.pageSize > this.totalCount) {
//			this.pageSize = this.totalCount;
//		}
		//计算总页数
		this.totalPage = (this.totalCount+this.pageSize-1)/this.pageSize;
		if(this.currentPage < 1) {
			this.currentPage = 1;
		}
		if(this.currentPage > this.totalPage) {
			this.currentPage = this.totalPage;
		}
	}
	//计算起始索引
	public int getStart() {
		return (this.currentPage-1)*this.pageSize;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}
	
	
}
