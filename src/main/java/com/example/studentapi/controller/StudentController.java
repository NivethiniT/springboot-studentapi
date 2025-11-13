package com.example.studentapi.controller;

import com.example.studentapi.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private List<Student> students = new ArrayList<>();
    private Long counter = 1L;

    @GetMapping
    public List<Student> getAllStudents() {
        return students;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        student.setId(counter++);
        students.add(student);
        return student;
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                s.setName(updatedStudent.getName());
                s.setEmail(updatedStudent.getEmail());
                s.setCourse(updatedStudent.getCourse());
                s.setAge(updatedStudent.getAge());
                s.setGender(updatedStudent.getGender());
                s.setPhoneNumber(updatedStudent.getPhoneNumber());
                s.setAddress((updatedStudent.getAddress()));
                s.setAdmissionDate(updatedStudent.getAdmissionDate());
                s.setMarks(updatedStudent.getMarks());
                return s;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        students.removeIf(s -> s.getId().equals(id));
        return "Deleted student with id " + id;
    }
}
