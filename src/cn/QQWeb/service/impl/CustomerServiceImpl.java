package cn.QQWeb.service.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.QQWeb.dao.CustomerDao;
import cn.QQWeb.domain.Customer;
import cn.QQWeb.service.CustomerService;
import cn.QQWeb.utils.pageBean;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao dao;
	
	public pageBean getPageBean(DetachedCriteria dc, Integer currentPage, Integer pageSize) {
		
		//查询总记录数
		Integer totalCount = dao.getTotalCount(dc);
		//创建pageBean
		pageBean pb = new pageBean(totalCount, pageSize, currentPage);
		//接收客户列表list
		List<Customer> list = dao.getPageBean(dc,pb.getStart(),pb.getPageSize());
		//将list封装至pageBean
		pb.setList(list);
		return pb;
	}

	public void save(Customer customer) {
		dao.save(customer);
		
	}
	@Override
	public void saveOrUpdate(Customer customer) {
		dao.saveOrUpdate(customer);
	}
	
	@Override
	public Customer getById(Long cusid) {
		
		
		return dao.getById(cusid);
	}
	
	@Override
	public void delete(Long cusid) {
		// TODO Auto-generated method stub
		dao.delete(cusid);
		
	}
	
	@Override
	public List<Object[]> industryCount() {
		
		return dao.industryCount();
	}

	public void setDao(CustomerDao dao) {
		this.dao = dao;
	}


	

	

	
}
