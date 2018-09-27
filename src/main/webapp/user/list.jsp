<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户列表</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>名字</th>
				<th>性别</th>
				<th>QQ</th>
				<th>密码</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${userList}" var="user">
				<tr>
				<td>${user.name}</td>
				<td>${user.sex}</td>
				<td>${user.qq}</td>
				<td>${user.password}</td>
				<td align="center"><a href="edit.html?id=${user.id}">Edit</a> | <a href="delete.html?id=${user.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>