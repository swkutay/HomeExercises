package day_13_abstraction.animalTask;

public class Zoo {
    public static void main(String[] args) {

        //----------------------------objects------------------------------

        Cat cat = new Cat("Arya","White","Little",'F',1,"Siyam");

        Cat2 cat2 = new Cat2("Bella","Gray","Little",'F',0,"Siyam");

        Dog dog = new Dog("Fındık","Yellow","Little",'M',6,"Fino");

        Eagle eagle = new Eagle("John","Black","Big",'M',4,"American");

        Parrot parrot = new Parrot("Jack","Blue","Middle",'F',6,"Brazilian");

        Tiger tiger = new Tiger("Frank","Orange","Big",'F',7,"Chinese");


        System.out.println("cat = " + cat);

        System.out.println("cat2 = " + cat2);

        System.out.println("dog = " + dog);

        System.out.println("eagle = " + eagle);

        System.out.println("parrot = " + parrot);

        System.out.println("tiger = " + tiger);



        cat.eat();

        cat2.eat();

        dog.eat();

        eagle.eat();

        parrot.eat();

        tiger.eat();


        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println();


        parrot.fly();

        eagle.fly();


        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println();

        cat.play();

        cat2.play();

        parrot.play();

        dog.play();


        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println();

        tiger.hunt();

        eagle.hunt();



    }
}
