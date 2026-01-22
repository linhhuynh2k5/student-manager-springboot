package com.example.studentmanager.controller;

import com.example.studentmanager.model.Student;
import com.example.studentmanager.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    // YÊU CẦU 1: THÊM
    @PostMapping
    public Student add(@RequestBody Student student) {
        service.save(student);
        return student;
    }

    // YÊU CẦU 2: XÓA
    @PostMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    // YÊU CẦU 3: TÌM KIẾM
    @GetMapping("/search")
    public List<Student> search(@RequestParam String name) {
        return service.searchByName(name);
    }

    // YÊU CẦU 4: GET BY ID
    @GetMapping("/{id}")
    public Student getById(@PathVariable int id) {
        return service.getById(id);
    }

    // YÊU CẦU 5: GET ALL
    @GetMapping
    public List<Student> getAll() {
        return service.getAll();
    }

    // YÊU CẦU 6: UPDATE
    @PostMapping("/update/{id}")
    public Student update(@PathVariable int id, @RequestBody Student student) {
        student.setId(id);
        service.save(student);
        return student;
    }
}
