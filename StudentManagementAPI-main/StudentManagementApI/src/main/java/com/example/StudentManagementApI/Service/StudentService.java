package com.example.StudentManagementApI.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentManagementApI.Model.Student;
import com.example.StudentManagementApI.Repository.StudentRepository;
@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public void save(String name,String email,String course){
        Student user= new Student(name,email,course);
        repository.save(user);
        System.out.println("Name: "+name+" Email: "+email+" Course: "+course);
    }
    public List<Student> getStudent(){
        return repository.findAll();
    }

    public Student getStudentById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public String updateStudentById(Long id, Student updatedStudent){
        Student find= repository.findById(id).orElse(null);
        if(find!=null){
          find.setName(updatedStudent.getName());
          find.setEmail(updatedStudent.getEmail());
          find.setCourse(updatedStudent.getCourse());
          repository.save(find);
          return "Exiting student updated";
        }else{
            return "Student not Found";
        }
    }

    public String deleteBid(Long id){
        if(repository.existsById(id)){
            repository.deleteById(id);
            return "Deleted successfully";
        }else{
            return "Records not Found";
        }
        

    }
    
}
