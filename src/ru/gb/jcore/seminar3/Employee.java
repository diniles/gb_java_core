package ru.gb.jcore.seminar3;

public abstract class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public abstract double getSalary();

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

}
