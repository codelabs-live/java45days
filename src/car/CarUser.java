package car;

import java.util.Scanner;

public class CarUser {
    Scanner scanner = new Scanner(System.in);
    String name;
    String email;
    int age;
    int ph;

    void getUserData() {
        System.out.println("Enter your name ");
        name = scanner.nextLine();
        System.out.println("Enter your email");
        email = scanner.next();
        System.out.println("Enter your age");
        age = scanner.nextInt();
        System.out.println("Enter phone no.");
        ph = scanner.nextInt();
    }

    void displayUserDetails() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Phone No.: " + ph);
    }
}
