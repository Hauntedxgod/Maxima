package Lesson_13;

import Lesson_6.cat1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String > strings = new ArrayList<>();

        Box<Integer> integerBox = new Box<>(111);

        int value = integerBox.getItem();

        System.out.println(value);

        Box<String> stringBox = new Box<>("Hello world!");

        String hello = stringBox.getItem();

        System.out.println(hello);

        Box<cat1> cat1Box = new Box<>(new cat1("Snezhok" , 10));

        cat1 cat1 = cat1Box.getItem();

        System.out.println("Имя" + cat1);







        List<String> s = new ArrayList<>();

        s = new LinkedList<>();





        // Upcasting
        List<Long> integers = new ArrayList<>();

        List<? extends Number> numbers1 = integers;

        // Downcasting

        List<? extends Number> numbers = new ArrayList<>();

        List<Byte>  bytes = (List<Byte>) numbers;

        List<? super Integer> intList = new ArrayList<>();
















    }
}
