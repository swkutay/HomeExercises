package day_05_methods;

public class Static_methods {


    public static void evenNumbers() {
        for (int i = 0; i < 11; i += 2) {
            System.out.println(i);
        }
    }


    public static void toplama(int num1, int num2) {
        System.out.println(num1 + num2);

    }

    public static void toplama(double num1, double num2) {
        System.out.println(num1 + num2);
    }

    public static void toplama(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }


    public static void toplama(int num1, int num2, int num3, int num4) {
        System.out.println(num1 + num2 + num3 + num4);
    }

    public static void toplama(double num1, int num2) {
        System.out.println(num1 + num2);
    }


    public static void toplama(int num1, double num2) {
        System.out.println(num1 + num2);
    }

    public static void main(String[] args) {
        toplama(12,5.5);
    }


}
