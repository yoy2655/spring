<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- 3.  -->
	<form:form modelAttribute="springBean">
		<form:hidden path="s1"/>	<!-- hong1 -->
		<form:input path="s2"/>		<!-- hong2 ->�������� �ش��ϴ� �ʵ���� �־�� �Ѵٴ� ���̴�.-->
		<form:password path="s3" showPassword="true"/>
		<form:textarea path="s4"/>
		<form:button disabled="true">check</form:button>
		

	</form:form>
</body>
</html>