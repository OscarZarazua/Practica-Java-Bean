package com.example.springcoredojo.repository;


import com.example.springcoredojo.entity.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentRepository {

    private List<Student> studentList = new ArrayList<>();

    public StudentRepository() {
        initStudents();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void initStudents(){
        studentList = new ArrayList<>(List.of(new Student(1, "Jose"),
                new Student(2, "Maria"),
                new Student(3, "Juan"),
                new Student(4, "Carlos")));
    }
}
