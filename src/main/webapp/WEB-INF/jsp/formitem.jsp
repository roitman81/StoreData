<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Item Update Form</title>
</head>
<body>
<form action="/category2/updateItem" method="post" name="frm">
    <c:forEach items="${parit}" var="parit">
<div>

<label for="id">ID Item </label>
<input readonly type="text"  name="itemId"  value="<c:out  value="${parit.itemId}"/>"/>
</div>

<div>
<label for="name"> Name Item</label>
<input type="text" name="itemName" value="<c:out  value="${parit.itemName}"/>"/>
</div>

<label for="warehouse"> Name Warehouse</label>
<input type="text" name="warehouse" />
<div>
<label for="Supplier"> Name Supplier</label>
<select name=supplierId>
				<c:forEach var="r" items="${reshimaSapak}">
					<option value="${r.supplierId}">${r.name}</option>
				</c:forEach>
			</select>

</div>
<div>
<label for="Category"> Name Category</label>
		<select name=category>
				<c:forEach var="r" items="${reshima}">
					<option value="${r.id}">${r.name}</option>
				</c:forEach>
			</select>


</div>

<input type="submit" value="update" ><a href="/">Cancel</a>

     </c:forEach>
</form>
</body>
</html>