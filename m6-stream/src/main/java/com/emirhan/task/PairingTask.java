package com.emirhan.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairingTask {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        //Return square of each number
        list.stream()
                .map(num -> num*num)
                .forEach(System.out::println);

        System.out.println("------------------------------");

        /*Gıven two list of numbers, how would you return all pairs of numbers?
          For example, given a list [1,2,3] and [3,4] you should return
          [(1,3),(1,4),(2,3),(2,4),(3,3),(3,4)]
        */
        List<Integer> numbers1 = Arrays.asList(1,2,3);
        List<Integer> numbers2 = Arrays.asList(3,4);

        numbers1.stream()
                .flatMap(i -> numbers2.stream().map(j -> new int[]{i, j}))
                .forEach(pair -> System.out.println(Arrays.toString(pair)));




    }
}
