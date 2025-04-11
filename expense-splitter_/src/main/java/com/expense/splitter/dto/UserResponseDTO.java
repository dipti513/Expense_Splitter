package com.expense.splitter.dto;

public class UserResponseDTO {
    private Long id;
    private String username;
    private String email;
    private String phoneNumber;
    private String role;

    public UserResponseDTO(Long id, String username, String email, String phoneNumber, String role) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.role = role;
    }

    // Getters
    public Long getId() { return id; }
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getRole() { return role; }
}
