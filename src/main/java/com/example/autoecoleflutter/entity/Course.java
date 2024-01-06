package com.example.autoecoleflutter.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_course;
    private String courseName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "course")
    private List<Question> questions;

    public Course() {
    }

    public Course(int id_course, String courseName, List<Question> questions) {
        this.id_course = id_course;
        this.courseName = courseName;
        this.questions = questions;
    }

    public int getId_course() {
        return id_course;
    }

    public void setId_course(int id_course) {
        this.id_course = id_course;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}