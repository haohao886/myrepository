<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Bootstrap CDN -->
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
<!-- Bootstrap CDN -->
<style type=text/css>
body{
	text-align: center;
	}
div	{
	display=inline-flex;
	}
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>絞り込み条件①</title>

</style>
</head>
<link rel="stylesheet" type="text/css" href="style_bg.css">
<body background="3.jpg">
<h1 align=center>絞り込み条件②</h1>
<form action ="/Housing/Area" method=post>
<input type="hidden" name="condition" value=<%= request.getAttribute("condition") %>>
<p>関東
<div>
<button class="btn btn-large btn-primary"
					style="WIDTH: 80px; HEIGHT: 40px" type="submit" name="tokyo" value="東京都">東京都</button>
<button class="btn btn-large btn-primary"
					style="WIDTH: 80px; HEIGHT: 40px" type="submit" name="chiba" value="千葉県">千葉</button>
<button class="btn btn-large btn-primary"
					style="WIDTH: 80px; HEIGHT: 40px" type="submit" name="saitama" value="埼玉県">埼玉</button>
<button class="btn btn-large btn-primary"
					style="WIDTH: 80px; HEIGHT: 40px" type="submit" name="kanagawa" value="神奈川県">神奈川</button>
</div>
<div>
<button class="btn btn-large btn-primary"
					style="WIDTH: 80px; HEIGHT: 40px" type="submit" name="gunma" value="群馬県">群馬</button>
<button class="btn btn-large btn-primary"
					style="WIDTH: 80px; HEIGHT: 40px" type="submit" name="tochigi" value="栃木県">栃木</button>
<button class="btn btn-large btn-primary"
					style="WIDTH: 80px; HEIGHT: 40px" type="submit" name="ibaraki" value="茨城県">茨城</button>
</div>
</form>
</body>
</html>