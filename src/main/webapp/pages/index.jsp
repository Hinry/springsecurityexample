<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: HillelNew8
  Date: 02.12.2016
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to whis site</title>

</head>
<body>

<h1>Hille java classes</h1>
<p>Hello!</p>
<sec:authorize access="!isAuthenticated()">
    <form method="post" action="/login">
        <input type="text" name="login">
        <p><button type="submit" >Login </button></p>
    </form>


</sec:authorize>
<sec:authorize access="isAuthenticated()">
    <p>You Login <sec:authentication property="principial.username" /></p>
</sec:authorize>

</body>
</html>
