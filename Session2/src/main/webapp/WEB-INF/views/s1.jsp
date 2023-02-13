<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- Model로 값을 전달했으니까 requestScope로 값을 출력한다.(sessionScope는 값이 안나온다. -->
s1: ${requestScope.sb1.s1 }<br>
s2: ${requestScope.sb1.s2 }<br>

s3: ${requestScope.sb2.s3 }<br>

s4: ${requestScope.sb3.s4 }<br>
</body>
</html>