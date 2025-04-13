package day_13_abstraction.cars;

public abstract class Car {

    private String brand;
    private String model;
    private String color;
    private int year;
    private double price;

    //----------------------------------------constructor------------------------------------------

    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        setColor(color);//this.color = color;
        if (year < 1880){
            System.out.println("invalid year");
            System.exit(0);
        }
        this.year = year;
        setPrice(price); //this.price = price;
    }

    //----------------------------------------getterSetter------------------------------------------

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            System.out.println("invalid price.");
            System.exit(0);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    //----------------------------------------instanceMethods------------------------------------------


    public void stop(){
        System.out.println("Press the brake.");
    }


    //----------------------------------------abstractMethods------------------------------------------


    public abstract void start();


    //----------------------------------------staticMethods------------------------------------------


    public static void drive(){
        System.out.println("Press the gas and steer the wheel.");
    }


    //----------------------------------------toString------------------------------------------


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
