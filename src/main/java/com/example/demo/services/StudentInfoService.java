package com.example.demo.services;

import com.example.demo.models.StudentInfo;
import com.example.demo.repositories.StudentInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
public class StudentInfoService {
    @Autowired
    StudentInfoRepository studentInfoRepository;
    public StudentInfo getStudentById(Long id) {
        return studentInfoRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Estudiante no encontrado con id " + id));
    }
}
