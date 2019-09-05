package cn.QQWeb.service.impl;


import org.springframework.aop.ThrowsAdvice;

import cn.QQWeb.dao.userDao;
import cn.QQWeb.domain.user;
import cn.QQWeb.service.userService;
import cn.QQWeb.utils.MD5Utils;


public class userServiceImpl implements userService {
	
	private userDao dao;
	

	//登录(MD5Utils.md5(u.getPassword())))
	public user getUserByName(user user) {
		
		user u = dao.getUserByName(user);
		if(u.getUsername()==null) {
			throw new RuntimeException("用户名不存在！！");
		}
		if(!MD5Utils.md5(user.getPassword()).equals(u.getPassword())){
			throw new RuntimeException("密码错误！！");
		}
		return u;
		
	}
	
	//注册
	public void regist(user u) {
		
		user user = dao.getUserByName(u);
		if(user!=null){
			//2 如果获得到user对象,用户名已经存在,抛出异常
			throw new RuntimeException("用户名已经存在!");
		}
		//3 调用Dao执行保存
		u.setPassword(MD5Utils.md5(u.getPassword()));
		dao.save(u);
		
	}
	
	@Override
	public void save(user u) {
		dao.save(u);
		
	}
	
	public void setDao(userDao dao) {
		this.dao = dao;
	}


	
}
