$('#btnSubmit').click(function(){
    
$.ajax({
    type:'POST',
    url:'includes/login.jsp',
 data:{
     Username:$('#txtUser').val(),
     Password:$('#txtPass').val(),
     Remember:$('#rememberMe').is(':checked')
 },
  success: function(result){
      result=$.trim(result);
  
     if(result=="SUCCESS"){
        document.location="profile.jsp";
    }
    else{
        $('#Message').html(result);
    }
  },
  error:function(){
      console.log('lost');
  }
    
});

              
});
$('#btnsignup').click(function () {
    var FName = $('#txtFistName').val();
    var LName = $('#txtLastName').val();
    var UName = $('#txtNewUser').val();
    var PASS = $('#txtNewPass').val();
    var email = $('#txtEmail').val();
    var Phone = $('#txtNumber').val();

    if (FName === "" || LName === "" || UName === "" || PASS === "" || email === "" || Phone === "") {
        $('#message').html("Please fill all fields");
        return;
    }

    $.ajax({
        type: 'POST',
        url: 'includes/signup.jsp',
        data: {
            FName:FName,
            LName:LName,
            UName:UName,
            PASS:PASS,
            email:email,
            Phone:Phone
            
        },
        success: function (result) {
            
             
            $('#message').html(result);
            if(result=="User Registered"){
                 $('#message').html(result+ " <a href='index.jsp'>Login here now!</a>")
            }
            
            
            $('#txtFistName').val('');
            $('#txtLastName').val('');
            $('#txtNewUser').val('');
            $('#txtNewPass').val('');
            $('#txtEmail').val('');
            $('#txtNumber').val('');
            $('#message').val('');
             
           
            
            
            
            
             
            
        },
        error: function (error) {
             alert(error);
        }
    });
});
$('#anchorSign').click(function(){
  $('#logindiv').hide();
    $('#signUpdiv').fadeIn(1000);
      
})
$('#anchorLogin').click(function(){
    $('#signUpdiv').hide();
   
})