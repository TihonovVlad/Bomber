package com.swapgroup.bomber.core.model;

import com.swapgroup.bomber.core.model.enums.STATUS;

import java.sql.Timestamp;
import java.util.UUID;

// Задача на Бомбинг
public class Task {
    private UUID id;
    private User user;
    private String number;
    private STATUS status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
//    private List<Provider> providersUsed;
}
