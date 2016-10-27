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
<body background="2.jpg">
<h1 align=center>物件検索結果</h1>
<table border=1 align=center>
<tr><th></th><th align=center>物件番号</th><th align=center>タイプ</th>
<th align=center>住所</th><th align=center>築年数</th><th align=center>エレベーター</th>
<th align=center>総戸数</th><th align=center>構造</th><th align=center>交通</th>
<th align=center>面積</th>
<th align=center>階数/総階数</th><th align=center>駐車場</th>
<th align=center>間取り</th><th align=center>向き</th><th align=center>家具付き</th>
<th align=center>価格</th>
<th align=center>賃料</th><th align=center>管理費</th><th align=center>敷金</th>
<th align=center>礼金</th><th align=center>駐車場費</th><th align=center>フラグ</th>
<th align=center>共益費</th><th align=center>仲介業者名</th><th align=center>連絡先</th>
<th align=center>住所</th><th align=center>資格</th><th align=center>担当者</th></tr>
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
	map.get("bldno")
%>
</td>
<td>
<%=
	map.get("type")
%>
</td>
<td>
<%=
	map.get("kenname")
%>
<%=
	map.get("address")
%>
</td>
<td>
<%=
	map.get("year")
%>
年
</td>
<td>
<%=
	map.get("elevator")
%>
</td>
<td>
<%=
	map.get("houses")
%>
戸
</td>
<td>
<%=
	map.get("kouzo")
%>
</td>
<td>
<%=
	map.get("linename")
%>
<%=
	map.get("station")
%>
<%=
	map.get("distance1")
%>
</td>
<td>
<%=
	map.get("menseki")
%>
m2
</td>
<td>
<%=
	map.get("floor")
%>
/
<%=
	map.get("rank")
%>
</td>

<td>
<%=
	map.get("park")
%>
</td>
<td>
<%=
	map.get("ldk")
%>
</td>
<td>
<%=
	map.get("direction")
%>
</td>
<td>
<%=
	map.get("furniture")
%>
</td>
<td>
<%=
	map.get("price")
%>
円
</td>
<td>
<%=
	map.get("cost")
%>
円
</td>
<td>
<%=
	map.get("mcost")
%>
円
</td>
<td>
<%=
	map.get("deposit")
%>
円
</td>
<td>
<%=
	map.get("keymoney")
%>
円
</td>
<td>
<%=
	map.get("parkcost")
%>
円
</td>
<td>
<%=
	map.get("typeflg")
%>
</td>
<td>
<%=
	map.get("expense")
%>
円
</td>
<td>
<%=
	map.get("brokername")
%>
</td>
<td>
<%=
	map.get("tele")
%>
</td>
<td>
<%=
	map.get("address2")
%>
</td>
<td>
<%=
	map.get("certs")
%>
</td>
<td>
<%=
	map.get("charge")
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