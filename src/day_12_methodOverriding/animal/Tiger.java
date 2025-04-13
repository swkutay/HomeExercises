package day_12_methodOverriding.animal;

public class Tiger extends Animal {
    public Tiger(String name, String breed, String color, String size, int age, char gender) {
        super(name, breed, color, size, age, gender);
    }

    public void hunt(){
        System.out.println(name+" is hunting");
    }

    public void roar(){
        System.out.println(name+" is roaring");
    }

    public void eat(){
        System.out.println(name+" is eating a deer.");
    }
}
