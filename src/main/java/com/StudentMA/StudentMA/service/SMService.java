package com.StudentMA.StudentMA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentMA.StudentMA.model.SMModel;
import com.StudentMA.StudentMA.repository.SMRepository;

@Service
public class SMService {

    @Autowired
    SMRepository smRepository;

    public List<SMModel> getStudents() {
        return smRepository.findAll();
    }

    public String save(SMModel student) {
        smRepository.save(student);
        return "Student added successfully";
    }

    public String deleteStudent(Long id) {
        smRepository.deleteById(id);
        return "Student deleted successfully";
    }

    public SMModel getStudentById(Long id) {
        return smRepository.findById(id).orElse(null);
    }
}