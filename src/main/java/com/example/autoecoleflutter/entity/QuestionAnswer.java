package com.example.autoecoleflutter.entity;

import jakarta.persistence.*;

// (an storew fiha l ajwiba dial utilisateur mni ydouwez l quiz)

@Entity
public class QuestionAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;
    private String userAnswer;

    public QuestionAnswer() {
    }

    public QuestionAnswer(int id, Question question,Quiz quiz, String userAnswer) {
        this.id = id;
        this.question = question;
        this.userAnswer = userAnswer;
        this.quiz=quiz;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }
}