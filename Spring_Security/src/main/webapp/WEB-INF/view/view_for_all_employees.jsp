<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View for all employees</title>
</head>
<body>

<h3>Information for all employees</h3>

<br><br>

<security:authorize access="hasRole('HR')">
    <input type="submit" value="Salary" onclick="window.location.href = 'hr_info'">
    For HR staff only
</security:authorize>

<br><br>

<security:authorize access="hasRole('MANAGER')">
    <input type="submit" value="Performance" onclick="window.location.href = 'manager_info'">
    For Managers staff only
</security:authorize>

</body>
</html>
