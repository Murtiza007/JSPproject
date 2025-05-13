 $('#btnSubmit').click(function(){

$.ajax({
    type:'POST',
    url:'includes/login.jsp',
 data:{
     Username:$('#txtUser').val(),
     Password:$('#txtPass').val(),
     
 },
  success: function(){
      console.log('win');
  },
  error:function(){
      console.log('lost');
  }
    
});

              
});
        
