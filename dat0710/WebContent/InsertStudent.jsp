<%@page import="java.sql.SQLException"%>
<%@page import="kdata.manager.Student"%>
<%@page import="kdata.manager.StudentManager"%>
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
	String snum = request.getParameter("snum");
	String sname = request.getParameter("sname");
	String sgender = request.getParameter("sgender");

	StudentManager manager = new StudentManager();	
	Student s = new Student(snum, sname, sgender);
	try{
	
	int result = manager.insert(s);
	
	if(result==0) out.print("실패");
	else
		out.print("성공");
	}catch(SQLException e){
		e.printStackTrace();
	}
	
%>

</body>
</html>