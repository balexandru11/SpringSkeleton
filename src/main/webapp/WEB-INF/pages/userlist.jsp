<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <script src="../../resources/js/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="<c:url value="../../resources/css.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="../../resources/css/bootstrap.min.css"/>">
</head>

<body>
<table>

</table>

<div id="wrapper">
    <h1>User List</h1>

    <table id="keywords" cellspacing="0" cellpadding="0">
        <thead>
        <tr>
            <th><span>Username</span></th>
            <th><span>Country</span></th>
            <th><span></span></th>
        </tr>
        </thead>
        <c:forEach var="user" items="${userlist}">
            <spring:url value="/deleteuser/${user.id}" var="deleteUrl"/>
            <tr>
                <td>${user.username}</td>
                <td>${user.country}</td>
                <td>
                    <div class="container">
                        <button type="button" class="btn btn-outline-danger"
                                onclick="$.post('${deleteUrl}', function() {
                                        location.href='/';
                                        })">Delete
                        </button>
                    </div>
                </td>

            </tr>
        </c:forEach>
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
            <td><input type="submit" value="Add"/></td>
        </tr>
    </table>
</form:form>
${error}

</body>
</html>