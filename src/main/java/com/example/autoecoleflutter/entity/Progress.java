package com.example.autoecoleflutter.entity;

import jakarta.persistence.*;

@Entity
public class Progress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_progress;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private int courseProgress;
    private int quizProgress;

    public Progress() {
    }

    public Progress(int id_progress, User user, int courseProgress, int quizProgress) {
        this.id_progress = id_progress;
        this.user = user;
        this.courseProgress = courseProgress;
        this.quizProgress = quizProgress;
    }

    public int getId_progress() {
        return id_progress;
    }

    public void setId_progress(int id_progress) {
        this.id_progress = id_progress;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getCourseProgress() {
        return courseProgress;
    }

    public void setCourseProgress(int courseProgress) {
        this.courseProgress = courseProgress;
    }

    public int getQuizProgress() {
        return quizProgress;
    }

    public void setQuizProgress(int quizProgress) {
        this.quizProgress = quizProgress;
    }
}
