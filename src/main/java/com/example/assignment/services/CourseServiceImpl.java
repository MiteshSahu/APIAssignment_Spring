package com.example.assignment.services;

import com.example.assignment.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(145,"Java","basic java"));
        list.add(new Course(1452,"Spring Java","API java"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c = null;
        for(Course course:list)
        {
            if(course.getId()==courseId)
            {
                c= course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course cou) {
        list.forEach(e -> {
            if(e.getId() == cou.getId()) {
                e.setTitle(cou.getTitle());
                e.setDscription(cou.getDscription());
            }
        });
        return cou;
    }

    @Override
    public List<Course> deleteCourse(long courseId) {
        Course c = null;
        for(Course course:list)
        {
            if(course.getId()==courseId)
            {
                c= course;
                break;
            }
        }
        list.remove(c);
        return list;
    }
}
