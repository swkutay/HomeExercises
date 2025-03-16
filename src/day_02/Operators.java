package day_02;

public class Operators {
    public static void main(String[] args) {
        System.out.println("**************************** CONCATENATION ************************************************");

        int int_1 = 10;
        int int_2 = 20;

        System.out.println("int_1 = " + int_1); //10
        System.out.println("int_2 = " + int_2); //20

        System.out.println("(int_1+int_2) = " + (int_1 + int_2)); //30
        System.out.println("(int_1+int_2) = " + ("" + int_1 + int_2));  // int_1+int_2) = 1020
        System.out.println("(int_1+int_2) = " + (int_1 + int_2) + (" " + int_1 + int_2));  //(int_1+int_2)= 30 1020

        String name = "Kutay";
        String lastName = "Kayhan";

        System.out.println(int_1+int_2+name+int_1+int_2); //30Kutay1020
        System.out.println(int_1+int_2+name+(int_1+int_2)); //30Kutay30

        System.out.println("\""+name + " " + lastName+"\""); //KutayKayhan


        int num1 = ((2 + 1) - 3) * 5 * 4 / 2 - 5;
        System.out.println("num1 = " + num1); // -5

        num1++; // num1=num1+1
        ++num1; // num1=num1+1

        System.out.println("num1 = " + num1);//-4

        int num=5;
        System.out.println("num = " + num);//5
        System.out.println("++num = "+ ++num);//6 ==> 6
        System.out.println("num++ = " + num++);//6 ==> 7
        System.out.println("num = " + num);//7

        System.out.println("num-- = " + num--); //num=num-1;   7 ==> 6
        System.out.println("--num = " + --num);// 5 ==> 5
        System.out.println("num = " + num);

    }
}
