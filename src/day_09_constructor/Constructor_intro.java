package day_09_constructor;

public class Constructor_intro {

    public String brand;
    public String version;
    public String colour;
    public int year;

    public void showInfo(){
        System.out.println("car's brand: "+brand+" version: "+version+" colour: "+colour+" and year: "+year);
    }

/*
    public static void main(String[] args) {
        Constructor_intro cnr = new Constructor_intro();

    }
*/


    @Override
    public String toString() {
        return "Constructor_intro{" +
                "brand='" + brand + '\'' +
                ", version='" + version + '\'' +
                ", colour='" + colour + '\'' +
                ", year=" + year +
                '}';
    }
}
