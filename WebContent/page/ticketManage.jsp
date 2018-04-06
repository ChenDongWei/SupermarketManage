<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.3.3/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.3.3/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.3.3/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.3.3/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
 
 
 function searchTicket(){
	 $("#dg").datagrid('load',{
		"ticketCode":$("#s_ticketCode").val() 
	 });
 }
 
 function formatAction(val,row){
	 return "<a href='javascript:openOrderDetailsDialog("+ "\"" + row.ticketCode + "\",\"" + row.timeStr + "\",\"" + row.totalMoney + "\"" + ")'>查看订单明细</a>";
 }
 
 function openOrderDetailsDialog(ticketCode, timeStr, totalMoney){
	 /* $.post("${pageContext.request.contextPath}/order/findById.do",{id:id},function(result){
			$("#fm").form('load',result);
			if(result.state==0){
				$("#state").val("未回款");
			}else if(result.state==1){
				$("#state").val("已回款");
			} 
	 },"json"); */
	 $("#ticketCode").val(ticketCode);
	 $("#timeStr").val(timeStr);
	 $("#totalMoney").val(totalMoney);
	 
	 /* $.post("${pageContext.request.contextPath}/orderDetails/getTotalPrice.do",{id:id},function(result){
			$("#totalMoney").val(result.totalMoney);
	 },"json"); */
	 
	 $("#dg2").datagrid('load',{
		 "ticketCode":ticketCode
	 });
	 
	 $("#dlg").dialog("open").dialog("setTitle","收银明细");
 }
 
 
 function closeOrderDetailsDialog(){
	 $("#dlg").dialog("close");
	 
 }
</script>
<title>收银信息管理</title>
</head>
<body style="margin: 1px">
 <table id="dg" title="产品信息查询" class="easyui-datagrid"
   fitColumns="true" pagination="true" rownumbers="true"
   url="${pageContext.request.contextPath}/ticket/list.do" fit="true" toolbar="#tb">
   <thead>
   	<tr>
   		<th field="cb" checkbox="true" align="center"></th>
   		<th field="id" width="50" align="center">编号</th>
   		<th field="ticketCode" width="50" align="center">收银小票编号</th>
   		<th field="totalMoney" width="200" align="center">总金额</th>
   		<th field="timeStr" width="200" align="center">打印小票时间</th>
   		<th field="a" width="200" align="center" formatter="formatAction">操作</th>
   	</tr>
   </thead>
 </table>
 <div id="tb">
 	<div>
 		&nbsp;小票编号：&nbsp;<input type="text" id="s_ticketCode" size="20" onkeydown="if(event.keyCode==13) searchTicket()"/>
 		<a href="javascript:searchTicket()" class="easyui-linkbutton" iconCls="icon-search" plain="true">搜索</a>
 	</div>
 </div>
 
  <div id="dlg" class="easyui-dialog" style="width:700px;height:450px;padding: 10px 20px"
   closed="true" buttons="#dlg-buttons">
   
   <form id="fm" method="post">
   	<table cellspacing="8px">
   		<tr>
   			<td>收银小票号：</td>
   			<td><input type="text" id="ticketCode" name="ticketCode" readonly="readonly"/></td>
   			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
   			<td>小票打印日期：</td>
   			<td><input type="text" id="timeStr" name="timeStr" readonly="readonly" /></td>
   		</tr>
   		<tr>
   			<td>总金额：</td>
   			<td><input type="text" id="totalMoney" name="totalMoney" readonly="readonly" /></td>
   		</tr>
   	</table>
   	<br/>
   	<table id="dg2" title="订购详情" class="easyui-datagrid"
   fitColumns="true" pagination="true" rownumbers="true"
   url="${pageContext.request.contextPath}/ticket/ticketGoods.do" style="width: 600px;height: 220px"  >
   <thead>
   	<tr>
   		<th field="id" width="50" align="center">编号</th>
   		<th field="goodsName" width="150" align="center">商品名称</th>
   		<th field="goodsNum" width="50" align="center">购买数量</th>
   		<th field="model" width="50" align="center">单位</th>
   		<th field="price" width="50" align="center" >单价(元)</th>
   		<th field="priceSum" width="80" align="center" >金额(元)</th>
   	</tr>
   </thead>
 </table>
   </form>
 </div>
 
 <div id="dlg-buttons">
 	<a href="javascript:closeOrderDetailsDialog()" class="easyui-linkbutton" iconCls="icon-cancel">关闭</a>
 </div>
</body>
</html>