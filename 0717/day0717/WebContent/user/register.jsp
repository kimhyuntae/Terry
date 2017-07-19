<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/ht.css" type="text/css" />

<script src="../js/jquery-3.2.1.js"></script>
<script>
	$(function() {
		//alert("no");
		$("#idcheck").click(function() {

			//	alert("no");
			
			
			$.ajax({ //비동기 통식으로 화면 변화없이 DB에 갔다옴
				url : "../idcheck.kdata",
				dataType : "text",
				data : {
					"id" : $("#id").val()
				}, //key:value
				success : function(data) {
					//console.log("success");
					//console.log(data);
					
					if(data==0)
						$("#msg").html("중복");
					else
						$("#msg").html("사용가능");
				},
				error : function() {
					console.log("error");
				}
			});

		});

	});
</script>

</head>
<body>
	회원가입-register.jsp
	<!-- //서버에 직접 갈수 있음 -->

	<%@ include file="../common/menu.jsp"%>

//파일 업로드는 post방식으로!
<form action="../register.kdata" method="post" enctype="multipart/form-data">
<fieldset>
	<div id="table">
		<table>
		<tr>
			<th>아이디:
			<th><input type="text" placeholder="아이디" name="id" id="id" maxlength="10">
				<input type="button" value="중복확인" id="idcheck">
				<span id="msg"></span>
		</tr>
		<tr>
			<th>비밀번호 :
			<th><input type="password" placeholder="비밀번호" name="pw" maxlength="10">
		</tr>
		<tr>
			<th>이름 :
			<th><input type="text" placeholder="이름" name="name" maxlength="10">
		<tr>
			<th>프로필 사진 :
			<th><input type="file" placeholder="파일" name="file">
		</table>
		<input type="submit" value="가입하기" id="sub">
	</div>
</fieldset>
</form>


</body>
</html>