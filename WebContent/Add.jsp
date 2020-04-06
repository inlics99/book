<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.red{
		color:red;
	}
</style>
</head>
<body>
	<form action=" ${pageContext.request.contextPath}/book?op=add" method="post">
		<table>
			<tr>
				<td colspan="2">新增新书</td>
			</tr>
			<tr>
				<td>书名:</td>
				<td><input type="text" id="name" name="name" value="" placeholder="书名" /><span>*</span> </td>
			</tr>
			<tr>
				<td>作者:</td>
				<td><input type="text" id="author" name="author" value="" /><span>*</span></td>
			</tr>
			<tr>
				<td>出版社:</td>
				<td><input type="text" id="publish" name="publish" value="" /><span>*</span></td>
			</tr>
			<tr>
				<td>页数</td>
				<td><input type="text" id="page" name="page" value="" /><span>*</span></td>
			</tr>
			<tr>
				<td>价格</td>
				<td><input type="text" id="price" name="price" value="" /><span>*</span></td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input id="btn" type="submit" value="提交">
					<input type="reset" value="重置">
				</td>
			</tr>
		</table>
	</form>
</body>
<script type="text/javascript" src="jquery-3.4.1.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#btn").click(function(){
			
			var name=$("input[name='name']").val();
			var author=$("input[name='author']").val();
			var publish=$("input[name='publish']").val();
			var page=$("input[name='page']").val();
			var price=$("input[name='price']").val();
			if(name=="" || name==null){
				alert("书名不能为空");
				return false;
			}else if(isNaN(price)){
				alert("价格必须是数字");
				return false;
			}
			return true
		});
	});
</script>
</html>