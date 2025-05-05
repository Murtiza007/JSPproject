<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%!
    
    String message="";
    public boolean login(String user ,String password){
        if(isValid(user,password)){
            if(isAuthentic(user,password)){
                return true;
            }
            else{
            this.message="Incorrect Password";
                return false;
            }   
        }
        else{ 
        this.message="Please enter all fields";
        return false;
        }

    }
    
    public boolean isValid(String user ,String password){
        return(!user.equals("") && !password.equals(""));
    }
    
    private boolean isAuthentic(String user ,String password){
        return(user.equals("moin")&& password.equals("123"));

    }
%>

<%
    if(request.getMethod().equals("POST")){
     if(login(request.getParameter("txtUser"),request.getParameter("txtPass")))
        {
        response.sendRedirect("profile");
        }
     }
    
    else {
        this.message="get is running"; 
    }

%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <form method="POST" action="">
            <table cellpadding="5" cellspacing="5">
                <tr>
                    <td><h3>LOGIN PANEL</h3></td>
                    <td><%=this.message%></td>  
                </tr>
                 <tr>
                    <td>Enter Username</td>
                    <td><input type="text" name="txtUser"></td> 
                </tr>
                 <tr>
                    <td>Enter Password</td>
                    <td><input type="password" name="txtPass"></td> 
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Login" name="btnSubmit"></td> 
                </tr>
            </table>
        </form>
      
    </body>
</html>
