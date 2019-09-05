package cn.QQWeb.service.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.QQWeb.dao.BaseDictDao;
import cn.QQWeb.dao.impl.BaseDaoImpl;
import cn.QQWeb.domain.BaseDict;
import cn.QQWeb.service.BaseDictService;

public class BaseDictServiceImpl implements BaseDictService {

	private BaseDictDao dao;
	
	@Override
	public List<BaseDict> getListByTypeCode(String dict_type_code) {
		
		//调用dao层获取list
		List<BaseDict> list = dao.getListByTypeCode(dict_type_code);
		
		return list;
	}

	
	
	public void setDao(BaseDictDao dao) {
		this.dao = dao;
	}

	
}
