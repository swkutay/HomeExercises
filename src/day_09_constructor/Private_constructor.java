package day_09_constructor;

public class Private_constructor {

    //Bu class öğrenci bilgileri için oluşturulmuştur

    private String firstName;
    private String lastName;
    private char gender;
    private int schoolNumber;
    private int age;


    public Private_constructor(String firstName, String lastName, char gender, int schoolNumber, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.schoolNumber = schoolNumber;
        this.age = age;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0 || age >=150){
            System.out.println("Doğru yaş aralığı girmediniz");
        }else{
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Private_constructor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", schoolNumber=" + schoolNumber +
                ", age=" + age +
                '}';
    }
}
