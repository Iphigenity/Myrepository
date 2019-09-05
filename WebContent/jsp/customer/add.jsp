<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<TITLE>
<s:property value="#Customer!=null?'修改':'添加'" />
客户</TITLE> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
<LINK href="${pageContext.request.contextPath }/css/Manage.css" type=text/css
	rel=stylesheet>
	<script src="${pageContext.request.contextPath }/js/jquery-1.4.4.min.js" type="text/javascript"></script>
	
<script type="text/javascript">
	//dict_type_code 数据字典类型
	//positionId 将select放置在哪的元素的id
	//selectName 定义select中name属性
	//selectId 需要回显时回显的id
	function loadSelect(type_code,positionId,selectName,selectId) {
		
		//创建一个select对象
		var $select = $("<select name='"+selectName+"' ></select>");
		//添加提示信息
		$select.append("<option value=''>---请选择---</option>");
		//ajax异步访问服务器
		$.post(
				"${pageContext.request.contextPath}/baseDictAction",
				{ "dict_type_code": type_code },
				 function(data){
					//遍历
					$.each( data, function(i, json){
						var $option = $("<option value='"+json["dict_id"]+"'>"+json["dict_item_name"]+"</option>");
						if(json["dict_id"] == selectId){
							$option.attr("selected","selected");
						}
						$select.append($option);
						});
				  },
				 "json");
		$("#"+positionId).append($select);
	}
	
	$(document).ready(function(){
		
	  loadSelect("009","info","custSource.dict_id" <s:if test="#Customer.custSource!=null">,<s:property value="#Customer.custSource.dict_id" /></s:if>);
	  loadSelect("006","level","custLevel.dict_id"<s:if test="#Customer.custLevel!=null">,<s:property value="#Customer.custLevel.dict_id" /></s:if>);
	  loadSelect("001","industry","dict_id.dict_id"<s:if test="#Customer.dict_id!=null">,<s:property value="#Customer.dict_id.dict_id" /></s:if>);
		});

</script>

<META content="MSHTML 6.00.2900.3492" name=GENERATOR>
</HEAD>
<BODY>
	<FORM id=form1 name=form1
		action="${pageContext.request.contextPath }/CustomerAction_add"
		method=post>
		
		

		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_019.jpg"
						border=0></TD>
					<TD width="100%" background="${pageContext.request.contextPath }/images/new_020.jpg"
						height=20></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_021.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15 background=${pageContext.request.contextPath }/images/new_022.jpg><IMG
						src="${pageContext.request.contextPath }/images/new_022.jpg" border=0></TD>
					<TD vAlign=top width="100%" bgColor=#ffffff>
						<TABLE cellSpacing=0 cellPadding=5 width="100%" border=0>
							<TR>
								<TD class=manageHead>当前位置：客户管理 &gt; <s:property value="#Customer!=null?'修改':'添加'" />客户</TD>
							</TR>
							<TR>
								<TD height=2></TD>
							</TR>
						</TABLE>
						
						<TABLE cellSpacing=0 cellPadding=5  border=0>
						  
						    
							<TR>
								<td>客户名称：</td>
								<td>
								<INPUT class=textbox id=sChannel2 value="<s:property value="#Customer.custName"/>"
														style="WIDTH: 180px" maxLength=50 name="custName">
								</td>
								<td>客户级别 ：</td>
								<td id="level" >
								<input type="hidden" name="cusid" value="<s:property value="#Customer.cusid"/>" >
								</td>
							</TR>
							
							<TR>
								
								<td>信息来源 ：</td>
								<td id="info" >
								
								</td>
								<td>联系人：</td>
								<td>
								<INPUT class=textbox id=sChannel2 value="<s:property value="#Customer.custLinkman"/>"
														style="WIDTH: 180px" maxLength=50 name="custLinkman">
								</td>
							</TR>
							
							<TR>
								
								
								<td>客户行业</td>
								<td id="industry" >
								
								</td>
								
							</TR>
							
							<tr>
								<td rowspan=2>
								<INPUT class=button id=sButton2 type=submit
														value=" 保存 " name=sButton2>
								</td>
							</tr>
						</TABLE>
						
						
					</TD>
					<TD width=15 background="${pageContext.request.contextPath }/images/new_023.jpg">
					<IMG src="${pageContext.request.contextPath }/images/new_023.jpg" border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_024.jpg"
						border=0></TD>
					<TD align=middle width="100%"
						background="${pageContext.request.contextPath }/images/new_025.jpg" height=15></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_026.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
	</FORM>
</BODY>
</HTML>
