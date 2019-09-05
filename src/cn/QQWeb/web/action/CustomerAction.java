package cn.QQWeb.web.action;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.QQWeb.domain.Customer;
import cn.QQWeb.domain.LinkMan;
import cn.QQWeb.service.CustomerService;
import cn.QQWeb.utils.pageBean;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{

	private Customer customer = new Customer();
	
//	private LinkMan linkMen;
	
	private CustomerService service;
	//��ȡ��ǰҳ
	private Integer pageSize;
	//��ȡÿҳ��ʾ��
	private Integer currentPage;
	
	//��ѯ�ͻ�
	public String list() throws Exception{
		//�������߲�ѯ����
		DetachedCriteria dc = DetachedCriteria.forClass(Customer.class);
		if(StringUtils.isNotBlank(customer.getCustName())) {
			dc.add(Restrictions.like("custName", "%"+customer.getCustName()+"%"));
		}
		//�������߲�ѯ���󡢵�ǰҳ��ÿҳ��ʾ������ȡ�ͻ�list
		pageBean pb = service.getPageBean(dc,currentPage,pageSize);
		
		ActionContext.getContext().put("pageBean", pb);
		return "list";
	}
	
	//��ӿͻ�
	public String add() throws Exception {
		//ֱ�ӵ���service
		service.saveOrUpdate(customer);
		
		
		return "toList";
	}
	
	//�޸Ŀͻ���Ϣ
	public String Edit() throws Exception {
		//ֱ�ӵ���service
		Customer Customer = service.getById(customer.getCusid());
		//��Customer����ActionContext��
		ActionContext.getContext().put("Customer", Customer);
		
		return "toAdd";
	}
	//ɾ���ͻ�
	public String delete() throws Exception {
		//ֱ�ӵ���service
		service.delete(customer.getCusid());
		
		
		return "toList";
	}
	
	//ͳ�ƿͻ���ҵ
	public String industryCount() throws Exception {
		//ֱ�ӵ���service
		List<Object[]> list = service.industryCount();
		//��list����Context��
		ActionContext.getContext().put("list", list);
		//ת����industryCount.jsp
		return "industryCount";
	}
	
	
	








	@Override
	public Customer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}
	
	
	
	public void setService(CustomerService service) {
		this.service = service;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	
	
}
