package com.emirhan;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

       Calculate sum1 = (x,y) -> System.out.println(x+y);

       Calculate sum2 = (x,y) -> Calculator.findSum(x,y);



    }
}
