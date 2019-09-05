package cn.QQWeb.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.QQWeb.dao.BaseDao;
import cn.QQWeb.domain.Customer;

public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {

	//���ڷ�װ��ǰ����class
	private Class clazz;
	
	
	public BaseDaoImpl() {
		//
		ParameterizedType TClass = (ParameterizedType) this.getClass().getGenericSuperclass();
		//��ȡ�����ڵķ�������
		Type[] TC = TClass.getActualTypeArguments();
		clazz = (Class) TC[0];
	}

	@Override
	public void save(T t) {
		getHibernateTemplate().save(t);
	}

	@Override
	public void delete(T t) {
		getHibernateTemplate().delete(t);
	}

	@Override
	public void delete(Serializable id) {
		//ͨ��id��ȡ�־û�״̬ʵ��
		T t = this.getById(id);
		//ɾ��
		getHibernateTemplate().delete(t);
	}

	@Override
	public void update(T t) {
		getHibernateTemplate().update(t);
	}

	@Override
	public T getById(Serializable id) {
		T t = (T) getHibernateTemplate().get(clazz, id);
		return t;
	}

	@Override
	public Integer getTotalCount(DetachedCriteria dc) {
		//Ϊ���߲�ѯ�������ӾۺϺ���
		dc.setProjection(Projections.rowCount());
		//��ѯ�ͻ����ܼ�¼��
		List<Long> list = (List<Long>) getHibernateTemplate().findByCriteria(dc);
		//������ӵľۺϺ���
		dc.setProjection(null);
		if(list != null && list.size() > 0) {
			return list.get(0).intValue();
		}
		
		return null;
	}

	@Override
	public List<T> getPageBean(DetachedCriteria dc, Integer start, Integer pageSize) {
		//��ѯ�������������Ŀͻ�
		List<T> list = (List<T>) getHibernateTemplate().findByCriteria(dc,start,pageSize);
		
		return list;
	}

	@Override
	public void saveOrUpdate(T t) {
		getHibernateTemplate().saveOrUpdate(t);
	}

}