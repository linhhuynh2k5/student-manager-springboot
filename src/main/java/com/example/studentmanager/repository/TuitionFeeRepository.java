package com.example.studentmanager.repository;

import com.example.studentmanager.model.TuitionFee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TuitionFeeRepository extends JpaRepository<TuitionFee, UUID> {
}