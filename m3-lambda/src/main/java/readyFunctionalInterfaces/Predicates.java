package readyFunctionalInterfaces;

import java.util.Random;
import java.util.function.*;

public class Predicates {

    public static void main(String[] args) {

        //PREDICATE
        Predicate<Integer> lesserThan = i -> i < 18;
        System.out.println(lesserThan.test(20));

        //CONSUMER
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10);

        //BI CONSUMER
        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
        addTwo.accept(1, 2);

        //FUNCTION
        Function<String, String> fun = s -> "Hello " + s;
        System.out.println(fun.apply("Cydeo"));

        //BI FUNCTION
        BiFunction<Integer,Integer,Integer> func = (x,y) -> x*y;
        System.out.println(func.apply(31,31));

        //SUPPLIER
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());


    }
}
