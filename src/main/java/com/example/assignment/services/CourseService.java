package com.example.assignment.services;

import com.example.assignment.entities.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();

    public Course getCourse(long courseId);

    public Course addCourse(Course course);

    public Course updateCourse(Course course);

    public List<Course> deleteCourse(long courseId);
}
