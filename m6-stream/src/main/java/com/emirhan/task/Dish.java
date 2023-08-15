package com.emirhan.task;

import lombok.*;

@Data
@AllArgsConstructor
public class Dish {

    private String name;
    private boolean isVegetarian;
    private int calories;
    private Type type;
}
