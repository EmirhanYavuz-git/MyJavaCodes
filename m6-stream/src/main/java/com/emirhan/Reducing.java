package com.emirhan;

import com.emirhan.task.Dish;
import com.emirhan.task.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4, 3, 5, 9);

        /*
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        */

        int result = numbers.stream().reduce(0, (a, b) -> a + b);

        int calTotal = DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce((a,b) -> a+b)
                .get();

        System.out.println(calTotal);

        //Max and Min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("min = " + min.get());
        System.out.println("max = " + max.get());
        System.out.println("sum = " + sum.get());

        System.out.println("--------------------");

        System.out.println("COUNT");
        long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);






    }
}
