package ru.gb.jcore.seminar3;

public class Freelancer extends Employee {

    private final double ratePerHour;

    public Freelancer(String firstName, String lastName, double ratePerHour) {
        super(firstName, lastName);
        this.ratePerHour = ratePerHour;
    }

    @Override
    public double getSalary() {
        return 20.8 * 8 * ratePerHour;
    }

    @Override
    public String toString() {
        return super.toString() + " $" + this.getSalary();
    }
}
