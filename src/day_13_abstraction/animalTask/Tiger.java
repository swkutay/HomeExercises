package day_13_abstraction.animalTask;

public class Tiger extends Animal implements WildAnimal{
    public Tiger(String name, String color, String size, char gender, int age, String breed) {
        super(name, color, size, gender, age, breed);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating a deer.");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting.");
    }
}
