<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Title</title>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
          rel="stylesheet">
    <style>
        h1 {
            text-align: center;
        }
    </style>
</head>
<body>

<div class="container">
    <table class="table table-striped">
        <caption>The following are the student records</caption>

        <thead>
        <tr>
            <th>Student Number</th>
            <th>Student Name</th>
            <th>GPA</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${studentdata}" var="studentdata">
            <tr>
                <td>${studentdata.studentName}</td>
                <td>${studentdata.studentNum}</td>
                <td>${studentdata.gpa}</td>
                <td>

                    <a type="button" class="btn btn-primary"
                       href="edit.jsp">Edit</a>

                    <a type="button" class="btn btn-warning"
                       href="delete.jsp">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>


        <tbody>

        </tbody>
    </table>

    <div>
        <a class="btn btn-success" href="add">Add</a>
    </div>
</div>

<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>
