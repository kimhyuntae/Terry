<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>scope3.jsp</h1>
	<%
		String pageS = (String) pageContext.getAttribute("PAGE");
		String requS = (String) request.getAttribute("REQUEST");
		String sessS = (String) session.getAttribute("SESSION"); //브라우저를 끄고 다시 시작시킨거면 세션이 다시 만들어지게된다.
		String appS = (String) application.getAttribute("APP");

		out.print(pageS + "<br>");
		out.print(requS + "<br>");
		out.print(sessS + "<br>");
		out.print(appS + "<br>");
	%>
</body>
</html>