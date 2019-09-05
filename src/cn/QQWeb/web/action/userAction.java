package cn.QQWeb.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.QQWeb.dao.userDao;
import cn.QQWeb.domain.user;
import cn.QQWeb.service.userService;
import cn.QQWeb.utils.MD5Utils;

public class userAction extends ActionSupport implements ModelDriven<user> {
	
	private user u = new user();
	
	private userService service;
	
	
	//�û���¼
	public String login() {
		try {
			
			user user = service.getUserByName(u);
			//��user����ActionContexrt��
			ActionContext.getContext().getSession().put("user", user);
		} catch (Exception e) {
			ActionContext.getContext().put("error", e.getMessage());
			return "reLogin";
		}
		
		return "toHome";
	}
	
	//ע���û�
	public String regist() {
		
		
		try {
			service.regist(u);
		} catch (Exception e) {
			ActionContext.getContext().put("error", e.getMessage());
			return "regist";
		}
		return "toLogin";
	}
	
	
	public user getModel() {
		
		return u;
	}

	public void setService(userService service) {
		this.service = service;
	}
}
