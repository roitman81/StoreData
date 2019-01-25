<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Supplier Update Form</title>
</head>
<body>
<form action="/category2/updatesupplier" method="post" name="frm">
    <c:forEach items="${reshimaSapak}" var="sapak">
<div>

<label for="id">ID Supplier </label>
<input readonly type="text"  name="supplierId"  value="<c:out  value="${sapak.supplierId}"/>"/>
</div>

<div>
<label for="name"> Name Supplier</label>
<input type="text" name="name" value="<c:out  value="${sapak.name}"/>"/>
</div>
<div>
<label for="city"> City</label>
<input type="text" name="city" value="<c:out  value="${sapak.city}"/>"/>
</div>
<div>
<label for="phoneNum"> Supplier Phone Number</label>
<input type="text" name="phoneNum" value="<c:out  value="${sapak.phoneNum}"/>"/>
</div>



<input type="submit" value="update" >

     </c:forEach>
</form>
</body>
</html>