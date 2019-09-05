package cn.QQWeb.web.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.QQWeb.domain.BaseDict;
import cn.QQWeb.service.BaseDictService;

public class BaseDictAvtion extends ActionSupport {
	
	//����dict_type_code
	private String dict_type_code;
	//
	private BaseDictService service;
	
	
	@Override
	public String execute() throws Exception {
		//��ȡ�ֵ���༯��
		List<BaseDict> list = service.getListByTypeCode(dict_type_code);
		//��listת��Ϊjson��ʽ
		Gson gson = new Gson();
		String json = gson.toJson(list);
		//��֪�����ʹ�ú��ֱ���
		ServletActionContext.getResponse().setContentType("application/json;charset=utf-8");
		//��json�����������
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
