package com.emirhan.task;

import java.util.Comparator;

import static java.util.Comparator.comparing;

public class DishTask {

    public static void main(String[] args) {

        //Print all dish's name that has less than 400 calories
        System.out.println("Task 1");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                .forEach(dish -> System.out.println(dish.getName()));



        //Print the length of the name of each dish
        System.out.println("Task 2");
        DishData.getAll().stream()
                .forEach(dish -> System.out.println(dish.getName().length()));



        //Print three high caloric dish name (>300)
        System.out.println("Task 3");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() > 300)
                .limit(3)
                .forEach(dish -> System.out.println(dish.getName()));



        //Print all dish name that are below 400 calories in sorted
        System.out.println("Task 4");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(comparing(Dish::getCalories))
                .forEach(dish -> System.out.println(dish.getName()));




    }
}
