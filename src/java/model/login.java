package model;


public class login {
 
    private String username;
    private String password;
    private int userID;
    private String message;

    public login() {
    }

    public login(String username, String password, int userID, String message) {
        this.username = username;
        this.password = password;
        this.userID = userID;
        this.message = message;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
