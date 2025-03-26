package day_05_class_and_object;

public class Cars_objects {
    public static void main(String[] args) {

        Cars car1 = new Cars();

        car1.brand = "Volvo";
        car1.version ="S40";
        car1.colour = "White";
        car1.year = 2011;

        car1.showInfo();
    }
}
