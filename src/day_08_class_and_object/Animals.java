package day_08_class_and_object;

public class Animals {

    String breed;
    String name;
    String species;
    char gender;
    int age;

    @Override
    public String toString() {
        return "Animals{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    int height;
    int weight;


    public void hunting(){
        System.out.println(name + " is hunting.");
    }

    public void playing(){
        System.out.println(name + " is playing with toys.");
    }
}
