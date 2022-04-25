package auth;

public class User {
    String email;
    String pass;
    User(String email, String pass){
        this.email = email;
        this.pass=pass;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
