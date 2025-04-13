package day_13_abstraction.animalTask;

public class Cat extends Animal implements Playable{
    public Cat(String name, String color, String size, char gender, int age, String breed) {
        super(name, color, size, gender, age, breed);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating.");
    }

    public void meow(){
        System.out.println(getName()+" is meowing.");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing.");
    }
}
