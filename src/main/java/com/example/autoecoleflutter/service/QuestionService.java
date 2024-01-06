package com.example.autoecoleflutter.service;

import com.example.autoecoleflutter.entity.Question;
import com.example.autoecoleflutter.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    public Question getQuestionById(int id_question) {
        return questionRepository.findById(id_question).orElse(null);
    }

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public Question createQuestion(Question question) {
        return questionRepository.save(question);
    }

    public Question updateQuestion(int id_question, Question question) {
        if (questionRepository.existsById(id_question)) {
            question.setId_question(id_question);
            return questionRepository.save(question);
        }
        return null; // Handle non-existing question
    }

    public void deleteQuestion(int id_question) {
        questionRepository.deleteById(id_question);
    }
}
