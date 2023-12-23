package com.ds;

public class Student {
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    private Integer rollNo;

    public Student(String name, Integer rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

//    public boolean equals(Object obj) {
//        try {
//            String name1 = this.name;
//            Integer rollNo1 = this.rollNo;
//
//            Student s2 = (Student) obj;
//            String name2 = s2.name;
//            Integer rollNo2 = s2.rollNo;
//
//            if (name1.equals(name2) && rollNo1 == rollNo2) {
//                return true;
//            } else return false;
//        } catch (ClassCastException e) {
//            return false;
//        } catch (NullPointerException e) {
//            return false;
//        }
//    }

//    public boolean equals(Object obj) {
//        try {
//            Student s2 = (Student) obj;
//            if (name.equals(s2.name) && rollNo == s2.rollNo)
//                return false;
//            else return false;
//        } catch (ClassCastException e) {
//            return false;
//        } catch (NullPointerException e) {
//            return false;
//        }
//    }

//    public boolean equals(Object o) {
//        if (this == o)
//            return true;
//        if (o instanceof Student) {
//            Student s = (Student) o;
//            if (name.equals(s.name) && rollNo == s.rollNo)
//                return true;
//            else return false;
//        } else return false;
//    }
}
