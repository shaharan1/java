<jsp:useBean class="entity.Student"  id="s" />
<%@page  import="dao.StudentDao" %>
<jsp:setProperty  name="s" property="*" />

<%
        
      StudentDao.deleteStudent(s.getRoll());
       
      response.sendRedirect("home.jsp");
    
           


%>