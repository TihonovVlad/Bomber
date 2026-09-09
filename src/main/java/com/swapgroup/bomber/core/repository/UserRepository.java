package com.swapgroup.bomber.core.repository;

import com.swapgroup.bomber.core.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
