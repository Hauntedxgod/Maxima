package Lesson_13;

import Lesson_6.cat1;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestCat {
    public static void main(String[] args) {
        List<cat1> cats = List.of(
                new cat1("Snezhok" , 5 , "Street" , "Blue"),
                new cat1("Pushistic" , 10),
                new cat1("Pushok" , 11),
                new cat1("Ryzhik" , 7),
                new cat1("Klubok" , 15)

        );

//        cats.stream()
//                .filter((cat1 -> cat1.getBreed.equals("Street"))
//                       .collect(Collections.toList())
//                        .forEach
//        cats.stream()
//                .sorted(Comparator.comparing(cat1::getName))
//                .collect(Collectors.toList()))
////                .forEach(System.out::println);
//        cat1 cat1 = cats.stream()
//                .max(Comparator.comparing(cat1::getAge))
//                .get();
//        System.out.println(cat1);



    }
}
