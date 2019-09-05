package cn.QQWeb.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.QQWeb.domain.LinkMan;
import cn.QQWeb.domain.Sale_Visit;

public interface SaleVisitDao {

	void saveOrUpdate(Sale_Visit saleVisit);

	Integer getTotalCount(DetachedCriteria dc);

	List<Sale_Visit> getPageBean(DetachedCriteria dc, Integer start, Integer pageSize);

	Sale_Visit getById(String visit_id);

	void save(Sale_Visit saleVisit);


}
