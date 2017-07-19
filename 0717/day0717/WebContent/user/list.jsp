<%@page import="kdata.project.dto.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- 라이브러리 추가함 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>

table {
	height: 33%; align : "center";
	width: 50%;
	border: "1";
	border-collapse: separate;
	border-spacing: 2px;
	align: "center";
}


</style>

</head>
<body>
	<!-- 회원 리스트를 만듦 -->
	회원 리스트-list.jsp

	<%@ include file="../common/menu.jsp"%>

	<%
		List<User> list = (List<User>) request.getAttribute("list");
	%>
	${requestScope.list}
	<!-- 위에와 같다 -->
	${list}
	<!-- 위에와 같다 -->

	<table>
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>프로필</th>
		</tr>
		<%
			for (int i = 0; i < list.size(); i++) {
		%>


		<tr>
			<th><a href="detail.kdata?id=<%=list.get(i).getId()%>"><%=list.get(i).getId()%></a>
			<th><%=list.get(i).getName()%>
			<th><%=list.get(i).getProfile()%>
		</tr>
		<%
			}
		%>

	</table>

	<%-- <c:forEach items="${list}" var="user">
		<tr>
			<td>${user.id }</td>
			<td>${user.name }</td>
			<td>${user.profile }</td>
		</tr>
	</c:forEach> --%>

	<%-- 
	<c:forEach items="${list}" var="user">
	
		<%
			for (int i = 0; i < list.size(); i++) {
		%>
		<tr>
			<td><a href="detail.kdata id=<%=list.get(i).getId()%> "><%=list.get(i).getId()%></a>${user.id }</td>
			<td>${user.name }</td>
			<td>${user.profile }</td>
		</tr>
		<%
			}
		%>

	</c:forEach>
 --%>



</body>
</html>












