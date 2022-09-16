package com.example.learnStreams.programming;

import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Component
public class FPO1Functional {
    public void printEvenNumbersInAList(List<Integer> list){
        list.stream()
                .filter(number -> number%2==0)
                .forEach(System.out::println);


    }
    public int addAllNumbersInAList(List<Integer> list){
      return  list.stream()
                .reduce(0,Integer::sum);

    }

    public int largestNumber(List<Integer> list){
        return  list.stream()
                .reduce(Integer.MIN_VALUE,(x,y)-> x>y?x:y);

    }

    public void sortedDistinctNumbers(List<Integer> list){
        list.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);

    }
    public void printEvenNumbersSquaresInAList(List<Integer> list){
        list.stream()
                .filter(number -> number%2==0)
                .map(number -> Math.pow(number,2))
                .forEach(System.out::println);


    }

    public void printOddNumbersInAList(List<Integer> list){
        list.stream()
                .filter(number -> number%2!=0)
                .forEach(System.out::println);


    }

    public void printCubesOfOddNumbersInAList(List<Integer> list){
        list.stream()
                .filter(number -> number%2!=0)
                .map(number -> Math.pow(number,3))
                .forEach(System.out::println);


    }

    public void coursesWithWordSpring(List<String> courses){
        courses.stream()
                .filter(course-> course.contains("Spring"))
                .forEach(System.out::println);


    }
    public void coursesHasAtleast4Characters(List<String> courses){
        courses.stream()
                .filter(course-> course.length()>=4)
                .forEach(System.out::println);


    }
    public void printNumberOfCharactersInEachCourseName(List<String> courses){
        courses.stream()
                .map(course-> course+" "+course.length())
                .forEach(System.out::println);


    }
    public void printCoursesSortedByLengthOfTheCourseName(List<String> courses){
        courses.stream()
                .sorted(Comparator.comparing(course -> course.length()))
                .forEach(System.out::println);


    }
    public List<Integer> printCourseNameStringLength(List<String> courses){
       return courses.stream()
                .map(course -> course.length())
               .collect(Collectors.toList());


    }
    public void  filterAndPrint(List<Integer>list , Predicate<Integer> predicate){
        list.stream()
                .filter(predicate)
                .forEach(System.out::println);


    }






}
