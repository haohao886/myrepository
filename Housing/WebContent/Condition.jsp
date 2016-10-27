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
<style>
body {
	text-align: center;
}

div {display =inline-flex;

}
</style>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>絞り込み条件①</title>
<link rel="stylesheet" type="text/css" href="style_bg.css">
</head>
	<body>
		<h1 align=center>絞り込み条件①</h1>
		<form action="/Housing/Condition" method=post>
			<input type="hidden" name="condition"
				value=<%=request.getAttribute("condition")%>>
			<div>全国</div>
			<br>
			<div>
				<button class="btn btn-large btn-primary"
					style="WIDTH: 80px; HEIGHT: 40px" type="submit" name="hokkaidou"
					value="北海道">北海道</button>
				<button class="btn btn-large btn-primary"
					style="WIDTH: 80px; HEIGHT: 40px" type="submit" name="touhoku"
					value="東北">東北</button>
				<button class="btn btn-large btn-primary"
					style="WIDTH: 80px; HEIGHT: 40px" type="submit" name="kantou"
					value="関東">関東</button>
				<button class="btn btn-large btn-primary"
					style="WIDTH: 80px; HEIGHT: 40px" type="submit" name="chubu"
					value="中部">中部</button>
			</div>
			<div>
				<button class="btn btn-large btn-primary"
					style="WIDTH: 80px; HEIGHT: 40px" type="submit" name="kinki"
					value="近畿">近畿</button>
				<button class="btn btn-large btn-primary"
					style="WIDTH: 80px; HEIGHT: 40px" type="submit" name="shikoku"
					value="四国">四国</button>
				<button class="btn btn-large btn-primary"
					style="WIDTH: 80px; HEIGHT: 40px" type="submit" name="chugoku"
					value="中国">中国</button>
				<button class="btn btn-large btn-primary"
					style="WIDTH: 80px; HEIGHT: 40px" type="submit" name="kyushuu"
					value="九州">九州</button>

				<!-- Bootstrap CDN -->
				<script
					src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
				<!-- Bootstrap CDN -->
			</div>
		</form>
	</body>
</html>