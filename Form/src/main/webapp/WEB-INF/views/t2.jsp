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
<!-- 스프링에서 Form 태그형태로 되어있는 커스텀 태그를 제공함-->
<!-- =>Model객체에 들어있는 값을 from요소에 주입시킬 수 있다. -->
<!-- =>보통 수정페이지 개발할때 많이 씀-->
<form:form modelAttribute="springBean">
	이름: <form:input path="name"/><br>
	아이디 : <form:input path="id"/><br>
	비밀번호 : <form:input path="pw"/><br>
	주소 : <form:input path="adr"/><br>
	<button type="submit">check</button>
</form:form>
</body>
</html>