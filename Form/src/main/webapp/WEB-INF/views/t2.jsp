<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- ���������� Form �±����·� �Ǿ��ִ� Ŀ���� �±׸� ������-->
<!-- =>Model��ü�� ����ִ� ���� from��ҿ� ���Խ�ų �� �ִ�. -->
<!-- =>���� ���������� �����Ҷ� ���� ��-->
<form:form modelAttribute="springBean">
	�̸�: <form:input path="name"/><br>
	���̵� : <form:input path="id"/><br>
	��й�ȣ : <form:input path="pw"/><br>
	�ּ� : <form:input path="adr"/><br>
	<button type="submit">check</button>
</form:form>
</body>
</html>