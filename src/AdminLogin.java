
// Date 25 April 2022
import auth.Login;

import java.util.Scanner;
public class AdminLogin {
    public static void main(String[] args) {
        Login login = new Login();
        String email ;
        String pass;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email id ");
        email = scanner.next();
        System.out.println("Enter your password");
        pass = scanner.next();
        System.out.println("---------------Processing-----------------");
        login.addData(email, pass);
        System.out.println("----------Verify with database-------------");
        if(login.checkAuth()){
            System.out.println("Login done");
        }else {
            System.out.println("Error");
        }
    }
}