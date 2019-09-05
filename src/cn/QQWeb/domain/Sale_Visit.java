package cn.QQWeb.domain;

import java.util.Date;

public class Sale_Visit {
/*
 * CREATE TABLE `sale_visit` (
  `visit_id` VARCHAR(32) NOT NULL,
  `visit_cust_id` BIGINT(32) DEFAULT NULL COMMENT '客户id',
  `visit_user_id` BIGINT(32) DEFAULT NULL COMMENT '负责人id',
  `visit_time` DATE DEFAULT NULL COMMENT '拜访时间',
  `visit_interviewee` VARCHAR(32) DEFAULT NULL COMMENT '被拜访人',
  `visit_addr` VARCHAR(128) DEFAULT NULL COMMENT '拜访地点',
  `visit_detail` VARCHAR(256) DEFAULT NULL COMMENT '拜访详情',
  `visit_nexttime` DATE DEFAULT NULL COMMENT '下次拜访时间',
) 
 * 
 */
	//用户id
	private String visit_id;
	//拜访时间
	private String visit_time;
	//被拜访人
	private String visit_interviewee;
	//拜访地点
	private String visit_addr;
	//拜访详情
	private String visit_detail;
	
	//拜访记录所属客户
	private Customer customer;
	//拜访记录所属用户
	private user user;
	
	public String getVisit_id() {
		return visit_id;
	}
	public void setVisit_id(String visit_id) {
		this.visit_id = visit_id;
	}
	public String getVisit_time() {
		return visit_time;
	}
	public void setVisit_time(String visit_time) {
		this.visit_time = visit_time;
	}
	public String getVisit_interviewee() {
		return visit_interviewee;
	}
	public void setVisit_interviewee(String visit_interviewee) {
		this.visit_interviewee = visit_interviewee;
	}
	public String getVisit_addr() {
		return visit_addr;
	}
	public void setVisit_addr(String visit_addr) {
		this.visit_addr = visit_addr;
	}
	public String getVisit_detail() {
		return visit_detail;
	}
	public void setVisit_detail(String visit_detail) {
		this.visit_detail = visit_detail;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public user getUser() {
		return user;
	}
	public void setUser(user user) {
		this.user = user;
	}
	
	
}
