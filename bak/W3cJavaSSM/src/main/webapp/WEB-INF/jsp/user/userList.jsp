<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/static/include/taglib.jsp"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>w3cjava</title>
</head>
<body>
	<a type="button" href="${ctx}/user/add">新增</a>
	<table style="border: 1px solid black">
		<thead>
			<tr>
				<td style="border: 1px solid black">ID</td>
				<td style="border: 1px solid black">登录名</td>
				<td style="border: 1px solid black">工号</td>
				<td style="border: 1px solid black">编辑</td>
				<td style="border: 1px solid black">删除</td>
			</tr>		
		</thead>
		<c:forEach var="user" items="${allUsers}" varStatus="status">
			<tr>
				<td style="border: 1px solid black">${user.id}</td>
				<td style="border: 1px solid black">${user.name}</td>
				<td style="border: 1px solid black">${user.age}</td>
				<td style="border: 1px solid black"><a href="${ctx}/user/edit?id=${user.id}">编辑</a></td>
				<td style="border: 1px solid black"><a href="${ctx}/user/delete?id=${user.id}">删除</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>