<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style>
table {
	
	align:"center";
	width: 50%;
	border: gray;
	border-collapse: separate;
	border-spacing: 2px;
	
}

th{
	padding: 15px;
	border: none;
	border-left: 5px solid #fff;
	border-bottom: 1px solid #DDD;
	background: white;
	font-weight: normal;
	text-align: center;
	/* text-shadow: 0 1px #FFF; */
	vertical-align: middle;
}

td {
	padding: 15px;
	border: none;
	border-bottom: 1px solid #DDD;
	text-align: left;
	vertical-align: baseline;
}

input {
	padding: 15px;
	border: none;
	border-bottom: 1px solid #DDD;
	text-align: center;
	vertical-align: baseline;}
	
fieldset {	
border:none; 
background-color:rgba(255, 255, 255, 0.5); 
padding:3px; 
vertical-align:top; 
display:block; 
border-bottom:3px solid #FFFFFF; 

}

#confirm{

}

</style>


</head>
<body>
	회원가입-register.jsp
	<!-- //서버에 직접 갈수 있음 -->
		
<%@ include file="../common/menu.jsp" %>		


<form action="../register.kdata">
<fieldset>
		<table>
		<tr>
			<th>  아이디    : 
		<th>	<input type="text" placeholder="아이디" name="id">
				<input type="button" value="중복확인" id="confirm" ></tr>
			<tr><th>  비밀번호 : <th><input type="password" placeholder="비밀번호" name="pw"></tr>
			<tr><th>  이름       : <th> <input type="text" placeholder="이름" name="name">
			<tr><th>프로필 사진 :  <th><input type="file" placeholder="파일" name="file">
			
		</table>
</fieldset>
		<input type="submit" value="회원가입">
</form>


</body>
</html>