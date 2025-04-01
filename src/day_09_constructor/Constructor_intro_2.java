package day_09_constructor;

public class Constructor_intro_2 {
    public String brand;
    public String version;
    public String colour;
    public int year;

    public Constructor_intro_2(String brand, String version, String colour, int year) {
        this.brand = brand;
        this.version = version;
        this.colour = colour;
        this.year = year;
    }


    public Constructor_intro_2(String brand, String version, String colour) {
        this.brand = brand;
        this.version = version;
        this.colour = colour;
    }


    public Constructor_intro_2(String brand, String version) {
        this.brand = brand;
        this.version = version;
    }


    public Constructor_intro_2(String brand) {
        this.brand = brand;
    }


    public Constructor_intro_2() {
    }

    public void showInfo() {
        System.out.println("car's brand: " + brand + " version: " + version + " colour: " + colour + " and year: " + year);
    }


    @Override
    public String toString() {
        return "Constructor_intro_2{" +
                "brand='" + brand + '\'' +
                ", version='" + version + '\'' +
                ", colour='" + colour + '\'' +
                ", year=" + year +
                '}';
    }
}
