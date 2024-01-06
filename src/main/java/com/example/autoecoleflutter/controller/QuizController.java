package com.example.autoecoleflutter.controller;

import com.example.autoecoleflutter.entity.Quiz;
import com.example.autoecoleflutter.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quizzes")
public class QuizController {
    @Autowired
    private QuizService quizService;

    @GetMapping("/{quizId}")
    public ResponseEntity<Quiz> getQuizById(@PathVariable int quizId) {
        Quiz quiz = quizService.getQuizById(quizId);
        return ResponseEntity.ok(quiz);
    }

    @GetMapping
    public ResponseEntity<List<Quiz>> getAllQuizzes() {
        List<Quiz> quizzes = quizService.getAllQuizzes();
        return ResponseEntity.ok(quizzes);
    }

    @PostMapping
    public ResponseEntity<Quiz> createQuiz(@RequestBody Quiz quiz) {
        Quiz createdQuiz = quizService.createQuiz(quiz);
        return ResponseEntity.ok(createdQuiz);
    }
}

