package com.example.autoecoleflutter.service;

import com.example.autoecoleflutter.entity.Course;
import com.example.autoecoleflutter.entity.Question;
import com.example.autoecoleflutter.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public Course getCourseById(int id_course) {
        return courseRepository.findById(id_course).orElse(null);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public Course updateCourse(int id_course, Course course) {
        if (courseRepository.existsById(id_course)) {
            course.setId_course(id_course);
            return courseRepository.save(course);
        }
        return null; // Handle non-existing course
    }

    public void deleteCourse(int id_course) {
        courseRepository.deleteById(id_course);
    }


    public List<Question> getAllQuestionsInCourse(int courseId) {
        Course course = courseRepository.findById(courseId).orElse(null);

        if (course != null) {
            return course.getQuestions();
        }

        return null;
    }

}

