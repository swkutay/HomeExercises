package day_11_encapsulation;

public class Employee_object {
    public static void main(String[] args) {

        Encapsulation_intro enc = new Encapsulation_intro("John", 'M');

        System.out.println("enc = " + enc);

        enc.age = 14;

        System.out.println("enc = " + enc);

        Encapsulation_intro enc2 = new Encapsulation_intro("Jack",'F');

        enc2.setGender('A');

        Animal animal = new Animal("Arya","Siyam","White","Little",1,'F');

        animal.setColor("Grey");

        System.out.println(animal);

    }
}
