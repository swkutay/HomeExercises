package day_10_inheritance.animal;

public class Cat extends Animal{

    public String eyeColor;

    public Cat(String name, String breed, String color, String size, int age, char gender, String eyeColor) {
        super(name, breed, color, size, age, gender);
        this.eyeColor = eyeColor;
    }

    public void scratch(){
        System.out.println(name+" is scratching.");
    }
}
