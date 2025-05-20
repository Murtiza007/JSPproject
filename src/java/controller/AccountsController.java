package controller;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import model.login;

public class AccountsController {
    
    
    public AccountsController(){
    
    }
    String message="";
   
    public void login(login user) {
        if(isValid(user)){
            if(isAuthentic(user)){
                
                user.setMessage("SUCCESS");
//                Authorize(user,request,response);
            }
            else{
           user.setMessage("incorrect");
                
            }   
        }
        else{ 
       user.setMessage("Please enter all fields");
        
        }
         

    }
    
    public boolean isValid(login user){
        return(!user.getUsername().equals("") && !user.getPassword().equals(""));
    }
    
    private boolean isAuthentic(login user){
        return(user.getUsername().equals("moin")&& user.getPassword().equals("123"));

    }
//    private void Authorize(login user, HttpServletRequest request, HttpServletResponse response) throws IOException{
//        if(user.getRememberMe().equals("true")){
//             if (request.getParameter("Remember") != null) 
//                {
//                    Cookie cookie = new Cookie("AuthCookie", user.getUsername());
//                    cookie.setMaxAge(60 * 60 * 24); 
//                   cookie.setHttpOnly(true); 
//                    response.addCookie(cookie); 
//                }
//             else{
//          
//             }
//        
//          
//        }
//         
//        else{
//          
//        }
//        
//    }
}
