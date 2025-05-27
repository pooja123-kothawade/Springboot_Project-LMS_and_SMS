package com.example.studentapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.studentapi.model.Student;
import com.example.studentapi.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return repository.findById(id);
    }

    public Student updateStudent(Long id, Student studentDetails) {
        return repository.findById(id).map(student -> {
            student.setName(studentDetails.getName());
            student.setEmail(studentDetails.getEmail());
            student.setCourse(studentDetails.getCourse());
            return repository.save(student);
        }).orElseThrow(() -> new RuntimeException("Student not found with id " + id));
    }

    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}
