package cn.QQWeb.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Customer {
	
	//客户cusid
	private Long cusid;
	//姓名
	private String custName;
	//联系人
//	private List<LinkMan> linkMen = new ArrayList<LinkMan>();
	//联系人
	private String custLinkman;
	//来源 dict_type_name
	private BaseDict custSource;
	//级别 dict_item_name
	private BaseDict custLevel;
	//引用的id
	private BaseDict dict_id;//dict_id
	
	//客户的被拜访记录
	private Set<Sale_Visit> Sale_Visit = new HashSet<Sale_Visit>();
	
	public Set<Sale_Visit> getSale_Visit() {
		return Sale_Visit;
	}
	public void setSale_Visit(Set<Sale_Visit> sale_Visit) {
		Sale_Visit = sale_Visit;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	
//	public List<LinkMan> getLinkMen() {
//		return linkMen;
//	}
//	public void setLinkMen(List<LinkMan> linkMen) {
//		this.linkMen = linkMen;
//	}

	public Long getCusid() {
		return cusid;
	}
	public void setCusid(Long cusid) {
		this.cusid = cusid;
	}
	public BaseDict getCustSource() {
		return custSource;
	}
	public void setCustSource(BaseDict custSource) {
		this.custSource = custSource;
	}
	public BaseDict getCustLevel() {
		return custLevel;
	}
	public void setCustLevel(BaseDict custLevel) {
		this.custLevel = custLevel;
	}
	public BaseDict getDict_id() {
		return dict_id;
	}
	public void setDict_id(BaseDict dict_id) {
		this.dict_id = dict_id;
	}
	public String getCustLinkman() {
		return custLinkman;
	}
	public void setCustLinkman(String custLinkman) {
		this.custLinkman = custLinkman;
	}
	
	
}
