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
   
    public boolean login(login user,HttpServletRequest request,HttpServletResponse response){
        if(isValid(user)){
            if(isAuthentic(user)){
                HttpSession session = request.getSession();
            session.setAttribute("user1", user.getUsername());
            Cookie cookie=new Cookie("AUthCookie",user.getUsername());
            cookie.setMaxAge(60*60*24);
            cookie.isHttpOnly();
            response.addCookie(cookie);
                return true;
            }
            else{
            user.setMessage("incorrect");
                return false;
            }   
        }
        else{ 
        user.setMessage("Please enter all fields");
        return false;
        }
         

    }
    
    public boolean isValid(login user){
        return(!user.getUsername().equals("") && !user.getPassword().equals(""));
    }
    
    private boolean isAuthentic(login user){
        return(user.getUsername().equals("moin")&& user.getPassword().equals("123"));

    }
}
