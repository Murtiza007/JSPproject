/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.login;

public class AccountsController {
    
    
    public AccountsController(){
    
    }
    String message="";
   
    public void login(login user){
        if(isValid(user)){
            if(isAuthentic(user)){
                
                //user.setMessage("SUCCESS");
                Authorize(user);
            }
            else{
           // user.setMessage("incorrect");
                
            }   
        }
        else{ 
      //  user.setMessage("Please enter all fields");
        
        }
         

    }
    
    public boolean isValid(login user){
        return(!user.getUsername().equals("") && !user.getPassword().equals(""));
    }
    
    private boolean isAuthentic(login user){
        return(user.getUsername().equals("moin")&& user.getPassword().equals("123"));

    }
    private void Authorize(login user){
        if(user.getRememberMe().equals("true")){
         
        }
        else{
       
        }
    }
}
