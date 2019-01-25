<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Item new Form</title>
</head>
<body>
<form action="additem" method="post" name="frm">
<div>
<label for="Item ID">ID Item (readonly)</label>
<input readonly type="text" name="ItemID" />
</div>

<div>
<label for="name item"> Name Item</label>
<input type="text" name="nameItem" />
</div>



<input type="submit" name="additem" value="add"/><a href="/">Cancel</a>

</form>
</body>
</html>