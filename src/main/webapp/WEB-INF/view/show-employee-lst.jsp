<! DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>

    <h2> All Employees </h2>
    <br>
    <table>
        <tr>
            <th>Name</th>
            <th>Surname</th>
            <th>Department</th>
            <th>Salary</th>
        </tr>

        <c:forEach var="item" items="${employeeList}">
            <tr>
                <td><c:out value="${item.name}"/></td>
                <td><c:out value="${item.surname}"/></td>
                <td><c:out value="${item.department}"/></td>
                <td><c:out value="${item.salary}"/></td>
            </tr>
        </c:forEach>

    </table>
</body>
</html>