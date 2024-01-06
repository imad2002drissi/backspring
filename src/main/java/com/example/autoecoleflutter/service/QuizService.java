package com.example.autoecoleflutter.service;

import com.example.autoecoleflutter.entity.Quiz;
import com.example.autoecoleflutter.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    private QuizRepository quizRepository;

    public Quiz getQuizById(int id_quiz) {
        return quizRepository.findById(id_quiz).orElse(null);
    }

    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    public Quiz createQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    public Quiz updateQuiz(int id_quiz, Quiz quiz) {
        if (quizRepository.existsById(id_quiz)) {
            quiz.setId_quiz(id_quiz);
            return quizRepository.save(quiz);
        }
        return null; // Handle non-existing quiz
    }

    public void deleteQuiz(int id_quiz) {
        quizRepository.deleteById(id_quiz);
    }
}
