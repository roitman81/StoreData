%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="style.css" type="text/css" media="screen">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Category Page</title>
</head>
<body>
<H1 class="link2">רשימה קטגוריות</H1>
  
             <a href="addcategory.jsp">new</a>
         
<table class="t1">
   <thead>
      <tr><TH>ID </TH><TH>NAME</TH><TH>DELETE</TH><TH>UPDATE</TH></tr>
      
    </thead>
    <tbody>
    <c:forEach items="${reshima}" var="degem">
      <tr>
          <td><c:out  value="${degem.id}"/></td>
          <td><c:out  value="${degem.name}"/></td>
         
           <td>
           <a href="CategoryController?myaction=delete&id=<c:out  value="${degem.id}"/>">מחיקה</a>
          
          
          </td>
            <td>
             <a href="CategoryController?myaction=update&id=<c:out  value="${degem.id}"/>">עדכון</a>
          </td>
          
           
           
      </tr>
      </c:forEach>
    </tbody>
</table>
</body>
</html>


