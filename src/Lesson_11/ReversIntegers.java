package Lesson_11;

import java.util.Comparator;

public class ReversIntegers implements Comparator<Integer> {

    // o1 == o2 -> 0 = равны 10 == 10 = 0
    // o1 < o2 -> 1 = положительная сумма 10 - 5 = +++++
    // o1 > o2 -> -1 = отрицательная 5 - 10 = -----

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
