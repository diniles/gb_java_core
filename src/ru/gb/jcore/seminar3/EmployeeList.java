package ru.gb.jcore.seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeList implements Iterable<Employee> {
    private final ArrayList<Employee> employees;

    public EmployeeList() {
        this.employees = new ArrayList<>();
    }

    public void add(Employee employee) {
        employees.add(employee);
    }

    public void sort() {
        Collections.sort(employees);
    }

    @Override
    public Iterator<Employee> iterator() {
        int[] index = {0};
        return new Iterator<Employee>() {
            @Override
            public boolean hasNext() {
                return index[0] < employees.size();
            }

            @Override
            public Employee next() {
                return employees.get(index[0]++);
            }
        };
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Employee e : employees) {
            stringBuilder.append(employees).append("\n");
        }
        return stringBuilder.toString();
    }
}
