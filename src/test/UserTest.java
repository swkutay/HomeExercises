package test;

public class UserTest {
    public static void main(String[] args) {
        User ali = new User.UserBuilder("Ayşe",
                "Çalışkan")
                .age(25)
                .phone("1234567890")
                .address("Topkapi, İstanbul")
                .build();
    }
}
