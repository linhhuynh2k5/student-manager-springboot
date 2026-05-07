package com.example.studentmanager.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
@Table(name = "tuition_fees")
public class TuitionFee {

    @Id
    @GeneratedValue
    private UUID id;

    private String courseYear;

    private BigDecimal pricePerCredit;

    private BigDecimal baseTuition;

    private LocalDate effectiveDate;

    private Boolean isActive;
}