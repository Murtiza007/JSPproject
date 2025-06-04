package controller;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import model.login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Users;
import model.dbContext;

public class AccountsController {
    
    private Connection con;
    private Statement stat;
    private ResultSet rs;
    private PreparedStatement pstat;
    
  
    
    
    public AccountsController() throws SQLException {
     this.con = dbContext.connect();
    }
    
    String message="";
   
    public void login(login user) {
        if(isValid(user)){
            if(isAuthentic(user)){
                user.setMessage("SUCCESS");
            
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
        try{ 
       String sql="select * from users where username = '"+user.getUsername()+"' and password='"+user.getPassword()+"'";
       stat=con.createStatement();
       rs=stat.executeQuery(sql);
       
       if(rs.next()){
           return true;
       }
       else{
           user.setMessage("Incorrect credentials");
           return false;
       }
       
       }
       catch (SQLException ex){
       user.setMessage(ex.getMessage());
       return false;
       }

    }
    
    public void SaveUser(Users user) {
    
        if (checkuser(user)){
        
        
        if(register(user)){
            user.setMessage("User Registered");
        }
        else{
            user.setMessage("User Coudn't be Registered");
        }
        }
        else{
            user.setMessage("User with this email exists");
        }
    }

    public boolean register(Users user) {
    try {
        String sql = "INSERT INTO users (first_name, last_name, username, password, email, phone) VALUES (?, ?, ?, ?, ?, ?)";
        pstat = con.prepareStatement(sql);

        pstat.setString(1, user.getFName());
        pstat.setString(2, user.getLName());
        pstat.setString(3, user.getUName());
        pstat.setString(4, user.getPassword());
        pstat.setString(5, user.getEmail());
        pstat.setString(6, user.getPhone());

        int rows = pstat.executeUpdate();
        return rows > 0;

    } catch (SQLException ex) {
        user.setMessage("Error: " + ex.getMessage());
        return false;
    }
}
     public boolean checkuser(Users user){
     try{ 
       String sql="select * from users where email = '"+user.getEmail()+"' ";
       stat=con.createStatement();
       rs=stat.executeQuery(sql);
       
       if(rs.next()){
           return false;
       }
       else{
           user.setMessage("Incorrect credentials");
           return true;
       }
       
       }
       catch (SQLException ex){
       user.setMessage(ex.getMessage());
       return false;
       }
        
    
    }

    
}
