<%@page import="entity.Student" %>
<%@page import="dao.StudentDao" %>

<%
    String rollParam = request.getParameter("roll");
    Student s = null;

    if (rollParam != null && !rollParam.trim().isEmpty()) {
        try {
            int roll = Integer.parseInt(rollParam);
            s = StudentDao.getByRoll(roll);
        } catch (NumberFormatException e) {
            out.println("Invalid roll number format!");
        }
    }

    if (s == null) {
        out.println("No student found for the given roll!");
    }
%>







<%@include file="header.jsp" %>

<div class="container my-3">
    <div class="bg-success text-center">
       <h1 class="jumbotron">Update Student</h1>
    </div>
    <!--    start form-->
    <form action="editStudent.jsp"  method="post">
        
        <input type="hidden" name="roll" value="<%=s.getRoll()%>" />
        <div class="row">
            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Name</label>
                <input type="text" class="form-control" id="name" name="name" placeholder="Full Name" value="<%=s.getName()%>">
            </div>

            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Subject</label>
                <input type="text" class="form-control" id="subject" name="subject" placeholder="Subject"  value="<%=s.getSubject()%>">
            </div>        
        </div>
        <!-- start 2nd row-->
        <div class="row mt-3">
            <div class="col-md-6">
                <label  class="form-label">Marks</label>
                <input type="number" name="marks" id="marks"  value="<%=s.getMarks()%>">
            </div>

            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Department</label>
                <input type="text" name="department" id="department"  value="<%=s.getDepartment()%>">
            </div>        
        </div>
        <div class="row mt-3 text-center">
            <div class="col-md-6">
                <button type="submit" class="btn btn-success text-center" >Update</button>

            </div>

            <div class="col-md-6">
                <button type="reset" class="btn btn-danger text-center" >Reset</button>

            </div>
        </div>

    </form>

    <!--end form    -->
</div>


<%@include file="footer.jsp" %>