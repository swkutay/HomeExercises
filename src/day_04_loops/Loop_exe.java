package day_04_loops;

import java.util.Scanner;

public class Loop_exe {
    public static void main(String[] args) {

        String str1 = "Hello World";
                     //012345678910
        char chr;
    //    int i = 0;

        Scanner input = new Scanner(System.in);

       /* int lengthOfStr1=str1.length();
        System.out.println("lengthOfStr1 = " + lengthOfStr1);*/

        for (int i = 0; i < str1.length(); i++) {//i=0, 1, 2, 3 ...10, 11
            chr = str1.charAt(i);// H e l...d
            System.out.print(chr + "_");// H_e_l_ .._d_
            //i+=2;
        }

        System.out.println();

        for (int i = str1.length()-1; i >= 0; i--) {
            chr = str1.charAt(i);// H e l...d
            System.out.print(chr + "_");// H_e_l_ .._d_
            //i-=2;
        }

        System.out.println("-----------------------while loop----------------------");


        System.out.println("How old are you? ");
        int age = input.nextInt();


        while (!(age >= 18 && age <= 120)){
            System.out.println("You're not eligible to vote");
            System.out.println("Enter your age ");
            age = input.nextInt();
        }


        System.out.println("Are you a Turkish citizen? (Y/N)");

        String str2 = input.next();

        str2 = str2.toLowerCase();

        while (!(str2.equals("y") || str2.equals("n"))){
            System.out.println("Invalid entry. Please retry");
            str2 = input.next().toLowerCase();
        }

        System.out.println();

        if (str2.equals("y")){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You're not eligible to vote");
        }

    }
}
