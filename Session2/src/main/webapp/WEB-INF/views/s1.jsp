<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- Model�� ���� ���������ϱ� requestScope�� ���� ����Ѵ�.(sessionScope�� ���� �ȳ��´�. -->
s1: ${requestScope.sb1.s1 }<br>
s2: ${requestScope.sb1.s2 }<br>

s3: ${requestScope.sb2.s3 }<br>

s4: ${requestScope.sb3.s4 }<br>
</body>
</html>