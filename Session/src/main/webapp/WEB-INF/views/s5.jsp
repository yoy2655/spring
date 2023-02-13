<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- session이 request보다 범위가 더 넓어서 session을 더 많이 쓰고 저장한다.
	 근데 request에도 들어가긴 들어간다고 보여주려고 한번 해봄 -->
s1: ${requestScope.sbean.s1 }<br>
s2: ${requestScope.sbean.s2 }<br>

s1: ${sessionScope.sbean2.s1 }<br>
s2: ${sessionScope.sbean2.s2 }<br>
</body>
</html>