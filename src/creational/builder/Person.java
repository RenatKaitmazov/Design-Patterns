package creational.builder;

/**
 * @author Renat Kaitmazov
 */

public final class Person {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    /**
     * Person class has a lot of attributes.
     * It is error-prone to pass them to the constructor.
     * The Builder pattern helps us to solve this problem.
     */
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String company;
    private String country;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    /**
     * Person class must have a private constructor.
     */

    private Person(PersonBuilder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        phoneNumber = builder.phoneNumber;
        email = builder.email;
        company = builder.company;
        country = builder.country;
    }

    /*--------------------------------------------------------*/
    /* Getters
    /*--------------------------------------------------------*/

    /**
     * The outer class (Person in our case) can have getters only.
     */

    public final String getFirstName() {
        return firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    public final String getPhoneNumber() {
        return phoneNumber;
    }

    public final String getEmail() {
        return email;
    }

    public final String getCompany() {
        return company;
    }

    public final String getCountry() {
        return country;
    }

    /*--------------------------------------------------------*/
    /* Nested classes
    /*--------------------------------------------------------*/

    /**
     * A nested builder class that helps us to build a instance
     * of the outer Person class.
     */
    public static final class PersonBuilder {

        /*--------------------------------------------------------*/
        /* Instance variables
        /*--------------------------------------------------------*/

        private String firstName;
        private String lastName;
        private String phoneNumber;
        private String email;
        private String company;
        private String country;

        /**
         * The builder itself can have setters only.
         */

        public final PersonBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public final PersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public final PersonBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public final PersonBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public final PersonBuilder setCompany(String company) {
            this.company = company;
            return this;
        }

        public final PersonBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        /**
         * Every builder class must have such a method
         * that produces the desired instance of the class we build.
         */
        public final Person build() {
            return new Person(this);
        }
    }
}
