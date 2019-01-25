<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Supplier new Form</title>
</head>
<body>
<form action="addsupplier" method="post" name="frm">
<div>
<label for="Supplier ID">ID Supplier (readonly)</label>
<input readonly type="text" name="SupplierID" />
</div>
<div>
<label for="name Supplier"> Name Supplier</label>
<input type="text" name="name" />
</div>
<div>
<label for="City Supplier"> City</label>
<input type="text" name="city" />
</div>
<div>
<label for="Phone Number"> Phone Number</label>
<input type="text" name="phoneNum" />
</div>



<input type="submit" name="addsupplier" value="add"/><a href="/">Cancel</a>

</form>
</body>
</html>