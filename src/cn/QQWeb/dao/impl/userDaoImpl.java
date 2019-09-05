package cn.QQWeb.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.QQWeb.dao.userDao;
import cn.QQWeb.domain.user;

//继承HibernateDaoSupport为dao注入sessionFactory
public class userDaoImpl extends BaseDaoImpl<user> implements userDao {

	@Override
	public user getUserByName(final user user) {
		return getHibernateTemplate().execute(new HibernateCallback<user>() {

			@Override
			public cn.QQWeb.domain.user doInHibernate(Session session) throws HibernateException {
				//创建HQL语句
				String hql = "from user where username=?";
				//将hql与session绑定
				Query query = session.createQuery(hql);
				//赋值给占位符
				query.setParameter(0, user.getUsername());
				//接收返回参数
				user user = (user) query.uniqueResult();
				return user;
			}
		});
	}

}
