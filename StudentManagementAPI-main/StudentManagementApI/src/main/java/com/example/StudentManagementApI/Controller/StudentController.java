package com.example.StudentManagementApI.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.StudentManagementApI.Model.Student;
import com.example.StudentManagementApI.Service.StudentService;

@RestController
@RequestMapping("/api/students") // base path

public class StudentController {
    
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestParam String name,
                             @RequestParam String email,
                             @RequestParam String course) {
        studentService.save(name, email, course); // Call service method
        return "Student added";
    }
    @GetMapping("/get")
    public List<Student> getAllStudents() {
        return studentService.getStudent(); // fetch all students
    }
    @GetMapping("/get/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id); // Calls service to fetch by ID
    }
    @PutMapping("/insert/{id}")
    public String updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
        return studentService.updateStudentById(id, updatedStudent);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Long id){
        return studentService.deleteBid(id);
    }
}
