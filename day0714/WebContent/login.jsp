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
	
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		if (id.equals("test") && pw.equals("1234")){
			out.print("로그인 성공");
		//response.sendRedirect("main.jsp");
		}
		else{
			out.print("로그인 실패");
		response.sendRedirect("login.html");
		}
	%>


</body>
</html>