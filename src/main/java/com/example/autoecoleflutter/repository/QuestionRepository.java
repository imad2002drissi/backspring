package com.example.autoecoleflutter.repository;

import com.example.autoecoleflutter.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
