<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type=text/css>
	body {
    text-align: center;
	}
	div{
	display=inline-flex;
	}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>物件検索結果</title>
</head>
<body>
<h1 align=center>物件検索結果</h1>
<table border=1 align=center>
<tr><th></th><th align=center>物件名</th><th align=center>都道府県</th><th align=center>価格</th><th align=center>面積</th><th align=center>間取り</th></tr>
<%
	ArrayList list = (ArrayList)request.getAttribute("list");
	for(int i=0; i<list.size(); i++) {
	HashMap map=(HashMap)list.get(i);
%>
<tr>
<td>
<%= i+1 %>
</td>
<td>
<%=
	map.get("")
%>
</td>
<td>
<%=
	map.get("")
%>
</td>
<td>
<%=
	map.get("")
%>
</td>
<td>
<%=
	map.get("")
%>
</td>
<td>
<%=
	map.get("")
%>
</td>
</tr>
<%
	}
%>
</table>
<form action ="/Housing" method=post>
<div>
<input type="submit" name="reset" value="メニューへ">
</div>
</form>
</body>
</html>