package model;

public class Employee {

    // instance Fields
    private final String name;
    private final int age;
    private final String department;
    private final String email;
    private final double salary;

    // Private constructor with builder bean passed as input
    private Employee(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.department = builder.department;
        this.email = builder.email;
        this.salary = builder.salary;
    }

    // Static inner Builder class
    public static class Builder {

        private String name;
        private int age;
        private String department;
        private String email;
        private double salary;

        // separate constructor for each field when building builder object, where each returns the builder object back
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder department(String department) {
            this.department = department;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder salary(double salary) {
            this.salary = salary;
            return this;
        }
        // build() builds employee object from builder object
        public Employee build() {
            return new Employee(this);
        }
    }

    public static void main(String[] args) {
        //creating bean of inner static class.
        //fluent methods OR method chaining pattern, by calling builder constructors
        Employee employee = new Employee.Builder()
                .age(12)
                .department("electrical")
                .email("sample@gmail.com")
                .name("raj")
                .salary(131141414)
                .build();
    }
}
