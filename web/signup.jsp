<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<%@include file="views/header.jsp" %>

<h3>CREATE ACCOUNT</h3>



    <table cellpadding="5" cellspacing="5">
        <tr>
            <td>Enter First Name:</td>
            <td><input type="text" name="firstName" id="txtFistName"></td>
        </tr>
        <tr>
            <td>Enter Last Name:</td>
            <td><input type="text" name="lastName" id="txtLastName"></td>
        </tr>
        <tr>
            <td>Create Username:</td>
            <td><input type="text" name="username" id="txtNewUser"></td>
        </tr>
        <tr>
            <td>Create Password:</td>
            <td><input type="password" name="password" id="txtNewPass"></td>
        </tr>
        <tr>
            <td>Enter Email:</td>
            <td><input type="email" name="email" id="txtEmail"></td>
        </tr>
        <tr>
            <td>Enter Number:</td>
            <td><input type="number" name="number"  id="txtNumber"></td>
        </tr>
        <tr>
            <td><input type="button" value="Sign Up" name="btnsignup" id="btnsignup"></td>
        </tr>
    </table>



<%@include file="views/footer.jsp" %>

</body>
</html>
