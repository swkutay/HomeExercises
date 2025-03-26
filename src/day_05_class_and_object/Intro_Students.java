package day_05_class_and_object;

public class Intro_Students {

    String name;
    String lastname;
    int age;
    int schoolId;
    char gender;


    public void study() {
        System.out.println(name + " is studying Java.");

    }


    @Override
    public String toString() {
        return "Intro_Students{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", schoolId=" + schoolId +
                ", gender=" + gender +
                '}';
    }
}
