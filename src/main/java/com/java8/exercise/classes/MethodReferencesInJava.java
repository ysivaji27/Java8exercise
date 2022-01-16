package com.java8.exercise.classes;

import com.java8.exercise.model.Bicycle;
import com.java8.exercise.model.BicycleComparator;
import com.java8.exercise.model.Product;
import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.List;

public class MethodReferencesInJava {
    public static void main(String[] args) {
        List<String> messages = Arrays.asList("hello", "baeldung", "readers!");
        messages.forEach(word-> StringUtils.capitalize(word));
        messages.forEach(StringUtils::capitalize);
        System.out.println(messages);

        BicycleComparator bikeFrameSizeComparator = new BicycleComparator();

        List<Bicycle> bicycleList = Arrays.asList(new Bicycle(23, "potatoes"),
                new Bicycle(14, "orange"), new Bicycle(13, "lemon"),
                new Bicycle(23, "bread"), new Bicycle(13, "sugar"));

        bicycleList.stream()
                .sorted((a, b) -> bikeFrameSizeComparator.compare(a, b)).forEach(System.out::println);
    }
}
