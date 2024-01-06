package com.example.autoecoleflutter.repository;

import com.example.autoecoleflutter.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Integer> {
}
