<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<a href="Korea.do">Korea.do 연결</a><br>
	<a href="http://localhost:8888/frontControlTest/japan.do">japan.do 연결</a><br>
	<a href="http://localhost:8888<%= request.getContextPath() %>/usa.do">usa.doinsert.do 연결</a><br>
	<a href="<%= request.getContextPath() %>/france.do">france.do 연결</a><br>
	
</body>
</html>