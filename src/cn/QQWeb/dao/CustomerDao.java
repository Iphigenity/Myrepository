package cn.QQWeb.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.QQWeb.domain.Customer;

public interface CustomerDao extends BaseDao<Customer>{

	public List<Object[]> industryCount();

}
