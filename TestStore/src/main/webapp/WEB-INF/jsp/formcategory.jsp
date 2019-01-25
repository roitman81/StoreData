<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Category Update Form</title>
</head>
<body>
<form action="/category2/update" method="post" name="frm">
    <c:forEach items="${reshima}" var="degem">
<div>

<label for="id">ID Category </label>
<input readonly type="text"  name="id"  value="<c:out  value="${degem.id}"/>"/>
</div>

<div>
<label for="name"> Name Category</label>
<input type="text" name="name" value="<c:out  value="${degem.name}"/>"/>
</div>



<input type="submit" value="update" >

     </c:forEach>
</form>
</body>
</html>
