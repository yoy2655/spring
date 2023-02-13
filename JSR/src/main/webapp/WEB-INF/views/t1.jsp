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

<!-- 여기서 ..path="d1", ..path="d2" 할때 
d1, d2는 SpringBean에 있는 @AssertFalse@AssertTrue 변수이다 -->
<!-- 따라서,
	 d1은 라디오버튼 true선택하면 오류발생, 
	 d2는 라디오버튼 false선택하면 오류발생 -->

d1: <form:radiobutton path="d1" value="false"/>false
	<form:radiobutton path="d1" value="true"/>true<br>
	<form:errors path="d1"/><br>
d2: <form:radiobutton path="d2" value="false"/>false
	<form:radiobutton path="d2" value="true"/>true<br>
	<form:errors path="d2"/><br>
	
d3: <form:checkbox path="d3" value="check"/>check1<br>
	<form:errors path="d3"/><br>
	
d4: <form:checkbox path="d4" value="aa"/>check2<br>
	<form:errors path="d4"/><br>

d5: <form:input path="d5" type="text"/><br>
	<form:errors path="d5"/><br>
	
d6: <form:input path="d6" type="text"/><br>
	<form:errors path="d6"/><br>
	
d7: <form:input path="d7" type="text"/><br>
	<form:errors path="d7"/><br>
	
d8: <form:input path="d8" type="text"/><br>
	<form:errors path="d8"/><br>
	
d9: <form:input path="d9" type="text"/><br>
	<form:errors path="d9"/><br>	
	<form:button type="submit">check</form:button>
</form:form>
</body>
</html>