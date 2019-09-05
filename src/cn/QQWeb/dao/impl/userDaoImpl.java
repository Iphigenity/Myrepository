package cn.QQWeb.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.QQWeb.dao.userDao;
import cn.QQWeb.domain.user;

//�̳�HibernateDaoSupportΪdaoע��sessionFactory
public class userDaoImpl extends BaseDaoImpl<user> implements userDao {

	@Override
	public user getUserByName(final user user) {
		return getHibernateTemplate().execute(new HibernateCallback<user>() {

			@Override
			public cn.QQWeb.domain.user doInHibernate(Session session) throws HibernateException {
				//����HQL���
				String hql = "from user where username=?";
				//��hql��session��
				Query query = session.createQuery(hql);
				//��ֵ��ռλ��
				query.setParameter(0, user.getUsername());
				//���շ��ز���
				user user = (user) query.uniqueResult();
				return user;
			}
		});
	}

}