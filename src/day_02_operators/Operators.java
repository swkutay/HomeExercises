package day_02_operators;

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

        System.out.println(int_1 + int_2 + name + int_1 + int_2); //30Kutay1020
        System.out.println(int_1 + int_2 + name + (int_1 + int_2)); //30Kutay30

        System.out.println("\"" + name + " " + lastName + "\""); //KutayKayhan


        int num1 = ((2 + 1) - 3) * 5 * 4 / 2 - 5;
        System.out.println("num1 = " + num1); // -5

        num1++; // num1=num1+1
        ++num1; // num1=num1+1

        System.out.println("num1 = " + num1);//-4

        int num = 5;
        System.out.println("num = " + num);//5
        System.out.println("++num = " + ++num);//6 ==> 6
        System.out.println("num++ = " + num++);//6 ==> 7
        System.out.println("num = " + num);//7

        System.out.println("num-- = " + num--); //num=num-1;   7 ==> 6
        System.out.println("--num = " + --num);// 5 ==> 5
        System.out.println("num = " + num);

        System.out.println();
        System.out.println("************************ pre and post increment/decrement ******************");
        System.out.println();

        int a = 25;
        System.out.println("++a = " + ++a); //26
        System.out.println("--a = " + --a); //25

        int b = 25;
        System.out.println("b++ = " + b++);//25 -> 26
        System.out.println("b-- = " + b--);//26 -> 25

        a += 5; //a = a +5
        b -= 5; //b = b-5

        a *= 2; //a = a*2
        b /= 2; // b = b/2

        b %= 3; //b = b%3

        System.out.println();
        System.out.println("************************ exercises ******************");
        System.out.println();


        System.out.println("-------------------------------- E-1 ----------------");

        int x = 9;
        float y = x / 2f;
        int z = x / 2;

        System.out.println("y = " + y);
        System.out.println("z = " + z);


        System.out.println("-------------------------------- E-2 ----------------");

        String str1 = "Precious";
        String str2 = "Team";
        int group = 12;

        System.out.println(str1+" "+str2+" group-"+group);


        System.out.println("-------------------------------- E-3 ----------------");

        int num11 = 19;
        System.out.println("num11 = " + num11);

        int num12 = -5;
        System.out.println("num11%num12 = " + num11 % num12);
    }
}
