package com.example.autoecoleflutter.controller;

import com.example.autoecoleflutter.entity.Course;
import com.example.autoecoleflutter.entity.Question;
import com.example.autoecoleflutter.service.CourseService;
import com.example.autoecoleflutter.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    @Autowired
    private QuestionService questionService;
    @Autowired

    private CourseService courseService;

    public QuestionController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/questions/course/{courseId}")
    public ResponseEntity<List<Question>> getQuestionsByCourseId(@PathVariable int courseId) {

        try {
            List<Question> questions = questionService.getQuestionsByCourseId(courseId);
            return ResponseEntity.ok(questions);
        } catch (Exception e) {
            System.out.println("Error fetching questions: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping("/{questionId}")
    public ResponseEntity<Question> getQuestionById(@PathVariable int questionId) {
        Question question = questionService.getQuestionById(questionId);
        return ResponseEntity.ok(question);
    }


    @GetMapping
    public ResponseEntity<List<Question>> getAllQuestions() {
        List<Question> questions = questionService.getAllQuestions();
        return ResponseEntity.ok(questions);
    }

    @PostMapping
    public ResponseEntity<Question> createQuestion(@RequestBody Question question, @RequestParam int courseId) {
        try {
            System.out.println("Received question with courseId: " + courseId); // Add this debug print

            Course course = courseService.getCourseById(courseId);
            question.setCourse(course);
            Question createdQuestion = questionService.createQuestion(question);
            return ResponseEntity.ok(createdQuestion);
        } catch (Exception e) {
            System.out.println("Error creating question: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


    @PutMapping("/{questionId}")
    public ResponseEntity<Question> updateQuestion(@PathVariable int questionId, @RequestBody Question question) {
        Question updatedQuestion = questionService.updateQuestion(questionId, question);
        return ResponseEntity.ok(updatedQuestion);
    }

    @DeleteMapping("/{questionId}")
    public ResponseEntity<Void> deleteQuestion(@PathVariable int questionId) {
        questionService.deleteQuestion(questionId);
        return ResponseEntity.ok().build();
    }
}
