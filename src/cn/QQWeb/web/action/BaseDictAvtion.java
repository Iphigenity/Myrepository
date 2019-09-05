package cn.QQWeb.web.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.QQWeb.domain.BaseDict;
import cn.QQWeb.service.BaseDictService;

public class BaseDictAvtion extends ActionSupport {
	
	//接收dict_type_code
	private String dict_type_code;
	//
	private BaseDictService service;
	
	
	@Override
	public String execute() throws Exception {
		//获取字典分类集合
		List<BaseDict> list = service.getListByTypeCode(dict_type_code);
		//将list转换为json格式
		Gson gson = new Gson();
		String json = gson.toJson(list);
		//告知浏览器使用何种编码
		ServletActionContext.getResponse().setContentType("application/json;charset=utf-8");
		//将json发送至浏览器
		ServletActionContext.getResponse().getWriter().write(json);
		
		return null;
	}




	public void setDict_type_code(String dict_type_code) {
		this.dict_type_code = dict_type_code;
	}

	public void setService(BaseDictService service) {
		this.service = service;
	}
}
