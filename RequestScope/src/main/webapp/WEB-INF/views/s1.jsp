<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
d1: ${requestScope.d1 }
d1: ${param.d1 }
<!-- forward니까 requestScope.d1은 뜨고 param.d1은 안뜬다. -->
<!-- url은 바뀌지 않는다. -->
</body>
</html>