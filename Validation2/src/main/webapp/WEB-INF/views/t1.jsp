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
<!-- jsp에 개발자가 작성한 에러메시지를 만들어서 띄우고 싶을때는
properties파일에 에러메시지를 등록을 해서 띄울수 있다. 
Validation 프로젝트 에서 만든 error객체의 defaultMessage는 개발자가 작성한 에러메시지가 아니다-->
	<form:form action="check" method="post" modelAttribute="springBean">
	<!-- form:input path="d1"로 값을 계속 주입하고 있기 때문에
		 에러가 나도 input창에 계속 값이 유지되고 있다. -->
	d1: <form:input path="d1" type="text"/><br>
		<form:errors path="d1"/><br>
		<!--<sp:message code="${errors.getFieldError('d1').codes[0] }"/>
		여기서 codes에 0값을 넣어줘야한다.-->
	
	de: <form:input path="d2" type="text"/><br>
		<form:errors path="d2"/><br>
		
		<form:button type="submit">check</form:button>
	</form:form>
</body>
</html>