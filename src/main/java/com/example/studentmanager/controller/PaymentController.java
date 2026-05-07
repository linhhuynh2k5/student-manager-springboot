package com.example.studentmanager.controller;

import com.example.studentmanager.model.Payment;
import com.example.studentmanager.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
@CrossOrigin
public class PaymentController {

    @Autowired
    private PaymentRepository repository;

    @GetMapping
    public List<Payment> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Payment create(@RequestBody Payment payment) {
        return repository.save(payment);
    }
}