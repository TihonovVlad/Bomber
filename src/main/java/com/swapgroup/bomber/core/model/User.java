package com.swapgroup.bomber.core.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String telegramId;
    private String phoneNumber;
    private Timestamp createdAt;
    @OneToMany(mappedBy = "user")
    private List<Task> taskList;
}
