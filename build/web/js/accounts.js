$('#btnSubmit').click(function(){
    var username=$('#txtUser').val();
    var pass=$('#txtPass').val();
  

$.ajax({
    type:'POST',
    url:'includes/login.jsp',
 data:{
     Username:username,
     Password:pass,
     Remember:$('#rememberMe').is(':checked')
 },
  success: function(result){
      result=$.trim(result);
  
     if(result=="SUCCESS"){
        document.location="profile.jsp";
    }
    else{
  
     $('#message').html(result);
    }
  },
  error:function(){
      console.log('lost');
  }
    
});

              
});
        
$('#btnsignup').click(function(){
    var user={
        'FName':$('#txtFistName').val(),
        'LName':$('#txtLastName').val(),
        'UName':$('#txtNewUser').val(),
        'PASS':$('#txtNewPass').val(),
        'email':$('#txtEmail').val(),
        'Phone':$('#txtNumber').val(),
        
        
    }
    user=JSON.stringify(user)
    alert(user);
    
})

$('#anchor').click(function(){
  
  $('#logindiv').hide();
    $('#signUpdiv').fadeIn(1000);
    
})