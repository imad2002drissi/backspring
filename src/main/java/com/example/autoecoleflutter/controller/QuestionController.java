package com.example.autoecoleflutter.controller;

import com.example.autoecoleflutter.entity.Question;
import com.example.autoecoleflutter.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @GetMapping("/{questionId}")
    public ResponseEntity<Question> getQuestionById(@PathVariable int questionId) {
        Question question = questionService.getQuestionById(questionId);
        return ResponseEntity.ok(question);
    }

    @GetMapping
    public ResponseEntity<List<Question>> getAllQuestions() {
        List<Question> questions = questionService.getAllQuestions();
        return ResponseEntity.ok(questions);
    }

    @PostMapping
    public ResponseEntity<Question> createQuestion(@RequestBody Question question) {
        Question createdQuestion = questionService.createQuestion(question);
        return ResponseEntity.ok(createdQuestion);
    }

    @PutMapping("/{questionId}")
    public ResponseEntity<Question> updateQuestion(@PathVariable int questionId, @RequestBody Question question) {
        Question updatedQuestion = questionService.updateQuestion(questionId, question);
        return ResponseEntity.ok(updatedQuestion);
    }

    @DeleteMapping("/{questionId}")
    public ResponseEntity<Void> deleteQuestion(@PathVariable int questionId) {
        questionService.deleteQuestion(questionId);
        return ResponseEntity.ok().build();
    }
}
