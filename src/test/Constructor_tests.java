package test;

import day_09_constructor.Constructor_intro;
import day_09_constructor.Constructor_intro_2;
import day_09_constructor.Private_constructor;

public class Constructor_tests {
    public static void main(String[] args) {

        Constructor_intro cnt = new Constructor_intro();

        cnt.brand = "BMW";
        cnt.version = "IX";
        cnt.colour = "White";
        cnt.year = 2021;

        cnt.showInfo();

        System.out.println(cnt);

        System.out.println(cnt.brand);



        System.out.println();
        System.out.println("-----------------------------------------------------------");
        System.out.println();


        Constructor_intro_2 cnt2 = new Constructor_intro_2("Volvo","S40","White",2011);

        System.out.println(cnt2);


        Constructor_intro_2 cnt3 = new Constructor_intro_2();


        System.out.println();
        System.out.println("-----------------------------------------------------------");
        System.out.println();


        Private_constructor student1 = new Private_constructor("Jack","John",'M',1234567,19);

        System.out.println(student1);


        student1.setFirstName("Ahmet");

        System.out.println(student1.getFirstName());

        student1.setAge(-100);
        System.out.println(student1.getAge());


    }
}
