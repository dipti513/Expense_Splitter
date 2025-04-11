package com.expense.splitter.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "QueryResponse")
public class QueryResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long response_id;

    @ManyToOne
    @JoinColumn(name = "query_id", nullable = false)
    private Query query;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String response_text;

    @Column(nullable = false)
    private LocalDateTime created_at = LocalDateTime.now();
}