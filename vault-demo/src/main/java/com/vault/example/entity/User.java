package com.vault.example.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "uuid",updatable = false,nullable = false,unique = true)
    private UUID uuid;
    @Column(name = "username",nullable = false,unique = true)
    private String username;
    @Column(name = "password",nullable = false)
    private String password;
    @Column(name = "created_at",nullable = false)
    private LocalDate createdAt;

    @PrePersist
    void prePersistUUID(){
        createdAt=LocalDate.now();
    }
}
