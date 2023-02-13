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
		<form:select path="s1">
			<form:option value="d1">one</form:option>
			<form:option value="d2">two</form:option>
			<form:option value="d3">three</form:option>
		</form:select>
		
		<form:select path="s2">
			<form:options items="${requestScope.li1 }"/><br>
		</form:select>
		
		<form:select path="s3">
			<form:options items="${requestScope.li2 }"/><br>
		</form:select>
		
		<form:select path="s4">
		<form:options items="${requestScope.li3 }" itemLabel="a1" itemValue="a2"/>
		</form:select>
		
		<!-- one, three는 checked이다. -->
		<!-- two는 hidden이다 -->
		<form:checkbox path="s5" value="d1"/>one	
		<form:checkbox path="s5" value="d2"/>two	
		<form:checkbox path="s5" value="d3"/>three<br>
		
		<!--(배열)d1, d3이 checked되어서 나온다.  -->
		<form:checkboxes items="${requestScope.li1}" path="s6"/><br>
		<!--(리스트)d1, d3이 checked되어서 나온다.  -->
		<form:checkboxes items="${requestScope.li2}" path="s7"/><br>
		
		<form:checkboxes items="${requestScope.li3 }" path="s8" itemLabel="a1" itemValue="a2"/><br>

		<form:radiobutton path="s9" value="d1"/>one
		<form:radiobutton path="s9" value="d2"/>two
		<form:radiobutton path="s9" value="d3"/>three<br>
		
		<form:radiobuttons path="s10" items="${requestScope.li1}" /><br>
		<form:radiobuttons path="s11" items="${requestScope.li2}" /><br>
	</form:form>
</body>
</html>