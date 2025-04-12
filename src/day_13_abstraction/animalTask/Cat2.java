package day_13_abstraction.animalTask;

public class Cat2 extends Cat{
    public Cat2(String name, String color, String size, char gender, int age, String breed) {
        super(name, color, size, gender, age, breed);
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Gandalf","Gray","Middle",'M',3,"British");

        cat1.eat();
    }



}
