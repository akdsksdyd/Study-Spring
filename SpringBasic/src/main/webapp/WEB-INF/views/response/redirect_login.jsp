<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>redirect 사용 해 보기</h3>
	<form action="login" method="post">
		<input type="text" name="id">
		<input type="password" name="pw">
		<input type="submit" name="확인"> <br>
		<h1>${msg }</h1>
	</form>

</body>
</html>