<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>${entity.id>0?'修改':'新增' }</title>
<script src="https://cdn.bootcss.com/jquery/1.10.2/jquery.min.js">
</script>
</head>
<body>
	<form action="${entity.id>0?'update.html':'create.html' }" method="post">
		<input type="hidden" name="id" value="${entity.id }">
		<table>
			<tr>
				<td>user name</td>
				<td><input id="name" name="name" value="${entity.name}"></td>
			</tr>
			<tr>
				<td>测试单选</td>
				<td>
					<input type="radio" name="${entity.id}" value="1"   >a
					<input type="radio" name="${entity.id}" value="2"  >b
				</td>
			</tr>
			<tr>
				<td>user sex</td>
				<td><input name="sex" value="${entity.sex}"></td>
			</tr>
			<tr>
				<td>user password</td>
				<td><input id="password" name="password" value="${entity.password }"></td>
			</tr>
			<tr>
				<td>user qq</td>
				<td><input name="qq" value="${entity.qq }"></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
				<td><input type="button" value="返回" onclick="history.back();"></td>
			</tr>
		</table>
	</form>
	<script>
    $(document).ready(function() {
        $('input[type=radio][name=${entity.id }]').change(function() {
            if (this.value == 2) {
                $("#name").val("student");
                $("#password").val("student");
            }
            else if (this.value == 1) {
                $("#name").val("teacher");
                $("#password").val("teacher");
            }
        });
    });         
</script>
</body>
</html>