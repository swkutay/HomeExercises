package day_05_methods;

public class Return_type_methods {

    public static String grade(int score) {

        String result = "";

        if (score < 0 || score > 100) {
            result = "Invalid score";
        } else {
            if (score >= 90) {
                result = "A";
            } else if (score >= 80) {
                result = "B";
            } else if (score >= 70) {
                result = "C";
            } else if (score >= 60) {
                result = "D";
            } else {
                result = "Fail";
            }

        }
        return result;
    }


    public static int frequency(String str, char ch) {
        int count = 0;

        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }

        return count;
    }

    public static String days(int day) {

        String str = "";

        if (day > 0 && day < 8) {
            switch (day) {
                case 1:
                    str = "Monday";
                    break;
                case 2:
                    str = "Sunday";
                    break;
                case 3:
                    str = "Tuesday";
                    break;
                case 4:
                    str = "Wednesday";
                    break;
                case 5:
                    str = "Thursday";
                    break;
                case 6:
                    str = "Friday";
                    break;
                case 7:
                    str = "Saturday";
                    break;
                default:
                    str = "invalid";
                    break;
            }
        }

        return str;
    }
}
