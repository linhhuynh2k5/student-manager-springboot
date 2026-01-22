package com.example.studentmanager.service;

import com.example.studentmanager.model.Student;
import com.example.studentmanager.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public List<Student> getAll() {
        return repo.findAll();
    }

    public Student getById(int id) {
        return repo.findById(id).orElse(null);
    }

    public void save(Student student) {
        repo.save(student);
    }

    public void delete(int id) {
        repo.deleteById(id);
    }

    public List<Student> searchByName(String keyword) {
        return repo.findByNameContainingIgnoreCase(keyword);
    }
}
