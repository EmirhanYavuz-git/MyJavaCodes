package com.emirhan;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

       Calculate s1 = (x,y) -> System.out.println(x+y);

       Calculate s2 = (x,y) -> Calculator.findSum(x,y);

       //Reference to a Static Method
       Calculate s3 = (x, y) -> Calculator.findSum(x, y);
       s3.calculate(2,3);

       //Reference to a instance method
        Calculator obj = new Calculator();
        Calculate m1 = obj::findMultiply;
        Calculate m2 = new Calculator()::findMultiply;

        BiFunction<String,Integer,String> func = (str,i) -> str.substring(i);

        BiFunction<String,Integer,String> func2 = String::substring;

        Function<Integer,Double> b =  new MyClass()::method;
        BiFunction<MyClass,Integer,Double> b1 = MyClass::method;

        Consumer<Integer> display = i -> System.out.println(i);
        Consumer<Integer> display2 = System.out::println;








    }
}
