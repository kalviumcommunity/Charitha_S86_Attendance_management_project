// src/com/school/Main.java
package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Attendance Management System!");

        // Create students
        Student[] students = {
            new Student("Charitha"),
            new Student("Chetan"),
            new Student("Sanjeev"),
            new Student("Sanjana")
        };

        // Create courses
        Course[] courses = {
            new Course("DBMS"),
            new Course("OOPS"),
            new Course("Computer Networks")
        };

        // Print students
        System.out.println("\n--- Student List ---");
        for (Student s : students) {
            s.displayDetails();
        }

        // Print courses
        System.out.println("\n--- Course List ---");
        for (Course c : courses) {
            c.displayDetails();
        }

        // Attendance log
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        // Add attendance records (valid + invalid)
        attendanceLog.add(new AttendanceRecord(students[0].getStudentId(), courses[0].getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(students[1].getStudentId(), courses[1].getCourseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(students[2].getStudentId(), courses[2].getCourseId(), "Late")); // invalid
        attendanceLog.add(new AttendanceRecord(students[3].getStudentId(), courses[0].getCourseId(), "Present"));

        // Display attendance log
        System.out.println("\n--- Attendance Log ---");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }
}
