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
<title>不動産メニュー</title>
</head>
<body>
<h1 align=center>メニュー画面</h1>
<form action ="/Housing/Menu" method=post>
<div>
<p>買う
<button type="submit" name="newmansion" value="新築マンション">新築マンション</button>
<button type="submit" name="oldmansion" value="中古マンション">中古マンション</button>
<button type="submit" name="newhome" value="新築一戸建て">新築一戸建て</button>
<button type="submit" name="oldhome" value="中古一戸建て">中古一戸建て</button>
</div>
<div>
<p>借りる
<button type="submit" name="newmansion" value="新築マンション">新築マンション</button>
<button type="submit" name="oldmansion" value="中古マンション">中古マンション</button>
<button type="submit" name="newhome" value="新築一戸建て">新築一戸建て</button>
<button type="submit" name="oldhome" value="中古一戸建て">中古一戸建て</button>
</div>
</form>
</body>
</html>