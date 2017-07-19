<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 동적으로 변환해서 여러번 사용할 수 있게 함 -->

<h1>Error</h1>
<hr>
<% 
	out.print(request.getAttribute("errorMsg"));
%>

${requestScope.errorMsg}		<!-- EL에서 -->
${errorMsg}						<!-- 이렇게 짧게 써도 알아서 찾아감 -->


</body>
</html>