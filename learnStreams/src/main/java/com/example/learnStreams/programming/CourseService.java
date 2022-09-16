package com.example.learnStreams.programming;

import com.example.learnStreams.model.Course;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CourseService {
    public boolean allCoursesHaveAReviewGreaterThan90(List<Course> list){
      return list.stream()
                .allMatch(course ->course.getReviewScore()>90);
    }

    public List<Course>  sortCourses( List<Course> list){
        Comparator<Course> courseComparator = Comparator.comparing(Course::getNoOfStudents)
                                              .thenComparing(Course::getReviewScore)
                                               .reversed();
        return list.stream()
                .sorted(courseComparator)
                .skip(1)
                .limit(5)
                .collect(Collectors.toList());
    }

    public int numberOfStudentsInCoursesWithReviewGreaterThan95(List<Course> list){
        Predicate<Course> predicateCourseReviewGreaterThan95 = course -> course.getReviewScore()>95;
        return list.stream()
                .filter(predicateCourseReviewGreaterThan95)
                .mapToInt(Course::getNoOfStudents)
                .sum();
    }
    public Map<String,List<Course>> groupCoursesByCategory(List<Course> list){
       return  list.stream()
        .collect(Collectors.groupingBy(Course::getCategory));
    }
    public Map<String,Long> groupCoursesByCategoryWithNoOfcoursesInACategory(List<Course> list){
        return  list.stream()
                .collect(Collectors.groupingBy(Course::getCategory,Collectors.counting()));
    }
}
