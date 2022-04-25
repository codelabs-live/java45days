package car;

import java.util.Scanner;

public class CarMain {
    CarModel carModel;
    Scanner scanner = new Scanner(System.in);
    String name;
    String model;
    String color;
    String ml;
    String speed;
    String companyName;


    void getData() {
        System.out.println("Enter the name of car");
        name = scanner.nextLine();
        System.out.println("Enter model no. of car");
        model = scanner.next();
        System.out.println("Enter the color of car");
        color = scanner.next();
        System.out.println("Enter the mileage of car");
        ml = scanner.next();
        System.out.println("Enter the speed of car");
        speed = scanner.next();
        System.out.println("Enter the name of company");
        companyName = scanner.next();

    }

    void setDataToModel() {
        carModel = new CarModel(name, model, color, ml, speed, companyName);
    }

    void displayCardDetails() {
        System.out.println("Name: " + carModel.name);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Mileage: " + ml);
        System.out.println("Speed: " + speed);
        System.out.println("Company Name: " + companyName);
    }


}
