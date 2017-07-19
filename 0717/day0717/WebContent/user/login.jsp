<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/ht.css" type="text/css" />
<script src="../js/jquery-3.2.1.js"></script>
</head>
<body>

<%-- 	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		if (id.equals("test") && pw.equals("1234")) {
			out.print("로그인 성공");
			
		} else {
			out.print("로그인 실패");
			response.sendRedirect("login.html");
		}
	%>
 --%>
 
 

	<form action="../login.kdata" method="get" id="form1">
		<!-- 가짜 url로 접근 -->
		<fieldset>
		<div id="table">
		<table>
			<tr>			
				<th>아이디 : 
				<th><input type="text" name="id" id="id" maxlength="10">
			</tr>
			<tr>		
				<th>비밀번호 :
				<th><input type="password" name="pw" id="pw" maxlength="10">
			</tr>	
		</table>
			<input type="submit" value="로그인">
			</div>
		</fieldset>
	</form>





	<!-- <form action="login.jsp" method="get" id="form2">
		jsp로 접근
		<fieldset>
			<ul>
				<li>js
				<li>아이디 : <input type="text" name="id" id="id">
				<li>비밀번호 : <input type="password" name="pw" id="pw">
				<li><input type="submit">
			</ul>
		</fieldset>
	</form> -->


</body>
</html>