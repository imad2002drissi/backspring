package com.example.autoecoleflutter.repository;

import com.example.autoecoleflutter.entity.QuestionAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionAnswerRepository extends JpaRepository<QuestionAnswer, Integer> {
}
