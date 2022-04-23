<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ask Details</title>
</head>
<body>

<h2>Employee details form</h2>
<br><br>

<form:form action="showDetails" modelAttribute="employee" method="post">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    E-mail <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>
    Phone number <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>
    Your department: <form:select path="department">
        <form:options items="${employee.departments}"/>
<%--        <form:option value="Information Technology" label="IT"/>--%>
<%--        <form:option value="Human Resources" label="HR"/>--%>
<%--        <form:option value="Sales" label="Sales"/>--%>
    </form:select>
    <br><br>
    Gender
    <form:radiobuttons path="gender" items="${employee.genders}"/>
<%--    Male <form:radiobutton path="gender" value="Male"/>--%>
<%--    Female <form:radiobutton path="gender" value="Female"/>--%>
    <br><br>
    Foreign languages:
    <form:checkboxes path="languages" items="${employee.languageMap}"/>
<%--    EN <form:checkbox path="languages" value="English"/>--%>
<%--    GE <form:checkbox path="languages" value="Germany"/>--%>
<%--    FR <form:checkbox path="languages" value="French"/>--%>
    <br><br>
    <input type="submit" value="Ok">
</form:form>

</body>
</html>
