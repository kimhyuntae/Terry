<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<ul>
		<li><a href="<%= request.getContextPath() %>/user/register.jsp">회원가입</a>
		<li><a href="login.jsp">로그인</a>
		<li><a href="<%= request.getContextPath() %>/list.kdata">회원 리스트</a>
		<li><a href="<%= request.getContextPath() %>/food.kdata">음식 리스트</a>		
	</ul>

</body>
</html>








