package com.emirhan.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class State {

    private String name;
    private List<String> cities = new ArrayList<>();

    public void addCity(String city){
        cities.add(city);
    }
    public List<String> getCities(){
        return this.cities;
    }

    public static void main(String[] args) {

        //Create a list of states and print all the cities

        State va = new State();
        va.addCity("Istanbul");
        va.addCity("Ankara");
        va.addCity("Izmir");

        State tx = new State();
        tx.addCity("New York");
        tx.addCity("Washington");
        tx.addCity("Dallas");

        List<State> states = Arrays.asList(va,tx);

        // states.stream().map(state -> state.getCities()).forEach(System.out::println);

        states.stream()
                .map(State::getCities)
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}


