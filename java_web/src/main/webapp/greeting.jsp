<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		섭섭이와 배우는 백엔드 웹 어플리케이션 수업(feat. jslim)
	</div>
	<hr/>
	<div align="right">
		<form action="greeting" method="post">
			<label>
				아이디 : 
				<input type="text" name="id">
			</label>
			<label>
				패스워드 : 
				<input type="password" name="pwd">
			</label>
			<button type="sumit">로그인</button>
		</form>
	</div>
</body>
</html>