package cn.QQWeb.dao;

import cn.QQWeb.domain.user;

public interface userDao extends BaseDao<user> {

	user getUserByName(user user);
}
