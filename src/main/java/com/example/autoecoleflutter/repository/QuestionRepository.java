package com.example.autoecoleflutter.repository;

import com.example.autoecoleflutter.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    @Query("SELECT q FROM Question q WHERE q.course.id_course = :courseId")

    List<Question> findByCourseId(int courseId);


}
