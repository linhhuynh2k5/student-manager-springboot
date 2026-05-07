package com.example.studentmanager.controller;

import com.example.studentmanager.model.StudentTuition;
import com.example.studentmanager.repository.StudentTuitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tuition")
@CrossOrigin
public class TuitionController {

    @Autowired
    private StudentTuitionRepository repository;

    @GetMapping
    public List<StudentTuition> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public StudentTuition create(@RequestBody StudentTuition tuition) {
        return repository.save(tuition);
    }
}