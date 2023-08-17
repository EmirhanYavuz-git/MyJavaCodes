package com.emirhan.java11;

public class StringMethodDemo {

    public static void main(String[] args) {


        var str = "Mike \n Ozzy \n Tom \n Emmy";

        str.lines().forEach(System.out::println);

        boolean r1 = str.isBlank();





    }
}
