<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Details</title>
</head>
<body>

<h2>Dear Employee, you are welcome!</h2>
<br>
<br>

<%--Your name: ${param.employeeName}--%>
Your name: ${employee.name}
<br><br>
Your surname: ${employee.surname}
<br><br>
Your salary: ${employee.salary}
<br><br>
Your department: ${employee.department}
<br><br>
Your gender: ${employee.gender}
<br><br>
Language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>${lang}</li>
    </c:forEach>
</ul>
Your phone number: ${employee.phoneNumber}
<br><br>
Your email: ${employee.email}
<br><br>

<br>
<br>
<a href="">Go home</a>

</body>
</html>
