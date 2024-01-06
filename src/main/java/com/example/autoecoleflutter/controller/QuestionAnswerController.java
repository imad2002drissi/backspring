package com.example.autoecoleflutter.controller;

import com.example.autoecoleflutter.entity.QuestionAnswer;
import com.example.autoecoleflutter.service.QuestionAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/question-answers")
public class QuestionAnswerController {
    @Autowired
    private QuestionAnswerService questionAnswerService;

    @GetMapping("/{answerId}")
    public ResponseEntity<QuestionAnswer> getQuestionAnswerById(@PathVariable int answerId) {
        QuestionAnswer answer = questionAnswerService.getQuestionAnswerById(answerId);
        return ResponseEntity.ok(answer);
    }

    @PostMapping
    public ResponseEntity<QuestionAnswer> createQuestionAnswer(@RequestBody QuestionAnswer answer) {
        QuestionAnswer createdAnswer = questionAnswerService.createQuestionAnswer(answer);
        return ResponseEntity.ok(createdAnswer);
    }
}
