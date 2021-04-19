<%--
  Created by IntelliJ IDEA.
  User: cartonni
  Date: 09/04/2021
  Time: 14:37
 --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<header>
    <jsp:include page="header.jsp" />
</header>

<%@ page import="fr.wildcodeschool.githubtracker.model.Githuber" %>

<h1>Githubers</h1>

<table class="table">
    <thead>
    <tr>
        <th scope="col">Name</th>
        <th scope="col">Id</th>
        <th scope="col">email</th>
        <th scope="col">login</th>
        <th scope="col">avatarUrl</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${githubers}" var="githuber">
        <tr>
            <td><c:out value="${githuber.name}" /></td>
            <td><c:out value="${githuber.id}" /></td>
            <td><c:out value="${githuber.email}" /></td>
            <td><c:out value="${githuber.login}" /></td>
            <td><c:out value="${githuber.avatarUrl}" /></td>
        </tr>
    </c:forEach>
    </tbody>
</table>


</body>
</html>
