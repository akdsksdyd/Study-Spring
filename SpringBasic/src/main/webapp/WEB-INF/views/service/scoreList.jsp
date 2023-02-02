<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>목록화면</h2>
	
	<c:forEach var="article" items="${list }" varStatus="num">
		이름: ${article.name } 
		국어점수: ${article.kor  }
		영어점수: ${article.eng } 
		<a href="delete?num=${num.index }">삭제</a>
		<br>
	</c:forEach>

</body>
</html>