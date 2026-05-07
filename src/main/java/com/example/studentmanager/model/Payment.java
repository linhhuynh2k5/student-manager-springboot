package com.example.studentmanager.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue
    private UUID id;

    private BigDecimal amountPaid;

    private LocalDateTime paymentDate;

    private Integer paymentMethod;

    private String paymentStatus;

    private String transactionRef;
}