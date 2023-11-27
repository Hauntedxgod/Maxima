package Lesson_11;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Main  extends Object{
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(5);

        System.out.println(hashSet);


        HashSet<String> hashSet1 = new HashSet<>();

        hashSet1.add("AAA");
        hashSet1.add("BBB");
        hashSet1.add("CCC");
        hashSet1.add("DDD");
        hashSet1.add("AAA");
        hashSet1.add("EEE");

        System.out.println();

        char c = 6 ;
        System.out.println(c);


//        ReversIntegers reversIntegers = new ReversIntegers();

        TreeSet<String> str = new TreeSet<>(new ReversStrings());
        str.add("a");
        str.add("z");
        str.add("e");
        str.add("w");
        str.add("e");
        str.add("c");

        TreeSet<Integer> integers = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        integers.add(125);
        integers.add(17);
        integers.add(94);
        integers.add(256);
        integers.add(82);

        System.out.println(integers);




    }
}
