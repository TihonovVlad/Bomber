package com.swapgroup.bomber.core.service;

import com.swapgroup.bomber.core.model.enums.STATUS;
import com.swapgroup.bomber.core.model.User;

import java.util.UUID;

public class TaskService {

    void createTask(User user, String phone) {

    };

    void startTask(UUID taskId) {

    };
    STATUS getTaskStatus(UUID taskId){
        return STATUS.NEW;
    }
}
