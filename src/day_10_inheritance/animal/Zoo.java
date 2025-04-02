package day_10_inheritance.animal;

public class Zoo {
    public static void main(String[] args) {

        System.out.println();

        Animal animal1 = new Animal("Arya","Siyam","White","Small",1,'F');

        System.out.println("animal1 = " + animal1);

        animal1.drink();
        animal1.eat();
        animal1.sleep();

        Dog dog1 = new Dog("Fındık","Fino","Yellow","Little",5,'M');

        System.out.println("dog1 = " + dog1);

        dog1.bark();

        dog1.drink();
        dog1.eat();
        dog1.sleep();

        Tiger tiger1 = new Tiger("Gandalf","Tiger","Orange","Big",7,'F');

        System.out.println("tiger1 = " + tiger1);

        tiger1.hunt();
        tiger1.roar();

        tiger1.drink();
        tiger1.eat();
        tiger1.sleep();

        Cat cat1 = new Cat("Pamuk","Tekir","Brown","Middle",4,'M',"Blue");

        System.out.println("cat1 = " + cat1);

        cat1.scratch();

        cat1.drink();
        cat1.eat();
        cat1.sleep();

    }
}
