package com.example.studentmanager.repository;

import com.example.studentmanager.model.StudentTuition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentTuitionRepository extends JpaRepository<StudentTuition, UUID> {
}