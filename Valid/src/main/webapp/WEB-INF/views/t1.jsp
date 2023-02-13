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
<form:form action="check" method="post" modelAttribute="springBean">

d1:<form:input path="d1"/><br>
   <form:errors path="d1"/><br>
   
d2:<form:input path="d2"/><br>
   <form:errors path="d2"/><br>
  
d2:<form:input path="d3"/><br>
   <form:errors path="d3"/><br>

<form:button type="submit">check</form:button>   
</form:form>

</body>
</html>