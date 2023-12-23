package com.example.demo;

import com.example.pojo.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ApplicationTest {
    public static void main(String[] args) {
        System.out.println("hello");
        ApplicationTest test = new ApplicationTest();
        List<Employee> employees =  test.createEmployeeList();
        Map<String, List<Employee>> emp = employees.stream().collect(Collectors.groupingBy(Employee::getCity));
        emp.forEach((key, value) -> System.out.println(key+"  "+value));
    }

    public  List<Employee> createEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee();
        employee1.setCity("Patna");
        employee1.setEmail("pawan@gmail.com");
        employee1.setName("Abhishek");
        employee1.setState("Bihar");

        Employee employee2 = new Employee();
        employee2.setName("Monika");
        employee2.setEmail("monika@gmail.com");
        employee2.setCity("Gorakhpur");
        employee2.setState("Up");

        Employee employee3 = new Employee();
        employee3.setName("Prakash");
        employee3.setEmail("prakash@gmail.com");
        employee3.setCity("Gorakhpur");
        employee3.setState("Up");

        Employee employee4 = new Employee();
        employee4.setName("Nipu");
        employee4.setEmail("nipu@gmail.com");
        employee4.setCity("Patna");
        employee4.setState("Bihar");

        Employee employee5 = new Employee();
        employee5.setCity("Patna");
        employee5.setEmail("pawan@gmail.com");
        employee5.setName("Pawan");
        employee5.setState("Bihar");

        Employee employee6 = new Employee();
        employee6.setCity("Patna");
        employee6.setEmail("pawan@gmail.com");
        employee6.setName("Abhinov");
        employee6.setState("Bihar");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);

        return employees;
    }
}
