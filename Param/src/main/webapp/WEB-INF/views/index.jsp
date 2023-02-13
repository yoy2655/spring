<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<a href="t1?d1=10&d2=20&d3=40">t1</a>
	<form action="t2" method="post">
		d1:<input type="text" name="d1"><br> 
		d2:<input type="text" name="d2"><br> 
		d3: <input type="checkbox" name="d3" value="30">30 
		<input type="checkbox" name="d3" value="40">40
		<button type="submit">check</button>
	</form>
	<br>
	<a href="t3?d1=10&d2=20&d3=30&d3=40">t3</a> <br>
	<a href="t4?d1=10&d2=20&d3=30&d3=40">t4</a> <br>
	
	<a href="t5?d1=10">t5</a>
	<a href="t6/10/20/30">t6</a><br>
</body>
</html>