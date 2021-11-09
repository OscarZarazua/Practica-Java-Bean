package com.example.springcoredojo.controller;

import com.example.springcoredojo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @Autowired
    StudentService studentServices;

    @GetMapping("/student")
    public String homePage(Model model) {
        model.addAttribute("students", studentServices.getStudents());
        return "student";
    }
}
