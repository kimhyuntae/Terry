<%@page import="kdata.project.dto.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- 라이브러리 추가함 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

		디테일.jsp

<%@ include file="../common/menu.jsp" %>

<%
	User user = (User)request.getAttribute("user");

	out.print(user.getId());
	out.print(user.getName());
	out.print(user.getProfile());
	
%>

<table border = "1">
      <tr>
         <th>사진</th>
         <td><img src="./profile/${requestScope.user.profile}"></td>
         <th>이름</th>
         <td><%=user.getName()%></td>
      </tr>
   </table>


</body>
</html>




