package cn.QQWeb.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.QQWeb.dao.CustomerDao;
import cn.QQWeb.domain.Customer;

public class CustomerDaoImpl extends BaseDaoImpl<Customer> implements CustomerDao {

	//统计客户行业
	public List<Object[]> industryCount(){
		
		List<Object[]> list = getHibernateTemplate().execute(new HibernateCallback<List<Object[]>>() {

			@Override
			public List<Object[]> doInHibernate(Session session) throws HibernateException {
				
				String sql ="SELECT bd.dict_item_name, COUNT(*) total                  "+
							"FROM customer c,base_dict bd                              "+
							"WHERE c.dict_id = bd.dict_id GROUP BY bd.dict_type_code   ";
				SQLQuery query = session.createSQLQuery(sql);
				
				
				return query.list();
			}
		});
		return list;
	}
	
}
