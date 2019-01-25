<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Category new Form</title>
</head>
<body>
<form action="addcategory" method="post" name="frm">
<div>
<label for="category ID">ID Category (readonly)</label>
<input readonly type="text" name="categoryID" />
</div>

<div>
<label for="name category"> Name Category</label>
<input type="text" name="nameCategory" />
</div>



<input type="submit" name="addcategory" value="add"/><a href="/">Cancel</a>

</form>
</body>
</html>
