/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.login;

public class AccountsController {
    
    
    public AccountsController(){
    
    }
    String message="";
   
    public boolean login(login user){
        if(isValid(user)){
            if(isAuthentic(user)){
                
                return true;
            }
            else{
            this.message="Incorrect Password";
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
