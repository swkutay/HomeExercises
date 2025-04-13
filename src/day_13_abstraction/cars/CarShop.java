package day_13_abstraction.cars;

public class CarShop {
    public static void main(String[] args) {

        Honda honda = new Honda("Honda", "Civic", "Black", 2018, 20_000);

        Toyota toyota = new Toyota("Toyota", "Corolla", "Grey", 2010, 12_000.25);

        Audi audi = new Audi("Audi", "A3", "Black", 2008, 15_000);



        System.out.println("honda = " + honda);

        System.out.println("toyota = " + toyota);

        System.out.println("audi = " + audi);




        honda.start();
        toyota.start();
        audi.start();

    }
}
