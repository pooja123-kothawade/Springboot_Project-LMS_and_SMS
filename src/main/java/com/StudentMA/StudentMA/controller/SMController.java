package com.StudentMA.StudentMA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentMA.StudentMA.model.SMModel;
import com.StudentMA.StudentMA.service.SMService;

@RestController
public class SMController {

    @Autowired
    SMService smService;

    @GetMapping("/student/details")
    public List<SMModel> getStudentDetails() {
        return smService.getStudents();
    }

    @PostMapping("/student/add")
    public String addStudent(@RequestBody SMModel student) {
        return smService.save(student);
    }

    @DeleteMapping("/student/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        return smService.deleteStudent(id);
    }

    @GetMapping("/student/get/{id}")
    public SMModel getStudentById(@PathVariable Long id) {
        return smService.getStudentById(id);
    }

}