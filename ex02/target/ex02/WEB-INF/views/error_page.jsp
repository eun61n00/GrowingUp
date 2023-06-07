<%--
  Created by IntelliJ IDEA.
  User: eunbin
  Date: 2023/01/17
  Time: 10:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" import="java.util.*" %>
<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport"
        content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Error</title>
</head>
<body>

  <h4><c:out value="${exception.getMessage()}" /> </h4>

  <ul>
    <c:forEach items="${exception.getStackTrace()}" var="stack">
      <li><c:out value="${stack}"/></li>
    </c:forEach>
  </ul>

</body>
</html>