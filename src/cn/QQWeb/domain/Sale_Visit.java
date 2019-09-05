package cn.QQWeb.domain;

import java.util.Date;

public class Sale_Visit {
/*
 * CREATE TABLE `sale_visit` (
  `visit_id` VARCHAR(32) NOT NULL,
  `visit_cust_id` BIGINT(32) DEFAULT NULL COMMENT '�ͻ�id',
  `visit_user_id` BIGINT(32) DEFAULT NULL COMMENT '������id',
  `visit_time` DATE DEFAULT NULL COMMENT '�ݷ�ʱ��',
  `visit_interviewee` VARCHAR(32) DEFAULT NULL COMMENT '���ݷ���',
  `visit_addr` VARCHAR(128) DEFAULT NULL COMMENT '�ݷõص�',
  `visit_detail` VARCHAR(256) DEFAULT NULL COMMENT '�ݷ�����',
  `visit_nexttime` DATE DEFAULT NULL COMMENT '�´ΰݷ�ʱ��',
) 
 * 
 */
	//�û�id
	private String visit_id;
	//�ݷ�ʱ��
	private String visit_time;
	//���ݷ���
	private String visit_interviewee;
	//�ݷõص�
	private String visit_addr;
	//�ݷ�����
	private String visit_detail;
	
	//�ݷü�¼�����ͻ�
	private Customer customer;
	//�ݷü�¼�����û�
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