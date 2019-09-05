package cn.QQWeb.web.action;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.QQWeb.domain.LinkMan;
import cn.QQWeb.domain.Sale_Visit;
import cn.QQWeb.domain.user;
import cn.QQWeb.service.SaleVisitService;
import cn.QQWeb.utils.pageBean;

public class SaleVisitAction extends ActionSupport implements ModelDriven<Sale_Visit> {
	
	private Sale_Visit SaleVisit = new Sale_Visit();
	
	private SaleVisitService service;
	
	
	//获取当前页
	private Integer pageSize;
	//获取每页显示数
	private Integer currentPage;
	
	//查询联系人
	public String list() throws Exception{
		//创建离线查询对象
		DetachedCriteria dc = DetachedCriteria.forClass(Sale_Visit.class);
//		//根据联系人名字查询联系人
//		if(StringUtils.isNotBlank(SaleVisit)) {
//			dc.add(Restrictions.like("name", "%"+LinkMan.getName()+"%"));
//		}
		//查询某个客户下所属联系人
		if(SaleVisit.getCustomer() != null && SaleVisit.getCustomer().getCusid() != null ) {
			dc.add(Restrictions.eq("customer.cusid", SaleVisit.getCustomer().getCusid()));
		}
		
		//传递离线查询对象、当前页、每页显示数，获取联系人list
		pageBean pb = service.getPageBean(dc,currentPage,pageSize);
		
		ActionContext.getContext().put("pageBean", pb);
		return "list";
	}

	
	//添加拜访记录
	public String add() throws Exception {
		//0 取出登陆用户,放入SaleVisit实体.表达关系
			user u = (user) ActionContext.getContext().getSession().get("user");
			SaleVisit.setUser(u);
		//1 调用Service保存客户拜访记录
			service.save(SaleVisit);
		//2 重定向到拜访记录列表Action
		return "toList";
	}
	//修改客户信息
		public String Edit() throws Exception {
			//直接调用service
			Sale_Visit sv = service.getById(SaleVisit.getVisit_id());
			//将Customer放入ActionContext中
			ActionContext.getContext().put("SaleVisit", sv);
			
			return "toAdd";
		}
	
	
	
	
	public void setService(SaleVisitService service) {
		this.service = service;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}





	@Override
	public Sale_Visit getModel() {
		// TODO Auto-generated method stub
		return SaleVisit;
	}

}
