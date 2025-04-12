package day_13_abstraction.cars;

public class Toyota extends Car{

    public Toyota(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Press the start button.");
    }
}
