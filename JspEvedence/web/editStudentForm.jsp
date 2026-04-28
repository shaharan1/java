<%@page import="entity.Student" %>
<%@page import="dao.StudentDao" %>


<%
    String id=request.getParameter("id");    
    Student s=StudentDao.getById(Integer.parseInt(id));
%>



<%@include file="header.jsp" %>

<div class="container my-3">
    <div class="bg-success text-center">
        <h1 class="jumborton">Update Student</h1>
    </div>
    <!--    start form-->
    <form action="editStudent.jsp"  method="post">
        
        <input type="hidden" name="id" value="<%=s.getId()%>" />
        <div class="row">
            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Name</label>
                <input type="text" class="form-control" id="name" name="name" placeholder="Full Name" value="<%=s.getName()%>">
            </div>

            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Email</label>
                <input type="text" class="form-control" id="email" name="email" placeholder="example@gmail.com"  value="<%=s.getEmail()%>">
            </div>        
        </div>
        <!-- start 2nd row-->
        <div class="row mt-3">
            <div class="col-md-6">
                <label  class="form-label">Date Of  Birth</label>
                <input type="date" name="dob" id="dob"  value="<%=s.getDob()%>">
            </div>

            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Fee</label>
                <input type="number" name="fee" id="fee"  value="<%=s.getFee()%>">
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