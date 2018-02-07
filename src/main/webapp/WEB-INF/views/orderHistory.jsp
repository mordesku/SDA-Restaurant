<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Historia</title>
</head>
<body>
<table>
    <c:forEach items="${history}" var="item">
        <tr>
            <td><c:out value="${item}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
