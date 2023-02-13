<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form:form action="check" modelAttribute="springBean" method="post">
d1: <form:input path="d1" type="text"/><br>
	<form:errors path="d1"/><br>
	
d2: <form:input path="d2" type="text"/><br>
	<form:errors path="d2"/><br>
	
d3: <form:input path="d3" type="text"/><br>
	<form:errors path="d3"/><br>
	
d4: <form:input path="d4" type="text"/><br>
	<form:errors path="d4"/><br>
	
d5: <form:input path="d5" type="text"/><br>
	<form:errors path="d5"/><br>	
	
d6: <form:input path="d6" type="text"/><br>
	<form:errors path="d6"/><br>
	
d7: <form:input path="d7" type="text"/><br>
	<form:errors path="d7"/><br>	
		
	<form:button type="submit">check</form:button>
</form:form>
</body>
</html>