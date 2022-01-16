package com.java8.exercise.classes;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.List;

public class MethodReferencesInJava {
    public static void main(String[] args) {
        List<String> messages = Arrays.asList("hello", "baeldung", "readers!");
        messages.forEach(word-> StringUtils.capitalize(word));
        messages.forEach(StringUtils::capitalize);
        System.out.println(messages);
    }
}
