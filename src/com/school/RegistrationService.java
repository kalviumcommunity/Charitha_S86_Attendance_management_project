package com.school;

import java.util.ArrayList;
import java.util.List;

public class RegistrationService {

    private FileStorageService storageService;
    private List<Person> people;
    private List<Course> courses;

    public RegistrationService(FileStorageService storageService) {
        this.storageService = storageService;
        this.people = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    // ---- STUDENT ----
    public Student registerStudent(String name, String age) {
        Student s = new Student(name, age);
        people.add(s);
        return s;
    }

    // ---- TEACHER ----
    public Teacher registerTeacher(String name, String subject) {
        Teacher t = new Teacher(name, subject);
        people.add(t);
        return t;
    }

    // ---- STAFF ----
    public Staff registerStaff(String name, String dept) {
        Staff st = new Staff(name, dept);
        people.add(st);
        return st;
    }

    // ---- COURSE ----
    public Course createCourse(String title) {
        Course c = new Course(title);
        courses.add(c);
        return c;
    }

    // ---- FIND METHODS ----
    public Student findStudentById(int id) {
        return people.stream()
                .filter(p -> p instanceof Student && p.getId() == id)
                .map(p -> (Student) p)
                .findFirst()
                .orElse(null);
    }

    public Course findCourseById(int id) {
        return courses.stream()
                .filter(c -> c.getCourseId() == id)
                .findFirst()
                .orElse(null);
    }

    // ---- GETTERS ----
    public List<Person> getAllPeople() {
        return people;
    }

    // ---- SAVE ----
    public void saveAllRegistrations() {
        storageService.saveData(people, "people_data.txt");
        storageService.saveData(courses, "course_data.txt");
    }
}
