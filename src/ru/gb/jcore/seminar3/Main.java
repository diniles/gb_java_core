package ru.gb.jcore.seminar3;

public class Main {
    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();

        employeeList.add(new Freelancer("Alan", "Turing", 50));
        employeeList.add(new Freelancer("Ada", "Lovelace", 30));
        employeeList.add(new Freelancer("Bill", "Gates", 20));
        employeeList.add(new Worker("Steve", "Jobs", 3000));
        employeeList.add(new Worker("Linus", "Torvalds", 10000));
        employeeList.add(new Worker("Guido", "van Rossum", 8000));
        employeeList.add(new Freelancer("Bjarne", "Stroustrup", 100));

        System.out.println("List of employees:");
        for (Employee e : employeeList) {
            System.out.println(e);
        }

        employeeList.sort();

        System.out.println("\nSorted List of employees:");
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }
}
