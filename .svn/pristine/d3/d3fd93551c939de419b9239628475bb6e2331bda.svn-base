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
	//获取当前页
	private Integer pageSize;
	//获取每页显示数
	private Integer currentPage;
	
	//查询客户
	public String list() throws Exception{
		//创建离线查询对象
		DetachedCriteria dc = DetachedCriteria.forClass(Customer.class);
		if(StringUtils.isNotBlank(customer.getCustName())) {
			dc.add(Restrictions.like("custName", "%"+customer.getCustName()+"%"));
		}
		//传递离线查询对象、当前页、每页显示数，获取客户list
		pageBean pb = service.getPageBean(dc,currentPage,pageSize);
		
		ActionContext.getContext().put("pageBean", pb);
		return "list";
	}
	
	//添加客户
	public String add() throws Exception {
		//直接调用service
		service.saveOrUpdate(customer);
		
		
		return "toList";
	}
	
	//修改客户信息
	public String Edit() throws Exception {
		//直接调用service
		Customer Customer = service.getById(customer.getCusid());
		//将Customer放入ActionContext中
		ActionContext.getContext().put("Customer", Customer);
		
		return "toAdd";
	}
	//删除客户
	public String delete() throws Exception {
		//直接调用service
		service.delete(customer.getCusid());
		
		
		return "toList";
	}
	
	//统计客户行业
	public String industryCount() throws Exception {
		//直接调用service
		List<Object[]> list = service.industryCount();
		//将list放入Context中
		ActionContext.getContext().put("list", list);
		//转发至industryCount.jsp
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
