package cn.QQWeb.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class user {
		
	/*
	  `uid` VARCHAR(32) NOT NULL,
	  `username` VARCHAR(20) DEFAULT NULL,
	  `password` VARCHAR(20) DEFAULT NULL,
	  `name` VARCHAR(20) DEFAULT NULL,
	  `email` VARCHAR(30) DEFAULT NULL,
	  `telephone` VARCHAR(20) DEFAULT NULL,
	  `birthday` DATE DEFAULT NULL,
	  `sex` VARCHAR(10) DEFAULT NULL,
	  `state` INT(11) DEFAULT NULL,
	  `code` VARCHAR(64) DEFAULT NULL,
	 */
	//用户Id
	private String uid;
	//用户名
	private String username;
	//密码
	private String password;
	//姓名
	private String name;
	//邮箱
	private String email;
	//手机号码
	private String telephone;
	//生日
	private String birthday;
	//性别
	private String sex;
	//是否激活
	private int state;
	//激活码
	private String code;
	
	//用户的拜访记录
	private Set<Sale_Visit> Sale_Visit = new HashSet<Sale_Visit>();
	
	public Set<Sale_Visit> getSale_Visit() {
		return Sale_Visit;
	}
	public void setSale_Visit(Set<Sale_Visit> sale_Visit) {
		Sale_Visit = sale_Visit;
	}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "user [username=" + username + "]";
	}
	
}
