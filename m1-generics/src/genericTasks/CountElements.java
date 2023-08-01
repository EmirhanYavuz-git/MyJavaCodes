package genericTasks;

import java.util.List;

public class CountElements {

    public static void main(String[] args) {

    }

    private static <T> int countIf(List<T> list, UnaryPredicate<T> p){

        int count = 0;
        for (T each : list) {
            if (p.test(each)){
                ++count;
            }
        }
        return count;
    }



}
