package com.swapgroup.bomber.core.model;

import com.swapgroup.bomber.core.model.enums.STATUS;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.sql.Timestamp;
import java.util.Map;
import java.util.UUID;

// Задача на Бомбинг
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    private STATUS status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String,String> providersUsed;
//имя → итог, e.g. {"site1":"OK"}), сериализуется в JSONB
}
