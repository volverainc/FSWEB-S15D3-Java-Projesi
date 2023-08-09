package com.workintech.company.main;

import com.workintech.company.model.Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Employee> employeeList = new LinkedList<>();
        employeeList.add(new Employee(1, "Ali", "Veli"));
        employeeList.add(new Employee(2, "Ahmet", "Deli"));
        employeeList.add(new Employee(3, "Mehmet", "Kelli"));
        employeeList.add(new Employee(1, "Ece", "Tece"));
        employeeList.add(new Employee(4, "Demir", "Cihan"));
        employeeList.add(new Employee(2, "Leyla", "Yilmaz"));

        LinkedList<Employee> duplicates = new LinkedList<>();
        HashMap<Integer, Employee> uniques = new HashMap<>();

        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (!uniques.containsKey(employee.getId())) {
                uniques.put(employee.getId(), employee);
            } else {
                duplicates.add(employee);
                iterator.remove();
            }
        }

        System.out.println("Unique:");
        for (Employee employee : uniques.values()) {
            System.out.println(employee);
        }

        System.out.println("Duplicate:");
        for (Employee employee : duplicates) {
            System.out.println(employee);
        }

    }
}