package com.example.autoecoleflutter.repository;

import com.example.autoecoleflutter.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}