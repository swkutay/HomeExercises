package day_05_class_and_object;

public class Student_objects {
    public static void main(String[] args) {

        Intro_Students student1 = new Intro_Students();

        student1.name = "Mehmet";
        student1.lastname = "Aydin";
        student1.age = 25;
        student1.gender = 'M';
        student1.schoolId = 1234567;

        System.out.println("student1 = " + student1);

        System.out.println("student1.name = " + student1.name);

        student1.study();

        System.out.println("-----------------------------------------------------------------------------------");

        Intro_Students student2 = new Intro_Students();

        student2.name = "Ahmet";
        student2.lastname = "Kaya";
        student2.gender = 'M';
        student2.age = 21;
        student2.schoolId = 23467;

        System.out.println("student2 = " + student2);

        student2.study();
    }
}
