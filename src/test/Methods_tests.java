package test;

import day_05_methods.Instance_methods;
import day_05_methods.Return_type_methods;
import day_05_methods.Static_methods;

public class Methods_tests {
    public static void main(String[] args) {

        int frequencyOfChar;

        Static_methods.evenNumbers();

        Static_methods.toplama(5,6);

        Static_methods.toplama(6.5, 7.4);

        Instance_methods message = new Instance_methods();

        message.greetings();

        message.ageOfaPerson(1990);

        System.out.println((Return_type_methods.grade(78)));

        frequencyOfChar = Return_type_methods.frequency("AAABBBCCDC",'A');
        System.out.println("frequencyOfChar = " + frequencyOfChar);
    }
}
