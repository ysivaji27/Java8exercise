package com.java8.exercise.classes;

import com.java8.exercise.model.Product;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Java8Strems {


    public static void main(String[] args) {
        Java8Strems obj = new Java8Strems();
        //Empty Steams
        Stream<String> emptySteam = Stream.empty();
        List<String> strList = null;
        System.out.println(obj.getStreamObject(strList));
        strList = new ArrayList<String>(Arrays.asList("a","b","c","d","d","e"));
        System.out.println(obj.getStreamObject(strList));
        List<String> collection = Arrays.asList("a","b","c");
        System.out.println(obj.getStreamObject(collection));

        String[] strings = new String[]{"a","b","c","d"};
        strings[0] = "e";
        System.out.println(Arrays.asList(strings));


        Stream<String> streamBuilder = Stream.<String>builder().add("a").build();

        //Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();

        Stream<String> streamGenerte = Stream.generate(()->"element").limit(10);

        Stream<Integer> streamIterate = Stream.iterate(40 , n->n+2).limit(20);

        IntStream intStream = IntStream.range(1, 3);
        LongStream longStream = LongStream.rangeClosed(1, 3);
        System.out.println(intStream);
        System.out.println(longStream);

        Stream<String> stream = streamGenerte.filter(e -> e.contains("e"));
        //List<String> listStream = streamGenerte.filter(element -> element.contains("e")).collect(Collectors.toList());

        Optional<String> firstElement = stream.findFirst();
        System.out.println(firstElement);

        //pipelines
        Stream<String> onceModified = Stream.of("abcd","bced","cdef","defg").skip(1);
        Stream<String> onceModified1 = Stream.of("abcd","bced","cdef","defg").skip(1).map(ele->ele.substring(0,3));
        long onceModified2 = Stream.of("abcd","bced","cdef","defg").skip(1).map(ele->ele.substring(0,3)).sorted().count();

        obj.countTest();

    }

    private long counter;

    private void wasCalled() {
        counter++;
    }
    private void countTest(){

        List<String> strList = Arrays.asList("abc1", "abc2", "abc3");
        counter = 0;
        Optional<String> stream2 = strList.stream().filter(element -> {
            wasCalled();
            System.out.println("filter() was called");
            return element.contains("2");
        }).map(ele-> { return ele.toUpperCase(Locale.ROOT); }).findFirst();

        System.out.println("counter--->"+counter);

        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));

        List<String> prodNames = productList.stream().map(Product::getOrange).collect(Collectors.toList());
        String prodNames2 = productList.stream().map(Product::getOrange).collect(Collectors.joining(", ","[","]"));
        long prodPrice = productList.stream().collect(Collectors.summingLong(Product::getI));

        System.out.println(prodNames +" ||| "+prodPrice);
    }

    private Stream<String> getStreamObject(List<String> list){

        return  list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }
}
