<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<a href="main">main</a><br>
	
	<form action="t1" method="get">
		id:<input type="text" name="d1"><br> 
		pw:<input type="password" name="d2"><br> 
		<button type="submit">check</button>
	</form>
	<form action="t2" method="get">
		id:<input type="text" name="d1"><br> 
		pw:<input type="password" name="d2"><br> 
		<button type="submit">check</button>
	</form>
	<form action="t3" method="get">
		id:<input type="text" name="id"><br> 
		pw:<input type="password" name="pw"><br> 
		<button type="submit">check</button>
	</form>
</body>
</html>