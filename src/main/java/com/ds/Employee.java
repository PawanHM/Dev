package com.ds;

public class Employee implements Cloneable{

    private String name;
    private Student student;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", student=" + student +
                '}';
    }
    private Integer rollNo;

    public void setStudent(Student student) {
        this.student = student;
    }
    public Employee(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student s = new Student(this.name, this.rollNo);
        Employee e = new Employee(this.name);
        e.setStudent(s);
        return e;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Student s = new Student("Pawan", 123);
        Employee e = new Employee("Rohit");
        e.setStudent(s);
        System.out.println(e);
        Employee e1 = (Employee) e.clone();

        e.setStudent(new Student("Ravi", 321));
        System.out.println(e1);
    }
}
