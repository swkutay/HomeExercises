package day_07_class_and_object;

public class Cars {

    String brand;
    String version;
    String colour;

    @Override
    public String toString() {
        return "Cars{" +
                "brand='" + brand + '\'' +
                ", version='" + version + '\'' +
                ", colour='" + colour + '\'' +
                ", year=" + year +
                '}';
    }

    int year;

    public void showInfo(){
        System.out.println("car's brand: "+brand+" version: "+version+" colour: "+colour+" and year: "+year);
    }


}
