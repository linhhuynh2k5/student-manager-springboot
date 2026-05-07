package com.example.studentmanager.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
@Table(name = "student_tuition")
public class StudentTuition {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "total_credits")
    private Integer totalCredits;

    @Column(name = "raw_amount")
    private BigDecimal rawAmount;

    @Column(name = "scholarship_deduction")
    private BigDecimal scholarshipDeduction;

    @Column(name = "exemption_amount")
    private BigDecimal exemptionAmount;

    @Column(name = "net_amount")
    private BigDecimal netAmount;

    @Column(name = "paid_amount")
    private BigDecimal paidAmount;

    @Column(name = "debt_amount")
    private BigDecimal debtAmount;

    private Integer status;

    private LocalDate deadline;
}