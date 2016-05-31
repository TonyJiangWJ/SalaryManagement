<%@page import="com.response.model.EmployeeModel"%>
<%@page import="com.bean.Employee"%>
<%@page import="com.alibaba.fastjson.JSON"%>
<%@page import="com.response.EmployeeResponse"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'showEmployee.jsp' starting page</title>

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
			<td>编号</td>
			<td>姓名</td>
			<td>性别</td>
			<td>年龄</td>
			<td>地址</td>
			<td>电话</td>
			<td>部门</td>
			<td>职位</td>
		</tr>
		<%
			EmployeeResponse employeeResponse = (EmployeeResponse) session
					.getAttribute("employeeResponse");
			List<EmployeeModel> result = employeeResponse.getResult();
			for (int i = 0; i < result.size(); i++) {
		%>
		<tr>
			<td><a href="showPerson.action?empId=<%=result.get(i).getId()%>"><%=result.get(i).getId()%></a></td>
			<td><%=result.get(i).getName()%></td>
			<td><%=result.get(i).getSex()%></td>
			<td><%=result.get(i).getAge()%></td>
			<td><%=result.get(i).getAddress()%></td>
			<td><%=result.get(i).getEmpTel()%></td>
			<td><%=result.get(i).getDepartment()%></td>
			<td><%=result.get(i).getJob()%></td>
		</tr>
		<%
			}
		%>
	</table>
	<br>
	<a href="index.jsp">返回首页</a>
	<br>
	<a href="javascript:history.back(-1)">返回上一页</a>
</body>
</html>
