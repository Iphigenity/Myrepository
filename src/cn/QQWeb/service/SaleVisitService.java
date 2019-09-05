package cn.QQWeb.service;

import org.hibernate.criterion.DetachedCriteria;

import cn.QQWeb.domain.Sale_Visit;
import cn.QQWeb.utils.pageBean;

public interface SaleVisitService {
	
	//保存或修改拜访记录
	void saveOrUpdate(Sale_Visit saleVisit);
	//获取拜访记录liebiao
	pageBean getPageBean(DetachedCriteria dc, Integer currentPage, Integer pageSize);
	//通过Id获取拜访记录
	Sale_Visit getById(String visit_id);
	void save(Sale_Visit saleVisit);

}
