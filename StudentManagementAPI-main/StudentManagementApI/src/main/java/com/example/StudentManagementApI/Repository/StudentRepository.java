package com.example.StudentManagementApI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentManagementApI.Model.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
