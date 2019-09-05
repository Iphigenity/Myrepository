package cn.QQWeb.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

//dao�����ӿ�
public interface BaseDao<T> {
	
	void saveOrUpdate(T t);
	//��
	void save(T t);
	//ͨ��ʵ��ֱ��ɾ��
	void delete(T t);
	//ͨ��ID��ȡ��Ȼ��ɾ��
	void delete(Serializable id);
	//��
	void update(T t);
	//��
	T getById(Serializable id);
	//��
	Integer getTotalCount(DetachedCriteria dc);
	//��
	List<T> getPageBean(DetachedCriteria dc, Integer start, Integer pageSize);
}