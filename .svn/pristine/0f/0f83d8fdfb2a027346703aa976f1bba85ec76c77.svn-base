package cn.QQWeb.service.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.QQWeb.dao.SaleVisitDao;
import cn.QQWeb.domain.LinkMan;
import cn.QQWeb.domain.Sale_Visit;
import cn.QQWeb.service.SaleVisitService;
import cn.QQWeb.utils.pageBean;

public class SaleVisitServiceImpl implements SaleVisitService {

	private SaleVisitDao dao;
	

	public void saveOrUpdate(Sale_Visit saleVisit) {
		if(saleVisit.getVisit_id()==null) {
			dao.save(saleVisit);
		}
		dao.saveOrUpdate(saleVisit);
	}
	
	public void save(Sale_Visit saleVisit) {
		dao.save(saleVisit);
	}
	
	@Override
	public pageBean getPageBean(DetachedCriteria dc, Integer currentPage, Integer pageSize) {
		//查询总记录数
		Integer totalCount = dao.getTotalCount(dc);
		//创建pageBean
		pageBean pb = new pageBean(totalCount, pageSize, currentPage);
		//接收客户列表list
		List<Sale_Visit> list = dao.getPageBean(dc,pb.getStart(),pb.getPageSize());
		//将list封装至pageBean
		pb.setList(list);
		return pb;
	}
	
	public Sale_Visit getById(String visit_id) {
		
		return dao.getById(visit_id);
		
	}

	
	public void setDao(SaleVisitDao dao) {
		this.dao = dao;
	}


	





	

}
