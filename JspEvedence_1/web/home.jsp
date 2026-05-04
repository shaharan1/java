<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="entity.Student"%>
<%@page import="dao.StudentDao"%>
<%@page import="java.util.*"%>

<%@include file="header.jsp" %>

<%
    List<Student> list = StudentDao.getAllStudents();
    request.setAttribute("list", list);
%>

<div class="container my-5">
    <h1 class="text-primary text-center mb-4">All Students</h1>

    <table class="table table-bordered table-hover">
        <thead class="table-dark">
            <tr>
                <th>Roll</th>
                <th>Name</th>
                <th>Subject</th>
                <th>Marks</th>
                <th>Department</th>

                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${list}" var="s">
                <tr>
                    <td>${s.roll}</td>
                    <td>${s.name}</td>
                    <td>${s.subject}</td>
                    <td>${s.marks}</td>
                    <td>${s.department}</td>

                    <td>
                        <a href="editStudentForm.jsp?id=${s.roll}" class="btn btn-sm btn-primary">Edit</a>
                        <a href="deleteStudent.jsp?id=${s.roll}" class="btn btn-sm btn-danger"
                           onclick="return confirm('Are you sure you want to delete this student?');">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

<%@include file="footer.jsp" %>