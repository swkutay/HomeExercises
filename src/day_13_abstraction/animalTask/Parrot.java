package day_13_abstraction.animalTask;

public class Parrot extends Animal implements Flyable,Playable{
    public Parrot(String name, String color, String size, char gender, int age, String breed) {
        super(name, color, size, gender, age, breed);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating fruit.");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" is flying.");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing.");
    }
}
