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
<p>東北
<div>
<button type="submit" name="aomori" value="青森">青森</button>
<button type="submit" name="miyagi" value="宮城">宮城</button>
<button type="submit" name="iwate" value="岩手">岩手</button>
</div>
<div>
<button type="submit" name="akita" value="秋田">秋田</button>
<button type="submit" name="fukushima" value="福島">福島</button>
<button type="submit" name="yamagata" value="山形">山形</button>
</div>
</form>
</body>
</html>