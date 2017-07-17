<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	회원가입-register.jsp
	<!-- //서버에 직접 갈수 있음 -->
		
<%@ include file="../common/menu.jsp" %>		


<form action="../.register.kdata">
<fieldset>
		<ul>
			<li>  아이디    : <input type="text" value="아이디" name="id">
			<li>  비밀번호 : <input type="password" value="비밀번호" name="pw">
			<li>  이름       : <input type="text" value="이름" name="name">
			<li>프로필 사진 : <input type="file" value="파일" name="file">
		</ul>
</fieldset>
		<input type="submit" value="회원가입">
</form>


</body>
</html>