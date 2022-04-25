package car;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) {
        CarUser carUser = new CarUser();
        CarMain carMain = new CarMain();
        Scanner scanner = new Scanner(System.in);
        int c = 0;
        char ch;
        System.out.println("---------Welcome-------------");
        System.out.println("Enter your details :    ");
        System.out.println("-------------------------------");
        carUser.getUserData();
        System.out.println("-------------------------------");
        System.out.println("Enter details of car:  ");
        System.out.println("-------------------------------");
        carMain.getData();
        carMain.setDataToModel();
        do {
            System.out.println("-------------------------------");
            System.out.println("-------------Menu--------------");
            System.out.println("1. Print Full Details ");
            System.out.println("2. Print user details");
            System.out.println("3. Print card details");
            System.out.println("4. Print user name ");
            System.out.println("5. Print name of car");
            System.out.println("6. Print name of company");
            c = scanner.nextInt();
            switch (c) {
                case 1:
                    System.out.println("-------------------------------");
                    System.out.println("--------Full Details-----------");
                    System.out.println("-------------------------------");
                    carUser.displayUserDetails();
                    carMain.displayCardDetails();
                    break;
                case 2:
                    System.out.println("-------------------------------");
                    System.out.println("--------User Details-----------");
                    System.out.println("-------------------------------");
                    carUser.displayUserDetails();
                    break;
                case 3:
                    System.out.println("-------------------------------");
                    System.out.println("--------Car Details-----------");
                    System.out.println("-------------------------------");
                    carMain.displayCardDetails();
                    break;
                case 4:
                    System.out.println("Name of user: " + carUser.name);
                    break;
                case 5:
                    System.out.println("Name of car: " + carMain.name);
                    break;
                case 6:
                    System.out.println("Company Name: " + carMain.companyName);
                    break;
                default:
                    System.out.println("Error");
            }

            System.out.println("Do you want to print another data y/n");
            ch = scanner.next().toLowerCase().charAt(0);
        } while (ch == 'y');
    }
}
