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
<title>絞り込み条件①</title>
</head>
<body>
<h1 align=center>絞り込み条件①</h1>
<form action ="/Housing/Condition" method=post>
<input type="hidden" name="condition" value=<%= request.getAttribute("condition") %>>
<p>全国
<div>
<button type="submit" name="hokkaidou" value="北海道">北海道</button>
<button type="submit" name="touhoku" value="東北">東北</button>
<button type="submit" name="kantou" value="関東">関東</button>
<button type="submit" name="chubu" value="中部">中部</button>
</div>
<div>
<button type="submit" name="kinki" value="近畿">近畿</button>
<button type="submit" name="shikoku" value="四国">四国</button>
<button type="submit" name="chugoku" value="中国">中国</button>
<button type="submit" name="kyushuu" value="九州">九州</button>
</div>
</form>
</body>
</html>