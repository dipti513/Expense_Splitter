package com.expense.splitter.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ExpenseShare")
public class ExpenseShare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Primary key with AUTO_INCREMENT

    @ManyToOne
    @JoinColumn(name = "expense_id", nullable = false)
    private Expense expense;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private Double amount;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentStatus payment_status = PaymentStatus.PENDING;

    public enum PaymentStatus {
        PENDING, PAID
    }
}