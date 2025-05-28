package com.StudentMA.StudentMA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentMA.StudentMA.model.SMModel;

public interface SMRepository extends JpaRepository<SMModel, Long> {

}