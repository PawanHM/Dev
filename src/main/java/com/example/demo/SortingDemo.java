package com.example.demo;

import com.example.pojo.Employee;

import java.util.Comparator;
import java.util.List;

public class SortingDemo {
    public static void main(String[] args) {
        ApplicationTest test = new ApplicationTest();
        List<Employee> employees =  test.createEmployeeList();
       // System.out.println("Before sorting ");
       // employees.forEach(employee -> System.out.println(employee.getName()+"  "+employee.getCity()));
        employees.sort(Comparator.comparing(Employee::getName).reversed());
        System.out.println("After sorting");
        employees.forEach(employee -> System.out.println(employee.getName()+"  "+employee.getCity()));

    }

}
