<%@page import="com.bean.Salary"%>
<%@page import="com.response.SalaryResponse"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showPersonYear.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  
<body style="text-align:center">
	<table border="1" cellspacing="0" align="center" width="80%">
		<tr>
			<td>年份</td>
			<td>用户编号</td>
			<td>年总工资</td>
		</tr>
		<%
			SalaryResponse salaryResponse = (SalaryResponse) request
					.getAttribute("salaryResponseYear");
			List<Salary> result = salaryResponse.getResult();
			Float totalSalary = new Float(0);
			for (int i = 0; i < result.size(); i++) {
				totalSalary+=result.get(i).getTotal();	
			}
		%>
		<tr>
			<td><%=result.get(0).getAttYear()%> </td>
			<td><%=result.get(0).getEmpId()%></td>
			<td><%=totalSalary%></td>
		</tr>
	</table>

	<br>
	<a href="index.jsp">返回首页</a>
	<br>
	<a href="javascript:history.back(-1)">返回上一页</a>
</body>
</html>
