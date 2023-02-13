<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
s1: ${requestScope.sbean1.s1 }<br>
s2: ${requestScope.sbean1.s2 }<br>

s3: ${sessionScope.sbean2.s3 }<br>
s4: ${sessionScope.sbean2.s4 }<br>
<!-- sbean2같은 경우에는 root-context.xml에서 scope="session"으로 값저장하고 
     id(sbean2)로 이름을 지정하였다.
     그래서 Model에 따로 값을 저장하지 않아도 sessionScope로 이름을 받을 수 있다.(출력) -->

s5: ${requestScope.sbean3.s5 }<br>
s6: ${requestScope.sbean3.s6 }<br>

s7: ${requestScope.sbean4.s7 }<br>
s8: ${requestScope.sbean4.s8 }<br>
</body>
</html>