package br.com.curso.spring.Curso.de.Spring.user;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
// Imports faltando ↓
import jakarta.persistence.Entity;         
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;


import lombok.Data;

@Data
@Entity(name = "tb_users")
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)
    private String userName;
    private String name;
    private String password;  

    @CreationTimestamp
    private LocalDateTime createdAt;
}