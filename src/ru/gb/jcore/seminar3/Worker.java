package ru.gb.jcore.seminar3;

public class Worker extends Employee {
    private final double salary;

    public Worker(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return super.toString() + " $" + this.getSalary();
    }
}
