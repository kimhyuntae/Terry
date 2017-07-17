<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>scope2.jsp</h1>
	<%
		String pageScope = request.getParameter("page");
		String requestScope = request.getParameter("request");
		String sessionScope = request.getParameter("session");
		String applicationScope = request.getParameter("application");

		out.print("pageScope" + pageScope + "<br>");
		out.print("requestScope" + requestScope + "<br>");
		out.print("sessionScope" + sessionScope + "<br>");
		out.print("applicationScope" + applicationScope + "<br>");

		//scope에 저장 - .setAttribute();
		pageContext.setAttribute("PAGE", pageScope); //페이지 영역에 PAGE이름으로 변수 pageScope를 저장
		request.setAttribute("REQUEST", requestScope);
		session.setAttribute("SESSION", sessionScope);
		application.setAttribute("APP", applicationScope);

		//페이지 이동 - 리다이렉트
		response.sendRedirect("scope3.jsp");

		//페이지 이동 - 포워드
		/* RequestDispatcher dispatcher = request.getRequestDispatcher("scope3.jsp");
		dispatcher.forward(request, response); */
		//request.getRequestDispatcher("scope3.jsp").forward(request, response);
	%>
</body>
</html>