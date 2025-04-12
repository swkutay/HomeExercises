package day_13_abstraction.animalTask;

public class Eagle extends Animal implements Flyable,WildAnimal{
    public Eagle(String name, String color, String size, char gender, int age, String breed) {
        super(name, color, size, gender, age, breed);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating a snake.");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" is flying.");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting.");
    }
}
