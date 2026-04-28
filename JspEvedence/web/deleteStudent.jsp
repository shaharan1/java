<jsp:useBean class="entity.Student"  id="s" />
<%@page  import="dao.StudentDao" %>
<jsp:setProperty  name="s" property="*" />

<%
        
      StudentDao.deleteStudent(s.getId());
       
      response.sendRedirect("home.jsp");
    
           


%>