<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>lessonCheckVIEW</h1>
    <c:forEach var="i" items="${chValue}">
        <c:out value="${i}"></c:out><br>
    </c:forEach>
    <%--${lesson}--%>
</body>
</html>
