package com.emirhan.practiceTasks;

import com.emirhan.task.Dish;
import com.emirhan.task.DishData;

public class Tasks {

    public static void main(String[] args) {

        //How would you count the number of dishes in a stream using the map and reduce methods?

        DishData.getAll().stream()
                .map(Dish::getName)
                .reduce()














    }
}
