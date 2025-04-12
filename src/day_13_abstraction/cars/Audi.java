package day_13_abstraction.cars;

public class Audi extends Car{
    public Audi(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Turn the ignition key on.");
    }
}
