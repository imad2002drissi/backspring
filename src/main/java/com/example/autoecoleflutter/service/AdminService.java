package com.example.autoecoleflutter.service;

import com.example.autoecoleflutter.entity.*;

public interface AdminService {
    // User-related operations
    User createUser(User user);
    User updateUser(int id_user, User user);
    void deleteUser(int id_user);

    // Course-related operations
    Course createCourse(Course course);
    Course updateCourse(int id_course, Course course);
    void deleteCourse(int course);

    // Quiz-related operations
    Quiz createQuiz(Quiz quiz);
    Quiz updateQuiz(int id_quiz, Quiz quiz);
    void deleteQuiz(int id_quiz);

    // Question-related operations
    Question createQuestion(Question question);
    Question updateQuestion(int id_question, Question question);
    void deleteQuestion(int id_question);

    // QuestionAnswer-related operations
    QuestionAnswer createQuestionAnswer(QuestionAnswer questionAnswer);
    QuestionAnswer updateQuestionAnswer(int id, QuestionAnswer questionAnswer);
    void deleteQuestionAnswer(int id);
}

