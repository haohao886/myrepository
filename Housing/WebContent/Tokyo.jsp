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
<title>絞り込み条件③</title>
</head>

<link rel="stylesheet" type="text/css" href="style_bg.css">
<!-- Bootstrap CDN -->
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
<!-- Bootstrap CDN -->

<body>
	<h1 align=center>絞り込み条件③</h1>
	<form action="/Housing/Research" method=post>
		<input type="hidden" name="condition"
			value=<%=request.getAttribute("condition")%>> <input
			type="hidden" name="area" value=<%=request.getAttribute("area")%>>
		<h2 align=center>23区エリア</h2>
		<div>
			<input type="checkbox" name="area2" value="千代田区" />千代田区 <input
				type="checkbox" name="area2" value="中央区" />中央区 <input
				type="checkbox" name="area2" value="港区" />港区 <input type="checkbox"
				name="area2" value="新宿区" />新宿区 <input type="checkbox" name="area2"
				value="文京区" />文京区 <input type="checkbox" name="area2" value="台東区" />台東区
		</div>
		<div>
			<input type="checkbox" name="area2" value="墨田区" />墨田区 <input
				type="checkbox" name="area2" value="江東区" />江東区 <input
				type="checkbox" name="area2" value="品川区" />品川区 <input
				type="checkbox" name="area2" value="目黒区" />目黒区 <input
				type="checkbox" name="area2" value="大田区" />大田区 <input
				type="checkbox" name="area2" value="世田谷区" />世田谷区
		</div>
		<div>
			<input type="checkbox" name="area2" value="渋谷区" />渋谷区 <input
				type="checkbox" name="area2" value="中野区" />中野区 <input
				type="checkbox" name="area2" value="杉並区" />杉並区 <input
				type="checkbox" name="area2" value="豊島区" />豊島区 <input
				type="checkbox" name="area2" value="北区" />北区
		</div>
		<div>
			<input type="checkbox" name="area2" value="荒川区" />荒川区 <input
				type="checkbox" name="area2" value="板橋区" />板橋区 <input
				type="checkbox" name="area2" value="練馬区" />練馬区 <input
				type="checkbox" name="area2" value="足立区" />足立区 <input
				type="checkbox" name="area2" value="葛飾区" />葛飾区 <input
				type="checkbox" name="area2" value="江戸川区" />江戸川区
		</div>
		<h2 align=center>物件条件</h2>

		<div>
			<p>
				価格 <select name="kakaku1">
					<option value=1000000>100万</option>
					<option value=10000000>1000万</option>
					<option value=50000000>5000万</option>
				</select> 円以上 <select name="kakaku2">
					<option value=1000000>100万</option>
					<option value=10000000>1000万</option>
					<option value=50000000>5000万</option>
				</select> 円以下
		</div>
		<div>
			<p>
				面積 <select name="menseki1">
					<option value=50>50m2</option>
					<option value=100>100m2</option>
					<option value=150>150m2</option>
				</select> 以上 <select name="menseki2">
					<option value=50>50m2</option>
					<option value=100>100m2</option>
					<option value=150>150m2</option>
				</select> 以下
		</div>
		<div>
			<p>
				間取り <input type="checkbox" name="madori" value="1" />1K/1DK/1LDK <input
					type="checkbox" name="madori" value="2" />2K/2DK2/LDK <input
					type="checkbox" name="madori" value="3" />3K/2DK/2LDK <input
					type="checkbox" name="madori" value="4" />4K以上
		</div>
		<button class="btn btn-large btn-primary"
			style="WIDTH: 80px; HEIGHT: 40px" type="submit" name="research"
			value="検索">検索</button>
	</form>
	<!-- Bootstrap CDN -->
	<script
		src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js">
	</script>
	<!-- Bootstrap CDN -->
</body>
</html>