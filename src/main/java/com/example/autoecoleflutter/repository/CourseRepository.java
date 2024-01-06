package com.example.autoecoleflutter.repository;

import com.example.autoecoleflutter.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}

