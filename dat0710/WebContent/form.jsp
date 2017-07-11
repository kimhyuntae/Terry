<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="<% out.print("color"); %>">

<%
	String num = request.getParameter("num");
	String name =request.getParameter("name");
	String gender =request.getParameter("gender");
	String url =request.getParameter("url");
%>

<table border="3" width="500">
	<tr>
		<th>학번</th>
		<td>
		<% out.print(num); %>
		</td>		
	</tr>
	
	<tr>
		<th>이름</th>
		<td>
		<a href ="<%= url %>"> <%= name %> </a>
		<% out.print(name);%>
		</td>		
	</tr>
	
	<tr>
		<th>성별</th>
		<td>		
		<% 
		if (gender==null) out.print("성별을 체크해주세요");
		else if(gender.equals("M")) out.print("남자");
		else if(gender.equals("F")) out.print("여자");
		%></td>		
	</tr>	
	
	<tr>
		<th>색</th>
		<td>
		<% out.print("color"); %>
		</td>		
	</tr>
		 
	</table>
<%
String num1 = request.getParameter("num");
String name1 =request.getParameter("name");
String gender1 =request.getParameter("gender");

out.print("<table border='1'><tr><th>학번</th><th>"+num1+"</th></tr>");
out.print("<tr><th>이름</th><th>"+name1+"</th></tr>");
out.print("<tr><th>성별</th><th>"+gender+"</th></tr>");
out.print("</table");

%>


</body>
</html>


