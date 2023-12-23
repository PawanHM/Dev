package com.ds;

public class StudentTest implements Cloneable{
    String name;
    public StudentTest(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        StudentTest test = new StudentTest("Pawan");
        StudentTest test1 = new StudentTest("Pawan");
        System.out.println(test == test1);
        System.out.println(test.equals(test1));


        StudentTest test2 = (StudentTest)test.clone();
        System.out.println("test2 "+test2);

    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof StudentTest) {
            StudentTest test1 = (StudentTest) obj;
            if (name.equals(test1.name)) {
                return true;
            } else return false;
        } else return false;
    }
}
