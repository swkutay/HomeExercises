package day_13_abstraction.cars;

public class Honda extends Car{

    public Honda(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Say start.");
    }
}
