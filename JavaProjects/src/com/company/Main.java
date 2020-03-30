package com.company;

import java.util.ArrayList;


class Student{
    String name;
    float point;
    int age;

    public Student(String name, float point, int age) {
        this.name = name;
        this.point = point;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Department{
    private String name;
    private ArrayList<Student> arrayList;

    public Department(String name, ArrayList<Student> arrayList) {
        this.name = name;
        this.arrayList = arrayList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Student> arrayList) {
        this.arrayList = arrayList;
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello\n");
	    System.out.println("Hello World");

	    ArrayList<Student> arrayList = new ArrayList<Student>(3);

	    Department departmentCS = new Department("Computer Science", arrayList);
        Department departmentMath = new Department("Math", arrayList);

	    System.out.println(departmentCS.getName());
	    System.out.println(departmentMath.getArrayList());

    }
}
