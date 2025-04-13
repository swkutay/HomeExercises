package day_13_abstraction.animalTask;

public class Dog extends Animal implements Playable{

    public Dog(String name, String color, String size, char gender, int age, String breed) {
        super(name, color, size, gender, age, breed);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating food.");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing.");
    }
}
