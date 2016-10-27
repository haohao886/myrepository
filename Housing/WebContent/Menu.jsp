<%@ page language="java" contentType="text/html; UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type=text/css>
body {
	text-align: center;
}

div {display =inline-flex;

}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>不動産メニュー</title>
<!-- Bootstrap CDN -->
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
<!-- Bootstrap CDN -->
</head>
<body>

	<h1 align=center>メニュー画面</h1>
	<form action="/Housing/Menu" method=post>
		<div class="bg-info" >
			<p>
				<h2 align=center>買う</h2>
				<button type="submit" class="btn btn-info active" name="newmansion" value="新築マンション">新築マンション</button>
				<button type="submit" class="btn btn-info active" name="oldmansion" value="中古マンション">中古マンション</button>
				<button type="submit" class="btn btn-info active" name="newhome" value="新築一戸建て">新築一戸建て</button>
				<button type="submit" class="btn btn-info active" name="oldhome" value="中古一戸建て">中古一戸建て</button>
		</div>
		<div class="bg-warning" >
			<p>
				<h2 align=center>借りる</h2>
				<button type="submit" class="btn btn-warning active" name="newmansion" value="新築マンション">新築マンション</button>
				<button type="submit" class="btn btn-warning active" name="oldmansion" value="中古マンション">中古マンション</button>
				<button type="submit" class="btn btn-warning active" name="newhome" value="新築一戸建て">新築一戸建て</button>
				<button type="submit" class="btn btn-warning active" name="oldhome" value="中古一戸建て">中古一戸建て</button>


				<!-- Bootstrap CDN -->
				<script
					src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
				<!-- Bootstrap CDN -->
		</div>
	</form>
</body>
</html>