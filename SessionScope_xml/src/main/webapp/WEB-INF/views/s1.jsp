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
<!-- sbean2���� ��쿡�� root-context.xml���� scope="session"���� �������ϰ� 
     id(sbean2)�� �̸��� �����Ͽ���.
     �׷��� Model�� ���� ���� �������� �ʾƵ� sessionScope�� �̸��� ���� �� �ִ�.(���) -->

s5: ${requestScope.sbean3.s5 }<br>
s6: ${requestScope.sbean3.s6 }<br>

s7: ${requestScope.sbean4.s7 }<br>
s8: ${requestScope.sbean4.s8 }<br>
</body>
</html>