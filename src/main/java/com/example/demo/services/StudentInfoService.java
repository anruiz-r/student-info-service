package com.example.demo.services;

import com.example.demo.models.StudentInfo;
import com.example.demo.repositories.StudentInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentInfoService {
    @Autowired
    private StudentInfoRepository studentInfoRepository;
    public StudentInfo getStudentById(Long id) {
        return studentInfoRepository.getById(id);
    }
}
