package day_10_inheritance.employee;

public class Office {
    public static void main(String[] args) {

        Developer developer1 = new Developer("Elon",'M',29,3.000);
        System.out.println("developer1 = " + developer1);

        ProductOwner productOwner1 = new ProductOwner("Jack",'M',34,2.500);
        System.out.println("productOwner1 = " + productOwner1);

        QualityAssurance qualityAssurance1 = new QualityAssurance("Jasmine",'F',37,2.800);
        System.out.println("qualityAssurance1 = " + qualityAssurance1);
    }
}
