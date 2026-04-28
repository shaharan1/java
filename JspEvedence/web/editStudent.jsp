<jsp:useBean class="entity.Student"  id="shaharan" />
<%@page  import="dao.StudentDao" %>
<jsp:setProperty  name="shaharan" property="*" />

<%
        
        int result=StudentDao.updateStudent(shaharan);
        if(result > 0){
             response.sendRedirect("home.jsp");
    
            }
            else{
    response.sendRedirect("error.jsp");
    }


%>