package com.swapgroup.bomber.core.repository;

import com.swapgroup.bomber.core.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
