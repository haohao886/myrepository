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
<p>関東
<div>
<button type="submit" name="tokyo" value="東京">東京</button>
<button type="submit" name="chiba" value="千葉">千葉</button>
<button type="submit" name="saitama" value="埼玉">埼玉</button>
<button type="submit" name="kanagawa" value="神奈川">神奈川</button>
</div>
<div>
<button type="submit" name="gunma" value="群馬">群馬</button>
<button type="submit" name="tochigi" value="栃木">栃木</button>
<button type="submit" name="ibaraki" value="茨城">茨城</button>
</div>
</form>
</body>
</html>