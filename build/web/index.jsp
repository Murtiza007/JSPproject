<%@page contentType="text/html" pageEncoding="UTF-8"%>



<%@include file="views/header.jsp" %>
<%@page import="model.dbContext"%>

<div id="signUpdiv" style="display: none">
    <%@include file="signup.jsp" %>

</div>
   
 
 <%
 
    dbContext db =new dbContext();
    db.connect();
    out.print(dbContext.message);
 
 %>
    
<div id="logindiv" class="bg-white text-primary d-flex justify-content-center align-items-center" style="height: 100vh;">
    <div class="text-center border rounded p-5 shadow" style="min-width: 350px;">
        <h3 class="mb-4">LOGIN PANEL</h3>
        <div id="Message" class="text-danger mb-3"></div>

        <div class="mb-3 text-start">
            <label for="txtUser" class="form-label">Enter Username</label>
            <input type="text" id="txtUser" class="form-control">
        </div>

        <div class="mb-3 text-start">
            <label for="txtPass" class="form-label ">Enter Password</label>
            <input type="password" id="txtPass" class="form-control">
        </div>

        <div class="mb-3 form-check text-start">
            <input type="checkbox" class="form-check-input" id="rememberMe">
            <label class="form-check-label" for="rememberMe">Stay logged in</label>
        </div>

        <div class="mb-3">
            <input type="button" value="Login" name="btnSubmit" id="btnSubmit" class="btn btn-primary w-100">
        </div>

        <div id="registerDiv" class="mt-3">
            <a  class="text-decoration-none text-primary">Forgot Password</a> &nbsp;&nbsp;&nbsp;
            <a  id="anchorSign" class="text-decoration-none text-primary">No account? || Sign up</a>
                
     
        </div>
    </div>
</div>



<%@include file="views/footer.jsp" %>
