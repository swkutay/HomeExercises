package day_02_operators;

public class LogicalOperators {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("------------------------ && -------------------");
        System.out.println();

        boolean b1 = (5>=0) && ((4*5) == 20);
                    // true && true    ==> true

        boolean b2 = (5<=0) && ((4*5) == 20);
                   // false && true    ==> false

        boolean b3 = (5>=0) && ((4*5) != 20);
                  // true && false    ==> false

        boolean b4 = (5==0) && ((4*5) != 20);
                 // false && false    ==> false


        boolean bl1 = (5<=0) & ((4*5) == 20);
                     // false && true    ==> false

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);

        System.out.println();
        System.out.println("------------------------ || -------------------");
        System.out.println();

        boolean b5 = (5>=0) || ((4*5) == 20);
        // true || true    ==> true

        boolean b6 = (5<=0) || ((4*5) == 20);
        // false || true    ==> true

        boolean b7 = (5>=0) || ((4*5) != 20);
        // true || false    ==> true

        boolean b8 = (5==0) || ((4*5) != 20);
        // false || false    ==> false

    }
}
