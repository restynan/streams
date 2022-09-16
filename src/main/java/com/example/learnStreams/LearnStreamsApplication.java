package com.example.learnStreams;

import com.example.learnStreams.model.Course;
import com.example.learnStreams.programming.CourseService;
import com.example.learnStreams.programming.FPO1Functional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class LearnStreamsApplication {

	public static void main(String[] args) {

		SpringApplication.run(LearnStreamsApplication.class, args);

		FPO1Functional fpo1Functional = new FPO1Functional();

		List<Integer> list = Arrays.asList (1,3,7,10,20,6,1,4,9,10);
		List<String> list2 = Arrays.asList ("Spring","API","Spring Boot","AWS");

		List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000));


		CourseService courseService = new CourseService();
		System.out.println("group by courseCategory**********");
		//System.out.println(courseService.groupCoursesByCategory(courses));
		System.out.println(courseService.groupCoursesByCategoryWithNoOfcoursesInACategory(courses));

	/*

	System.out.println(" All courses have review greater than 90  **********" +	courseService.allCoursesHaveAReviewGreaterThan90(courses));

		System.out.println(" Test predicate  **********" );
		System.out.println(courseService.sortCourses(courses));
		System.out.println("number of students in courses with review greater than 95**********" );
		System.out.println(courseService.numberOfStudentsInCoursesWithReviewGreaterThan95(courses));

	System.out.println(" length of course names  **********" + fpo1Functional.printCourseNameStringLength(list2));
		System.out.println(" Test predicate  **********" );
		fpo1Functional.filterAndPrint(list,x->x%2==0);


	System.out.println("sorted distinct numbers **********");
		fpo1Functional.sortedDistinctNumbers(list);

		System.out.println("sorted by length of the course name length  **********");
		fpo1Functional.printCoursesSortedByLengthOfTheCourseName(list2);

	System.out.println("Sum numbers ********** "+ fpo1Functional.addAllNumbersInAList(list));
	System.out.println("largest number ********** "+ fpo1Functional.largestNumber(list));
	System.out.println("Even numbers **********");
		fpo1Functional.printEvenNumbersInAList(list);

		System.out.println("squares of even numbers **********");
		fpo1Functional.printEvenNumbersSquaresInAList(list);

		System.out.println("Odd numbers **********");
		fpo1Functional.printOddNumbersInAList(list);

		System.out.println("Cubes of Odd numbers **********");
		fpo1Functional.printCubesOfOddNumbersInAList(list);



		System.out.println("contains word spring **********");
		fpo1Functional.coursesWithWordSpring(list2);

		System.out.println("contains  at least 4 characters **********");
		fpo1Functional.coursesHasAtleast4Characters(list2);

		System.out.println("Number of characters in each course **********");
		fpo1Functional.printNumberOfCharactersInEachCourseName(list2);*/
	}

}
