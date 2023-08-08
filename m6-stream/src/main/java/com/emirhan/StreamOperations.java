package com.emirhan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,2,3,3,4,5,5);
//      list.forEach(System.out::println);

        //FILTER
        System.out.println("Filter");
        list.stream()
                .filter(i -> i%2 == 0)
                .forEach(System.out::println);

        //DISTINCT
        System.out.println("Distinct");
        Stream<Integer> str = list.stream() //You can assign a reference to stream
                .filter(i -> i % 2 == 0)
                .distinct();

        str.forEach(System.out::println);

        //LIMIT
        System.out.println("Limit");
        list.stream()
                .filter(i -> i % 2 == 0)
                .limit(2)
                .forEach(System.out::println);

        //SKIP
        System.out.println("Skip");
        list.stream()
                .filter(i -> i % 2 == 0)
                .skip(1)
                .forEach(System.out::println);

        //MAPPING
        System.out.println("Mapping");
        list.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * 2)
                .forEach(System.out::println);




    }
}
