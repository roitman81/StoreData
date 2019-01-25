<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Item new Form</title>
</head>
<body>
<form action="additemnew" method="post" name="frm">
<div>
<label for="Item ID">ID Item (readonly)</label>
<input readonly type="text" name="itemID" />
</div>

<div>
<label for="name item"> Name Item</label>
<input type="text" name="itemName" />
</div>

<div>
<label for="warehouse"> Name Warehouse</label>
<input type="text" name="warehouse" />
</div>
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
<input type="submit" value="add"/><a href="/">Cancel</a>

</form>
</body>
</html>