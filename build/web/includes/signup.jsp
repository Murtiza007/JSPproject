<%@page import="controller.AccountsController"%>
<%@page import="model.Users" %>
<%@page contentType="text/plain" pageEncoding="UTF-8"%>

<%
    Users user = new Users();
    user.setFName(request.getParameter("FName"));
    user.setLName(request.getParameter("LName"));
    user.setUName(request.getParameter("UName"));
    user.setPassword(request.getParameter("PASS"));
    user.setEmail(request.getParameter("email"));
    user.setPhone(request.getParameter("Phone"));

    AccountsController ac = new AccountsController();
    ac.SaveUser(user);

    out.print(user.getMessage()); 
%>
