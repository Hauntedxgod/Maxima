package Lesson_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Homework_11 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        HashSet<String> strings1 = new HashSet<>();
//        for (int i = 1; i <= 5; i++) {
//            strings1.add(scanner.nextLine());
//        }
//        String thirdElement = (String) strings1.toArray()[3];
//        strings1.remove(thirdElement);
//        System.out.println(strings1);


        System.out.println("\n ex 2 ");
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("мама");
        stringArrayList.add("мыла");
        stringArrayList.add("раму");
        System.out.println(stringArrayList);
        ArrayList<String> all = new ArrayList<>();
        for (int i = 0; i < stringArrayList.size() ; i++) {
            all.add(stringArrayList.get(i) + "\nИменно");

        }
        stringArrayList = all;
        for (String s : stringArrayList) {
            System.out.println(s);
        }




        System.out.println("\n ex 3 ");


        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            strings.remove("р");
        }
        for (int i = 0; i < strings.size(); i++) {
            strings.add(i + 1, "л");
            i++;
        }



        System.out.println("\n ex 4 ");
        //4
        //1. Введи с клавиатуры 10 слов в список строк.
        //2. Метод doubleValues должен удваивать слова по принципу:
        //"альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
        //3. Выведи результат на экран, каждое значение с новой строки.
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            System.out.println("Go! ");
            list.add(scanner.nextLine());
        }
        ArrayList<String> result = doubleValues(list);
        for (String a : result) {
            System.out.println("Result: " + a);
        }
        return result;
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.add(i  + 1, list.get(i));
            i++ ;
        }

        return list;

    }
}



