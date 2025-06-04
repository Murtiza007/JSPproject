<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>




<!--<h3>CREATE ACCOUNT</h3>-->


<div id="signupdiv" class="bg-white text-primary d-flex justify-content-center align-items-center" style="height: 100vh;">
    <div class="text-center border rounded p-5 shadow" style="min-width: 400px;">
        <h3 class="mb-4">CREATE ACCOUNT</h3>
        <div id="message" class="text-danger mb-3"></div>
    <div  class="d-flex gap-5" >   
        <div class="mb-3 text-start" >
            <label for="txtFistName" class="form-label">Enter First Name:</label>
            <input type="text" name="firstName" id="txtFistName" class="form-control">
        </div>

        <div class="mb-3 text-start">
            <label for="txtLastName" class="form-label">Enter Last Name:</label>
            <input type="text" name="lastName" id="txtLastName" class="form-control">
        </div>
    </div>
    <div  class="d-flex gap-5" > 
        <div class="mb-3 text-start">
            <label for="txtNewUser" class="form-label">Create Username:</label>
            <input type="text" name="username" id="txtNewUser" class="form-control">
        </div>

        <div class="mb-3 text-start">
            <label for="txtNewPass" class="form-label">Create Password:</label>
            <input type="password" name="password" id="txtNewPass" class="form-control">
        </div>
    </div>
    <div  class="d-flex gap-5" > 
        <div class="mb-3 text-start">
            <label for="txtEmail" class="form-label">Enter Email:</label>
            <input type="email" name="email" id="txtEmail" class="form-control">
        </div>

        <div class="mb-3 text-start">
            <label for="txtNumber" class="form-label">Enter Number:</label>
            <input type="number" name="number" id="txtNumber" class="form-control">
        </div>
    </div>
        <div class="mb-3">
            <input type="button" value="Sign Up" name="btnsignup" id="btnsignup" class="btn btn-primary w-100">
        </div>

        <div class="mt-3">
            <a id="anchorLogin" class="text-decoration-none text-primary">Already have an account? Login</a>
        </div>

    </div>
</div>
        





</body>
</html>
