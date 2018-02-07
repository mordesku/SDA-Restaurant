<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Zamowienie</title>
</head>
<br>
<a href="/orderHistory">order history</a><br>
<form action="/makeOrder" method="post">
    <select name="dishes" multiple>
        <c:forEach items="${dishes}" var="dish">
            <option value="${dish}">${dish}</option>
        </c:forEach>
    </select>
    <input type="submit">
</form>
</table>
</body>
</html>
