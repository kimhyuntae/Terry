<%@page import="kdata.manager.Student"%>
<%@page import="kdata.manager.StudentManager"%>
<%@page import="kdata.manager.Sugang"%>
<%@page import="kdata.manager.SugangManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		StudentManager sm = new StudentManager();
		String name = request.getParameter("name");

		out.print(sm.selectByName(name));
	%>
</body>
</html>