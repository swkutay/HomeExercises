package day_08_class_and_object;

public class Animal_objects {
    public static void main(String[] args) {
        Animals animal1 = new Animals();

        animal1.name = "Gandalf";
        //animal1.gender = 'M';
        animal1.age = 3;
        animal1.species = "Cat";
        //animal1.breed = "British Short Hair";

        System.out.println("animal1 = " + animal1);

        animal1.playing();

        animal1.hunting();
    }
}
