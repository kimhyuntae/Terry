<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style>
/* css영역 */
	body{background-color:gold; color:red}
</style>

<script>
/* JavaScript영역 */
 function test(){
	window.alert("JavaScript 테스트!");
}
 
</script>

</head>
<body onload="test()">

<% //jsp 코드임을 선언 -> 서버에서 해석
	
	Class.forName("java.lang.Object");
	out.print("<h1> jsp 영역 1</h1>");
	
	for(int i=1; i<=10; i++)
		out.print("hello<br>");

%>
<h1>html 영역~~</h1>
<% 
	out.print("jsp 영역 2");


%>
http://localhost:7777/day0710/test.jsp
</body>
</html>
