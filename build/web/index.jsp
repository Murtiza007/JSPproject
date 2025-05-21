<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="views/header.jsp" %>

<div id="signUpdiv" style="display: none">
    <%@include file="signup.jsp" %>
    
</div>
        <div id="logindiv">
            <table cellpadding="5" cellspacing="5">
                <tr>
                    <td><h3>LOGIN PANEL</h3></td>
                    <td id='message' style="color:red"></td>  
                </tr>
                 <tr>
                    <td>Enter Username</td>
                    <td><input type="text" id="txtUser"></td> 
                </tr>
                 <tr>
                    <td>Enter Password</td>
                    <td><input type="password" id="txtPass"></td> 
                </tr>
                <tr>
                    <td></td>
                    <td><input type="button" value="Login"  name="btnSubmit" id="btnSubmit"></td> 
                </tr>
                <tr>
                    
                   <td>Stay logged in <input type='checkbox' id='rememberMe'></td>
                 </tr>
            </table>
            
        
        <div id="registerDiv">
            <a> forgot Password </a> &nbsp;      &nbsp;  &nbsp;
            <a id="anchor" > no account? || Sign up</a><!-- comment -->
        </div>
</div>

<%@include file="views/footer.jsp" %>
 