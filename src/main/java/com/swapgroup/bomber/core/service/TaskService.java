package com.swapgroup.bomber.core.service;

import com.swapgroup.bomber.core.model.enums.STATUS;
import com.swapgroup.bomber.core.model.User;

public class TaskService {

    void createTask(User user, String phone) {

    };

    void startTask(Long taskId) {

    };
    STATUS getTaskStatus(Long taskId){
        return STATUS.NEW;
    }
}
