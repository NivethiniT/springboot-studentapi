package com.example.studentapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String course;
    private int age;
    private String gender;
    private String phoneNumber;
    private String address;
    private String admissionDate;
    private double marks;

    public Student() {}

    public Student(String name, String email, String course, int age, String gender,
                   String phoneNumber, String address, String admissionDate, double marks) {
        this.name = name;
        this.email = email;
        this.course = course;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.admissionDate = admissionDate;
        this.marks = marks;
    }

    // ===== GETTERS =====
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getCourse() { return course; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getAddress() { return address; }
    public String getAdmissionDate() { return admissionDate; }
    public double getMarks() { return marks; }

    // ===== SETTERS =====
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setCourse(String course) { this.course = course; }
    public void setAge(int age) { this.age = age; }
    public void setGender(String gender) { this.gender = gender; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setAddress(String address) { this.address = address; }
    public void setAdmissionDate(String admissionDate) { this.admissionDate = admissionDate; }
    public void setMarks(double marks) { this.marks = marks; }
}
