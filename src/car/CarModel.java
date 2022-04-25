package car;

public class CarModel {
    String name;
    String model;
    String color;
    String ml;
    String speed;
    String companyName;

    CarModel(String name, String model, String color, String ml, String speed, String companyName) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.ml = ml;
        this.speed = speed;
        this.companyName = companyName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getMl() {
        return ml;
    }

    public void setMl(String ml) {
        this.ml = ml;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
