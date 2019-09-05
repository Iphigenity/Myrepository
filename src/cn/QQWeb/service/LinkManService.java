package cn.QQWeb.service;

import org.hibernate.criterion.DetachedCriteria;

import cn.QQWeb.domain.LinkMan;
import cn.QQWeb.utils.pageBean;

public interface LinkManService {

	void saveOrUpdate(LinkMan linkMan);

	pageBean getPageBean(DetachedCriteria dc, Integer currentPage, Integer pageSize);

	LinkMan getById(Integer lid);

}
