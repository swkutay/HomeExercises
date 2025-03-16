package day_03_conditionals;

public class If_Clauses {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("----------------- single if blocks ---------------------");
        System.out.println();


        char grade = 'B';

        boolean sart = (grade == 'A');

        if (sart) {//false
            System.out.println("Excellent");
        }

        if (grade == 'B') {//true
            System.out.println("Great Job");
        }

        if (grade == 'C') { //false
            System.out.println("Good");
        }


        if (grade == 'D') {
            System.out.println("Passed");
            System.out.println("Conditionals are over.");
        }


        System.out.println();
        System.out.println("----------------- if/else blocks ---------------------");
        System.out.println();


        if (grade == 'A') {
            System.out.println("Excellent");
        } else {
            System.out.println("Good");
        }


        System.out.println();
        System.out.println("----------------- multi if/else blocks ---------------------");
        System.out.println();


        if (grade == 'A') {
            System.out.println("Excellent");
        } else if (grade == 'B') {
            System.out.println("Great Job");
        } else if (grade == 'C') {
            System.out.println("Good");
        } else if (grade == 'D') {
            System.out.println("Passed");
        } else {
            System.out.println("Fail");
        }

    }
}
