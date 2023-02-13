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
<form:form modelAttribute="tt">
	이름: <form:input path="name"/><br>
	아이디 : <form:input path="id"/><br>
	비밀번호 : <form:input path="pw"/><br>
	주소 : <form:input path="adr"/><br>
	<button type="submit">check</button>
</form:form>
</body>
</html>