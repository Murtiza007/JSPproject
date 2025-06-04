<%@page import="model.login"%>
<%@page import="controller.AccountsController"%>


<%
   login user=new login();
   user.setUsername(request.getParameter("Username"));
   user.setPassword(request.getParameter("Password"));
   user.setRememberMe(request.getParameter("Remember"));
    
   AccountsController ac=new AccountsController();
   ac.login(user);
   out.print(user.getMessage());
   
      
%>
<%! %>