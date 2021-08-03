<%--
  Created by IntelliJ IDEA.
  User: Black Diamond
  Date: 8/3/2021
  Time: 1:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="POST" action="" modelAttribute="user">
    <fieldset>
        <legend>Register</legend>
        <table>
            <tr>
                <td><form:label path="firstName">First name:</form:label></td>
                <td><form:input path="firstName" type="text" /></td>
                <td><p style="color: red">${errFirstName}</p></td>
            </tr>
            <tr>
                <td><form:label path="lastName">Last name:</form:label></td>
                <td><form:input path="lastName" type="text" /></td>
                <td><p style="color: red">${errLastName}</p></td>
            </tr>
            <tr>
                <td><form:label path="age">Age:</form:label></td>
                <td><form:input path="age" type="text" /></td>
                <td><p style="color: red">${errAge}</p></td>
            </tr>
            <tr>
                <td><form:label path="phone">Phone:</form:label></td>
                <td><form:input path="phone" type="text" /></td>
                <td><p style="color: red">${errPhone}</p></td>
            </tr>
            <tr>
                <td><form:label path="email">Email:</form:label></td>
                <td><form:input path="email" type="text" /></td>
                <td><p style="color: red">${errEmail}</p></td>
            </tr>
            <tr>
                <td></td>
                <td><form:button>Send</form:button></td>
            </tr>
        </table>
    </fieldset>
</form:form>
</body>
</html>
