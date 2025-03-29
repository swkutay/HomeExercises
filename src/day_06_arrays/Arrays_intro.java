package day_06_arrays;

import java.util.Arrays;

public class Arrays_intro {
    public static void main(String[] args) {
        String[] myGroup = new String[5];
        System.out.println("myGroup = " + myGroup); //myGroup = [Ljava.lang.String;@5f184fc6

        System.out.println("myGroup = " + Arrays.toString(myGroup)); //myGroup = [null, null, null, null, null]

        myGroup[0] = "Ahmet";
        myGroup[1] = "Mehmet";
        myGroup[2] = "Ali";
        myGroup[3] = "Veli";
        myGroup[4] = "Ahmet";

        System.out.println("myGroup = " + Arrays.toString(myGroup)); // myGroup = [Ahmet, Mehmet, Ali, Veli, Ahmet]

        System.out.println("--------------------------------------------------------------------------------");

        String[] daysOftheWeek = {"Pazartesi","Sali","Carsamba","Persembe","Cuma","Cumartresi", "Pazar"};

        System.out.println("daysOftheWeek = " + Arrays.toString(daysOftheWeek));

        System.out.println("daysOftheWeek[2] = " + daysOftheWeek[2]);

        for (String eachDay : daysOftheWeek) {
            System.out.println(eachDay);
        }

    }
}
