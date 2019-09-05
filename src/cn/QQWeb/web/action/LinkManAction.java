package cn.QQWeb.web.action;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.QQWeb.domain.Customer;
import cn.QQWeb.domain.LinkMan;
import cn.QQWeb.service.LinkManService;
import cn.QQWeb.utils.pageBean;

public class LinkManAction extends ActionSupport implements ModelDriven< LinkMan>{

	private  LinkMan  LinkMan = new  LinkMan();
	
//	private LinkMan linkMen;
	
	private LinkManService service;
	//获取当前页
	private Integer pageSize;
	//获取每页显示数
	private Integer currentPage;
	
	//查询联系人
	public String list() throws Exception{
		//创建离线查询对象
		DetachedCriteria dc = DetachedCriteria.forClass(LinkMan.class);
		//根据联系人名字查询联系人
		if(StringUtils.isNotBlank(LinkMan.getName())) {
			dc.add(Restrictions.like("name", "%"+LinkMan.getName()+"%"));
		}
		//查询某个客户下所属联系人
		if(LinkMan.getCustomer() != null && LinkMan.getCustomer().getCusid() != null ) {
			dc.add(Restrictions.eq("customer.cusid", LinkMan.getCustomer().getCusid()));
		}
		
		//传递离线查询对象、当前页、每页显示数，获取联系人list
		pageBean pb = service.getPageBean(dc,currentPage,pageSize);
		
		ActionContext.getContext().put("pageBean", pb);
		return "list";
	}
	
	//添加联系人
	public String add() throws Exception {
		//
		service.saveOrUpdate(LinkMan);
		
		return "toList";
	}
	
	//修改客户信息
	public String Edit() throws Exception {
		//直接调用service
		LinkMan Linkman = service.getById(LinkMan.getLid());
		//将Customer放入ActionContext中
		ActionContext.getContext().put("LinkMan", Linkman);
		
		return "toAdd";
	}

	
	
	








	@Override
	public  LinkMan getModel() {
		// TODO Auto-generated method stub
		return  LinkMan;
	}
	
	public void setService(LinkManService service) {
		this.service = service;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	
	
}
