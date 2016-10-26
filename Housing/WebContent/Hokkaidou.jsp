<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type=text/css>
body{
	text-align: center;
	}
div	{
	display=inline-flex;
	}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>絞り込み条件②</title>
</head>
<body>
<h1 align=center>絞り込み条件②</h1>
<form action ="/Housing/Area" method=post>
<input type="hidden" name="condition" value=<%= request.getAttribute("condition") %>>
<p>北海道
<div>
<button type="submit" name="hokkaidou" value="北海道">北海道</button>
</div>
</form>
</body>
</html>