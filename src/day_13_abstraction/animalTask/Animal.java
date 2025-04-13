package day_13_abstraction.animalTask;

public abstract class Animal {

    private String name;
    private String breed;
    private char gender;
    private int age;
    private String size;
    private String color;

    public static boolean canBreathe;


    //----------------------------constructor----------------------------------


    public Animal(String name, String color, String size, char gender, int age, String breed) {
        this.name = name;
        this.color = color;
        this.size = size;

        if (!(gender == 'M' || gender == 'F')){
            System.out.println("Invalid gender");
            System.exit(0);
        }

        this.gender = gender;
        setAge(age); //this.age = age;
        this.breed = breed;
    }


    //----------------------------getterSetter----------------------------------


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 500){
            System.out.println("Invalid age.");
        }
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static boolean isCanBreathe() {
        return canBreathe;
    }

    public static void setCanBreathe(boolean canBreathe) {
        Animal.canBreathe = canBreathe;
    }

    //----------------------------instanceMethods----------------------------------


    public void drink(){
        System.out.println(name+" is drinking.");
    }



    //----------------------------abstractMethods----------------------------------


    public abstract void eat();


    //----------------------------toString----------------------------------


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
