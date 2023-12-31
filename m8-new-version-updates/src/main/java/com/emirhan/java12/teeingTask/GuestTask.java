package com.emirhan.java12.teeingTask;

import com.emirhan.java12.teeingTask.EventParticipation;
import com.emirhan.java12.teeingTask.Guest;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GuestTask {


    public static void main(String[] args) {

        var result =
                Stream.of(
                                new Guest("Marco", true, 3),
                                new Guest("David", false, 2),
                                new Guest("Roger", true, 6))
                        .collect(Collectors.teeing(Collectors.filtering(Guest::isParticipating, Collectors.mapping(Guest::getName, Collectors.toList())),
                                Collectors.filtering(Guest::isParticipating, Collectors.summingInt(Guest::getParticipantsNumber)), EventParticipation::new));

        System.out.println(result);


    }
}