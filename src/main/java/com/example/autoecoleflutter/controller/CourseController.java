package com.example.autoecoleflutter.controller;

import com.example.autoecoleflutter.entity.Course;
import com.example.autoecoleflutter.entity.Question;
import com.example.autoecoleflutter.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/courses")

public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/{courseId}")
    public ResponseEntity<Course> getCourseById(@PathVariable int courseId) {
        Course course = courseService.getCourseById(courseId);
        return ResponseEntity.ok(course);
    }
    @GetMapping("/{courseName}/id")
    public ResponseEntity<Integer> getCourseIdByName(@PathVariable String courseName) {
        int courseId = courseService.getCourseIdByName(courseName);
        return ResponseEntity.ok(courseId);
    }

    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses() {
        List<Course> courses = courseService.getAllCourses();
        return ResponseEntity.ok(courses);
    }

    @PostMapping
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {
        Course createdCourse = courseService.createCourse(course);
        return ResponseEntity.ok(createdCourse);
    }

    @PutMapping("/{courseId}")
    public ResponseEntity<Course> updateCourse(@PathVariable int courseId, @RequestBody Course course) {
        Course updatedCourse = courseService.updateCourse(courseId, course);
        return ResponseEntity.ok(updatedCourse);
    }

    @DeleteMapping("/{courseId}")
    public ResponseEntity<Void> deleteCourse(@PathVariable int courseId) {
        courseService.deleteCourse(courseId);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{courseId}/questions")
    public ResponseEntity<List<Question>> getAllQuestionsInCourse(@PathVariable int courseId) {
        List<Question> questions = courseService.getAllQuestionsInCourse(courseId);
        return ResponseEntity.ok(questions);
    }
}
