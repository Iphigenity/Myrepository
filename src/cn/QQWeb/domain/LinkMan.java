package cn.QQWeb.domain;

public class LinkMan {
	
	//联系人lid
	private Integer lid;
	//联系人姓名
	private String name;
	//性别
	private String sex;
	//
	
	
	//所属客户
	private Customer customer;

	public Integer getLid() {
		return lid;
	}

	public void setLid(Integer lid) {
		this.lid = lid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}
