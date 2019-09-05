package cn.QQWeb.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Customer {
	
	//�ͻ�cusid
	private Long cusid;
	//����
	private String custName;
	//��ϵ��
//	private List<LinkMan> linkMen = new ArrayList<LinkMan>();
	//��ϵ��
	private String custLinkman;
	//��Դ dict_type_name
	private BaseDict custSource;
	//���� dict_item_name
	private BaseDict custLevel;
	//���õ�id
	private BaseDict dict_id;//dict_id
	
	//�ͻ��ı��ݷü�¼
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