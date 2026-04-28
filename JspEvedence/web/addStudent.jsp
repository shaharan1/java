<jsp:useBean class="entity.Student"  id="s" />
<%@page  import="dao.StudentDao" %>
<jsp:setProperty  name="s" property="*" />

<%
        
        int result=StudentDao.saveStudent(s);
        if(result > 0){
             response.sendRedirect("home.jsp");
    
            }
            else{
    response.sendRedirect("error.jsp");
    }


%>