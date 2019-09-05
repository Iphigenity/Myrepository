package cn.QQWeb.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

//dao基础接口
public interface BaseDao<T> {
	
	void saveOrUpdate(T t);
	//增
	void save(T t);
	//通过实体直接删除
	void delete(T t);
	//通过ID获取，然后删除
	void delete(Serializable id);
	//改
	void update(T t);
	//查
	T getById(Serializable id);
	//查
	Integer getTotalCount(DetachedCriteria dc);
	//查
	List<T> getPageBean(DetachedCriteria dc, Integer start, Integer pageSize);
}
