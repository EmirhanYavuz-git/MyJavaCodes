package com.emirhan.task;

import java.util.Arrays;
import java.util.List;

public class CharStreamTask {

    public static void main(String[] args) {

        System.out.println("Task 1"); //print the number of characters for each word
        List<String> words = Arrays.asList("JAVA", "APPLE", "HONDA", "DEVELOPER");
        words.stream()
                .forEach(p -> System.out.println(p.length()));
    }
}
