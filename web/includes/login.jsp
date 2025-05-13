<%@page import="model.login"%>
<%@page import="controller.AccountsController"%>

<%
    login user=new login();
    if(request.getMethod().equals("POST")){
        AccountsController ac=new AccountsController();
        user.setUsername(request.getParameter("txtUser"));
        user.setPassword(request.getParameter("txtPass"));
        if(ac.login(user,request,response)){
        
          response.sendRedirect("profile");
    }
    }

%>
