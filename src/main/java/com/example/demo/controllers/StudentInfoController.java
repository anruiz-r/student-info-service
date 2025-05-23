package com.example.demo.controllers;

import com.example.demo.models.StudentInfo;
import com.example.demo.services.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentInfoController {

    @Autowired
    StudentInfoService studentService;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public StudentInfo getStudentInfo(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }
}

