<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>res ex01</h3>
	
	<a href="result01">model 객체 사용</a>
	<a href="result02">modelAndView 객체 사용</a>
	
	<a href="result03">modelAttr단일값</a>
	
	<form action="result04" method="post">
		<input type="text" name="name">
		<input type="text" name="age">
		<input type="submit" name="modelAttr객체">
	</form>

</body>
</html>