package br.com.curso.spring.Curso.de.Spring.task;
import java.util.UUID;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import jakarta.persistence.Column;

@Data
@Entity(name = "tb_tasks")
public class TaskMoldel {
    
    @Id
    @Generated(value = "UUID")
    private UUID id;
    private String description;

    @Column(length = 50)
    private String Title;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String priority;

    private UUID idUser;
    @CreationTimestamp
    private LocalDateTime createdAt;



}
