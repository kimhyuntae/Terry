<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>scope1.jsp</h1>
	<form action="scope2.jsp">
		<ul>
			<li>page영역 : <input type="text" name="page" value="페이지영역">
			<li>request영역 : <input type="text" name="request" value="리퀘스트영역">
			<li>session영역 : <input type="text" name="session" value="세션영역">
			<li>application영역 : <input type="text" name="application"
				value="어플리케이션영역">
		</ul>
		<input type="submit" value="영역테스트">
	</form>
</body>
</html>