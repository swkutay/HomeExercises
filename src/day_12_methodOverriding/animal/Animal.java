package day_12_methodOverriding.animal;

public class Animal {
    public String name,breed,color,size;
    public int age;
    public char gender;


    public Animal(String name, String breed, String color, String size, int age, char gender) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.age = age;
        this.gender = gender;
    }


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
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
