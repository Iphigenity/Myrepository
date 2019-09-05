package cn.QQWeb.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.QQWeb.dao.SaleVisitDao;
import cn.QQWeb.domain.Sale_Visit;

public  class SaleVisitDaoImpl extends BaseDaoImpl<Sale_Visit> implements SaleVisitDao {

	@Override
	public Sale_Visit getById(String visit_id) {
		Sale_Visit sale_Visit = getHibernateTemplate().get(Sale_Visit.class, visit_id);
		
		return sale_Visit;
	}





}
