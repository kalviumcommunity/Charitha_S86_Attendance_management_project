// src/com/school/Student.java
package com.school;

public class Student {
    private static int nextStudentIdCounter = 1; // auto ID generator
    private String name;
    private int studentId;

    public Student(String name) {
        this.name = name;
        this.studentId = nextStudentIdCounter++;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    // Display method
    public void displayDetails() {
        System.out.println("Student ID: S" + studentId + ", Name: " + name);
    }
}
