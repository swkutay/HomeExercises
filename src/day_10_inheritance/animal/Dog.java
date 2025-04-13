package day_10_inheritance.animal;

public class Dog extends Animal{

    public Dog(String name, String breed, String color, String size, int age, char gender) {
        super(name, breed, color, size, age, gender);
    }

    public void bark(){
        System.out.println(name+" is barking");
    }

/*    public String name,breed,color,size;
    public int age;
    public char gender;


    public void eat(){
        System.out.println(name+" is eating.");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public void drink(){
        System.out.println(name+" is drinking");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }*/
}
