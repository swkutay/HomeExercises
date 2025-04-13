package test;

public class User {
    private final String firstName; // gerekli
    private final String lastName; // gerekli
    private final int age; // opsiyonel
    private final String phone; // opsiyonel
    private final String address; // opsiyonel


    // ---------------------- Constructor ==> Parameter UserBuilder tipinde. ---------------------------------

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    // ---------------------------- Getters (Private değişkenler için) ---------------------------------

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }


    // ---------------------------- INNER CLASS ---------------------------------

    public static class UserBuilder { // inner class

        //   --------------------- Değişkenler (Variables) esas outer class ile aynı ---------------------------------
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;

        // ---------------------------- INNER CLASS Constructors ---------------------------------

        public UserBuilder(String firstName,
                           String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }


        // ---------------------------- Methods ---------------------------------
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }
        public User build() { return new User(this);
        }
    }
}
