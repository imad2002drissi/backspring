package com.example.autoecoleflutter.entity;

import jakarta.persistence.*;
//(combined question and solution)  ankhedmo biha f course

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_question;
    private String questionText;
    private String solution;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public Question() {
    }

    public Question(int id_question, String questionText, String solution, Course course) {
        this.id_question = id_question;
        this.questionText = questionText;
        this.solution = solution;
        this.course = course;
    }

    public int getId_question() {
        return id_question;
    }

    public void setId_question(int id_question) {
        this.id_question = id_question;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}