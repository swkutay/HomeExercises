package day_10_inheritance.employee;

public class Employee {

    public String name;
    public char gender;
    public int age;
    public double salary;

    public Employee(String name, char gender, int age, double salary){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
