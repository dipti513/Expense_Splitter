package com.expense.splitter.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Members")
public class Members {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long member_id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    private GroupTable group;
}