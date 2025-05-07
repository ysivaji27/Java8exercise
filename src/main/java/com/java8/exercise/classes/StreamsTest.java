package com.java8.exercise.classes;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsTest {

    public static void main(String[] args) {

        // find duplicate elements
        List<Integer> list = Arrays.asList(10,28,87,10,20,76,28,80,80,80);
        Set<Integer> uniqueNum = new HashSet<>();
        list.stream().filter(a->!uniqueNum.add(a)).collect(Collectors.toSet()).stream().sorted().forEach(System.out::println);

        List<String> stringList = Arrays.asList("Welcome to code decode and code decode welcomes you".split(" "));
       Map<String, Long> map = stringList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}
