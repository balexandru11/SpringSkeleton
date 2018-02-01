<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="<c:url value="../../resources/css.css"/>">
</head>

<body>
<table>

    <c:forEach var="user" items="${objects}">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
        </tr>
    </c:forEach>
</table>

<div id="wrapper">
    <h1>Sortable Table of Search Queries</h1>

    <table id="keywords" cellspacing="0" cellpadding="0">
        <thead>
        <tr>
            <th><span>Keywords</span></th>
            <th><span>Impressions</span></th>
            <th><span>Clicks</span></th>
            <th><span>CTR</span></th>
            <th><span>Rank</span></th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td class="lalign">silly tshirts</td>
            <td>6,000</td>
            <td>110</td>
            <td>1.8%</td>
            <td>22.2</td>
        </tr>
        <tr>
            <td class="lalign">desktop workspace photos</td>
            <td>2,200</td>
            <td>500</td>
            <td>22%</td>
            <td>8.9</td>
        </tr>
        <tr>
            <td class="lalign">arrested development quotes</td>
            <td>13,500</td>
            <td>900</td>
            <td>6.7%</td>
            <td>12.0</td>
        </tr>
        <tr>
            <td class="lalign">popular web series</td>
            <td>8,700</td>
            <td>350</td>
            <td>4%</td>
            <td>7.0</td>
        </tr>
        <tr>
            <td class="lalign">2013 webapps</td>
            <td>9,900</td>
            <td>460</td>
            <td>4.6%</td>
            <td>11.5</td>
        </tr>
        <tr>
            <td class="lalign">ring bananaphone</td>
            <td>10,500</td>
            <td>748</td>
            <td>7.1%</td>
            <td>17.3</td>
        </tr>
        </tbody>
    </table>
</div>

<h3>Enter the user details</h3>

<form:form method="POST" action="/addUser" modelAttribute="user">
    <table>
        <tr>
            <td><form:label path="username">Username</form:label></td>
            <td><form:input path="username"/></td>
        </tr>
        <tr>
            <td><form:label path="password">Password</form:label></td>
            <td><form:input path="password"/></td>
        </tr>
        <tr>
            <td><form:label path="country">Country</form:label></td>
            <td><form:input path="country"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>

</body>
</html>