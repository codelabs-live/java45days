package auth;

import java.util.Objects;

public class Login {
    User user;
  public void addData(String email, String pass){
        user =new User(email, pass);
    }

   public boolean checkAuth(){
        if(Objects.equals(user.email, "kaundal.k.k@gmail.com") && Objects.equals(user.pass, "123456")){
            return true;
        }else {
           return false;
        }
    }
}
