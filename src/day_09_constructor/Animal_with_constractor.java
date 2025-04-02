package day_09_constructor;

public class Animal_with_constractor {

    /*
    String name;
    String species;
    char gender;
    int age;*/

    public String name;
    public String species;
    public char gender;
    public int age;

    public Animal_with_constractor(String name, String species, char gender, int age){
        this.name = name;
        this.species = species;
        this.gender = gender;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("animal's name: " + name + " species: " + species + " and age: " + age);
    }

    @Override
    public String toString() {
        return "Animal_with_constractor{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
