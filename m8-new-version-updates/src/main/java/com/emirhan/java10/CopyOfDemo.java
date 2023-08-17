package com.emirhan.java10;

import java.util.Arrays;
import java.util.List;

public class CopyOfDemo {

    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(1,2,3,4,5,5);

        List<Integer> unmodifiableList = List.of(1,2,3,4,5,5);
        List<Integer> unmodifiableList2 = List.copyOf(numberList);



    }
}
