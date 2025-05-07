
package model;


public class Users extends login {
    private String FName;
    private String LName;
    private String email;
    private String phone;

    public Users() {
    }

    public Users(String FName, String LName, String email, String phone) {
        this.FName = FName;
        this.LName = LName;
        this.email = email;
        this.phone = phone;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
