<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table style="width: 700px;">
		<tr>
			<td colspan="5">
				<form action="${pageContext.request.contextPath }/book?op=find" method="post">
					<select  name="findType">
						<option value="1" >书名</option>
						<option value="2" >作者</option>
						<option value="3" >出版社</option>
					</select>
					<input type="text" name="findName" value="" />
					<input type="submit" value="提交" />
				</form>
			</td>
		</tr>
		<tr>
			<td colspan="5"> <a href="#" > <p onclick="show(this)"> 点击</p></a> </td>
			<!--  onclick="${pageContext.request.contextPath}/Add.jsp" -->
		</tr>
		<tr>
			<td>书名</td>
			<td>作者</td>
			<td>出版社</td>
			<td>页数</td>
			<td>价格</td>
		</tr>
		<c:forEach items="${lists }" var="obj">
			<tr>
				<td>${obj.book_bame } </td>
				<td>${obj.book_author } </td>
				<td>${obj.book_publish } </td>
				<td>${obj.book_page } </td>
				<td>${obj.book_price } </td>
			</tr>
		</c:forEach>
		
	</table>
</body>
<script type="text/javascript" src="jquery-3.4.1.js"></script>
<script type="text/javascript">
    function show(obj){
        //alert("谢谢！");
        // document.getElementById("d").innerHTML = "显示需要组装的信息";
        // window.open ("page.html", "newwindow", "height=100, width=400, toolbar= no, menubar=no, scrollbars=no, resizable=no, location=no, status=no") 
    	//window.open('index2.jsp?p1=2','_blank');
        var x = window.screen.height;
    var y = window.screen.width;
    var h = 500;
    var w = 800;
    var model = "title=word,resizable=yes,scrollbars=yes,height=" + h + ",width=" + w + ",status=yes,toolbar=no,menubar=no,location=no,top=" + (x-h)/2 + ",left=" + (y-w)/2;
    var url = "";
    url = "Add.jsp";//弹出窗口的页面内容
    var oOpen = window.open(url,"adviceDetail",model);
    oOpen.focus();
    }
  </script>
</html>