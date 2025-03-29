package day_06_arrays;

import java.util.Arrays;

public class Array_practice {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        double[] doNumb = new double[5];
        char[] chr = new char[5];
        boolean[] bln = new boolean[5];

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(doNumb));
        System.out.println(Arrays.toString(chr));
        System.out.println(Arrays.toString(bln));

        System.out.println("---------------------------------------");

        String[] mounths = {"Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Haziran", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};

       /* for (String each : mounths){
            System.out.println(each);
        }*/

        for (int i = 0; i < mounths.length; i++) {
            System.out.println(mounths[i]);
        }

        int[] mixNum = {5,8,-3,0,36,300,-4};

        Arrays.sort(mixNum);

        System.out.println(Arrays.toString(mixNum));

        Arrays.sort(mounths);

        System.out.println(Arrays.toString(mounths));

        String[] sortedMounths = mounths;

        System.out.println(Arrays.toString(sortedMounths));

        boolean result = Arrays.equals(mounths, sortedMounths);

        System.out.println(result);
    }
}
