package day_13_abstraction;

import day_13_abstraction.animalTask.Flyable;

public class Aircraft implements Flyable {
    @Override
    public void fly() {
        System.out.println("Aircraft is flying.");
    }
}
