package cn.QQWeb.service.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.QQWeb.dao.LinkManDao;
import cn.QQWeb.domain.Customer;
import cn.QQWeb.domain.LinkMan;
import cn.QQWeb.service.LinkManService;
import cn.QQWeb.utils.pageBean;

public class LinkManServiceImpl implements LinkManService {
	
	private LinkManDao dao;
	
	public void saveOrUpdate(LinkMan linkMan) {
		dao.saveOrUpdate(linkMan);
		
	}

	
	
	public void setDao(LinkManDao dao) {
		this.dao = dao;
	}



	@Override
	public pageBean getPageBean(DetachedCriteria dc, Integer currentPage, Integer pageSize) {
		//��ѯ�ܼ�¼��
		Integer totalCount = dao.getTotalCount(dc);
		//����pageBean
		pageBean pb = new pageBean(totalCount, pageSize, currentPage);
		//���տͻ��б�list
		List<LinkMan> list = dao.getPageBean(dc,pb.getStart(),pb.getPageSize());
		//��list��װ��pageBean
		pb.setList(list);
		return pb;
	}



	@Override
	public LinkMan getById(Integer lid) {
		
		return dao.getById(lid);
	}

	
	
}
