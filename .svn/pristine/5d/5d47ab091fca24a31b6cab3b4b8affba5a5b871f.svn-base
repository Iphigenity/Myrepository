package cn.QQWeb.web.intercetor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

import cn.QQWeb.domain.user;

public class PrivilegeIntercetor extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		//获取Session
		Map<String, Object> session = ActionContext.getContext().getSession();
		//获取登陆标识
		user user = (cn.QQWeb.domain.user) session.get("user");
		if(user != null) {
			//如果user不为空，放行
			return invocation.invoke();
		}
		//否则重定向至登录界面
		return "toLogin";
	}

}
