package com.example.autoecoleflutter.service;

import com.example.autoecoleflutter.entity.QuestionAnswer;
import com.example.autoecoleflutter.repository.QuestionAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionAnswerService {
    @Autowired
    private QuestionAnswerRepository questionAnswerRepository;

    public QuestionAnswer getQuestionAnswerById(int id) {
        return questionAnswerRepository.findById(id).orElse(null);
    }

    public List<QuestionAnswer> getAllQuestionAnswers() {
        return questionAnswerRepository.findAll();
    }

    public QuestionAnswer createQuestionAnswer(QuestionAnswer questionAnswer) {
        return questionAnswerRepository.save(questionAnswer);
    }

    public QuestionAnswer updateQuestionAnswer(int id, QuestionAnswer questionAnswer) {
        if (questionAnswerRepository.existsById(id)) {
            questionAnswer.setId(id);
            return questionAnswerRepository.save(questionAnswer);
        }
        return null; // Handle non-existing answer
    }

    public void deleteQuestionAnswer(int id) {
        questionAnswerRepository.deleteById(id);
    }
}
