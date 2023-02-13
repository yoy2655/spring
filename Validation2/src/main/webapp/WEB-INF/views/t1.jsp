<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- jsp�� �����ڰ� �ۼ��� �����޽����� ���� ���� ��������
properties���Ͽ� �����޽����� ����� �ؼ� ���� �ִ�. 
Validation ������Ʈ ���� ���� error��ü�� defaultMessage�� �����ڰ� �ۼ��� �����޽����� �ƴϴ�-->
	<form:form action="check" method="post" modelAttribute="springBean">
	<!-- form:input path="d1"�� ���� ��� �����ϰ� �ֱ� ������
		 ������ ���� inputâ�� ��� ���� �����ǰ� �ִ�. -->
	d1: <form:input path="d1" type="text"/><br>
		<form:errors path="d1"/><br>
		<!--<sp:message code="${errors.getFieldError('d1').codes[0] }"/>
		���⼭ codes�� 0���� �־�����Ѵ�.-->
	
	de: <form:input path="d2" type="text"/><br>
		<form:errors path="d2"/><br>
		
		<form:button type="submit">check</form:button>
	</form:form>
</body>
</html>