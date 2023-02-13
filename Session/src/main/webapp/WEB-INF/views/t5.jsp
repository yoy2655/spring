<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
s1: ${sessionScope.sbean.s1 }<br>
s2: ${sessionScope.sbean.s2 }<br>

s1: ${sessionScope.sbean2.s1 }<br>
s2: ${requestScope.sbean2.s2 }<br>

<!-- sessionScope.sbean.s1은 되는데
왜 requestScope.sbean.s1은 안되냐면 요청이 달라졌기 때문이다. 세션작업을 줘야한다. -->
</body>
</html>