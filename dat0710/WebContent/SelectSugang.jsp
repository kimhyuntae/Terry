<%@page import="kdata.manager.Student"%>
<%@page import="kdata.manager.StudentManager"%>
<%@page import="kdata.manager.Sugang"%>
<%@page import="kdata.manager.SugangManager"%>
<%@page import="java.util.List"%>
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
		StudentManager sm = new StudentManager();
		SugangManager sgm = new SugangManager();
		List<Sugang> list = sgm.selectAll();

		//String name = request.getParameter("name");

		out.print("<table width='100%' border='1'>");
		out.print("<tr>");
		out.print("<th>");
		out.print("학번");
		out.print("</th>");
		out.print("<th>");
		out.print("이름");
		out.print("</th>");
		out.print("<th>");
		out.print("과목명");
		out.print("</th>");
		out.print("</tr>");
		for (int i = 0; i < list.size(); i++) {
			out.print("<tr>");
			out.print("<th>");
			out.print(list.get(i).getSnum());
			out.print("</a>");
			out.print("</th>");
			out.print("<th>");

			//out.print(list.get(i).getSname());			
			Sugang s = list.get(i);
			out.print("<a href='Select1.jsp?name=" + s.getSname() + "'>" + s.getSname() + "</a>");

			out.print("</th>");
			out.print("<th>");
			out.print(list.get(i).getSubname());
			out.print("</th>");
			out.print("</tr>");
		}
		out.print("</table>");
	%>





</body>
</html>