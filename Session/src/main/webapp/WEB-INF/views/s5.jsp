<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- session�� request���� ������ �� �о session�� �� ���� ���� �����Ѵ�.
	 �ٵ� request���� ���� ���ٰ� �����ַ��� �ѹ� �غ� -->
s1: ${requestScope.sbean.s1 }<br>
s2: ${requestScope.sbean.s2 }<br>

s1: ${sessionScope.sbean2.s1 }<br>
s2: ${sessionScope.sbean2.s2 }<br>
</body>
</html>