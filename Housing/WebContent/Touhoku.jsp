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

<link rel="stylesheet" type="text/css" href="style_bg.css">
<!-- Bootstrap CDN -->
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
<!-- Bootstrap CDN -->

<body>
<h1 align=center>絞り込み条件②</h1>
<form action ="/Housing/Area" method=post>
<input type="hidden" name="condition" value=<%= request.getAttribute("condition") %>>
<p>東北
<div>
<button type="submit" class="btn btn-info active"
				style="WIDTH: 80px; HEIGHT: 40px" name="aomori" value="青森">青森</button>
<button type="submit" class="btn btn-info active"
				style="WIDTH: 80px; HEIGHT: 40px" name="miyagi" value="宮城">宮城</button>
<button type="submit" class="btn btn-info active"
				style="WIDTH: 80px; HEIGHT: 40px" name="iwate" value="岩手">岩手</button>
</div>
<br>
<div>
<button type="submit" class="btn btn-info active"
				style="WIDTH: 80px; HEIGHT: 40px" name="akita" value="秋田">秋田</button>
<button type="submit" class="btn btn-info active"
				style="WIDTH: 80px; HEIGHT: 40px" name="fukushima" value="福島">福島</button>
<button type="submit" class="btn btn-info active"
				style="WIDTH: 80px; HEIGHT: 40px" name="yamagata" value="山形">山形</button>
</div>
</form>
	<!-- Bootstrap CDN -->
	<script
		src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js">
	</script>
	<!-- Bootstrap CDN -->
</body>
</html>