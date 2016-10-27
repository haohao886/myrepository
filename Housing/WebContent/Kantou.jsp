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
<title>絞り込み条件②</title>

<!-- Bootstrap CDN -->
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
<!-- Bootstrap CDN -->

</head>
<link rel="stylesheet" type="text/css" href="style_bg.css">
<body>
	<h1 align=center>絞り込み条件②</h1>
	<form action="/Housing/Area" method=post>
		<input type="hidden" name="condition"
			value=<%=request.getAttribute("condition")%>>
		<p>関東
		<div>
			<button type="submit" class="btn btn-info active"
				style="WIDTH: 80px; HEIGHT: 40px" name="tokyo" value="東京都">東京都</button>
			<button type="submit" class="btn btn-info active"
				style="WIDTH: 80px; HEIGHT: 40px" name="chiba" value="千葉県">千葉</button>
			<button type="submit" class="btn btn-info active"
				style="WIDTH: 80px; HEIGHT: 40px" name="saitama" value="埼玉県">埼玉</button>
			<button type="submit" class="btn btn-info active"
				style="WIDTH: 80px; HEIGHT: 40px" name="kanagawa" value="神奈川県">神奈川</button>
		</div>
		<br>
		<div>
			<button type="submit" class="btn btn-info active"
				style="WIDTH: 80px; HEIGHT: 40px" name="gunma" value="群馬県">群馬</button>
			<button type="submit" class="btn btn-info active"
				style="WIDTH: 80px; HEIGHT: 40px" name="tochigi" value="栃木県">栃木</button>
			<button type="submit" class="btn btn-info active"
				style="WIDTH: 80px; HEIGHT: 40px" name="ibaraki" value="茨城県">茨城</button>
			<!-- Bootstrap CDN -->
			<script
				src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js">

			</script>
			<!-- Bootstrap CDN -->
		</div>
	</form>
</body>
</html>