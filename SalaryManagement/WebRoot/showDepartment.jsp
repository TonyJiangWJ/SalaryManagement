<%@page import="com.bean.Department"%>
<%@page import="com.response.DepartmentResponse"%>
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

<title>My JSP 'showDepartment.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

  <body  style="text-align:center">
	<table border="1" cellspacing="0" align="center" width="80%">
		<tr>
			<td>部门名称</td>
			<td>主管</td>
			<td>部门电话</td>
		</tr>
		<%
			DepartmentResponse departmentResponse = (DepartmentResponse) session
					.getAttribute("departmentResponse");
			List<Department> result = departmentResponse.getResult();
			for (int i = 0; i < result.size(); i++) {
		%>
		<tr>
			<td><%=result.get(i).getDeptName()%></td>
			<td><%=result.get(i).getManager()%></td>
			<td><%=result.get(i).getDeptTel()%></td>
		</tr>

		<%
			}
		%>
	</table>

	<br>
	<a href="index.jsp">返回首页</a><br>
	<a href="javascript:history.back(-1)">返回上一页</a>
</body>
</html>
