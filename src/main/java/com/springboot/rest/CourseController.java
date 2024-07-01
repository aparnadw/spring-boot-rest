package com.springboot.rest;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    public List<Course> retriveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "aws.com"),
                new Course(2, "Learn Java", "Java.com")
        );
    }
}
