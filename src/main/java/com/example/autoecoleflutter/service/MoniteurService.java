package com.example.autoecoleflutter.service;

import com.example.autoecoleflutter.entity.*;

import java.util.List;

public interface MoniteurService {
    // User-related operations
    List<User> getAllUsers();
    User getUserById(Long userId);

    // Progress-related operations
    Progress getUserProgress(int id_user);

    // Course-related operations
    List<Course> getAllCourses();
    Course getCourseById(Long courseId);

    // Quiz-related operations
    List<Quiz> getAllQuizzes();
    Quiz getQuizById(int id_quiz);

    // Question-related operations
    List<Question> getAllQuestions();
    Question getQuestionById(int id_question);

    // QuestionAnswer-related operations
    List<QuestionAnswer> getAllQuestionAnswers();
    QuestionAnswer getQuestionAnswerById(int id);
}
