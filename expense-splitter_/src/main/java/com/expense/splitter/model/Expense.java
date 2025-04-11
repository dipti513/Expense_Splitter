package com.expense.splitter.model;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Expense")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long expense_id;

    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    private GroupTable group;

    @ManyToOne
    @JoinColumn(name = "paid_by", nullable = false)
    private User paid_by;

    @Column(nullable = false)
    private Double amount;

    private String description;

    @Column(nullable = false)
    private LocalDateTime date = LocalDateTime.now();
}