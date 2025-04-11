package com.expense.splitter.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "GroupTable")
public class GroupTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long groupId; // Use camelCase for field names

    @Column(nullable = false)
    private String groupName; // Use camelCase for field names

    @ManyToOne
    @JoinColumn(name = "created_by", nullable = false)
    private User createdBy; // Use camelCase for field names

    // Optional: Add a list of members in the group
    @ManyToMany
    @JoinTable(
            name = "group_members", // Name of the join table
            joinColumns = @JoinColumn(name = "group_id"), // Foreign key for GroupTable
            inverseJoinColumns = @JoinColumn(name = "user_id") // Foreign key for User
    )
    private Set<User> members = new HashSet<>(); // Members of the group

    // Add a method to add members to the group
    public void addMember(User user) {
        this.members.add(user);
    }
}