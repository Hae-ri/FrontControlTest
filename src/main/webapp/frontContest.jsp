<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<a href="Korea.do">Korea.do ����</a><br>
	<a href="http://localhost:8888/frontControlTest/japan.do">japan.do ����</a><br>
	<a href="http://localhost:8888<%= request.getContextPath() %>/usa.do">usa.doinsert.do ����</a><br>
	<a href="<%= request.getContextPath() %>/france.do">france.do ����</a><br>
	
</body>
</html>