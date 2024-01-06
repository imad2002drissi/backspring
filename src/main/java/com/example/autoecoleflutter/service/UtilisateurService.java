package com.example.autoecoleflutter.service;

import com.example.autoecoleflutter.entity.*;

import java.util.List;

public interface UtilisateurService {
    // Course-related operations
    List<Course> getAllCourses();
    Course getCourseById(int id_course);

    // Quiz-related operations
    List<Quiz> getAllQuizzes();
    Quiz getQuizById(int int_quiz);

    // Question-related operations
    List<Question> getAllQuestions();
    Question getQuestionById(int id_question);

    // QuestionAnswer-related operations
    List<QuestionAnswer> getAllQuestionAnswers();
    QuestionAnswer getQuestionAnswerById(int id);

    // Progress-related operations
    Progress getUserProgress(int id_user);

}
