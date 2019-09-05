package cn.QQWeb.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.QQWeb.domain.Customer;
import cn.QQWeb.utils.pageBean;

public interface CustomerService {

	pageBean getPageBean(DetachedCriteria dc, Integer currentPage, Integer pageSize);

	void save(Customer customer);

	void saveOrUpdate(Customer customer);

	Customer getById(Long cusid);

	void delete(Long cusid);

	List<Object[]> industryCount();

}
