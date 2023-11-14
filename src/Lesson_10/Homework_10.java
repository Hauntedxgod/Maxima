package Lesson_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework_10 {
    public Homework_10() {
    }

    public static void main(String[] args) {
        System.out.println("\n Ex 1 ");

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("A");
        stringArrayList.add("B");
        stringArrayList.add("C");
        stringArrayList.add("D");
        stringArrayList.add("F");


        System.out.println("Размер массива String - " + stringArrayList.size());


        for (String s : stringArrayList) {
            System.out.println("Содержимое массива String: " + s);
        }
        System.out.println("\n Ex 2 ");

        ArrayList<String> arrayList = new ArrayList<>();

        System.out.println("Введите какие либо выражения: ");
        Scanner scanner = new Scanner(System.in);
        arrayList.add(scanner.nextLine());
        arrayList.add(scanner.nextLine());
        arrayList.add(scanner.nextLine());
        arrayList.add(scanner.nextLine());
        arrayList.add(scanner.nextLine());
        System.out.println(arrayList);

        int str = arrayList.get(0).length();
        int index = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() > str) {
                str = arrayList.get(i).length();
                index = i;

            }
        }
        System.out.println("Выведите максимальное значение - " + " " + arrayList.get(index) + " " + str);


        ArrayList<String> arrayList1 = new ArrayList<>();
        System.out.println("\n Ex 3 " );
        System.out.println("Введите какие либо выражения: ");
        arrayList1.add(scanner.nextLine());
        arrayList1.add(scanner.nextLine());
        arrayList1.add(scanner.nextLine());
        arrayList1.add(scanner.nextLine());
        arrayList1.add(scanner.nextLine());
        System.out.println(arrayList1);

        int str1 = arrayList1.get(0).length();
        int index1 = 0;
        for (int i = 0; i < arrayList1.size(); i++) {
            if (arrayList1.get(i).length() < str1) {
                str1 = arrayList1.get(i).length();
                index1 = i;
            }
        }
        System.out.println( "Выведите минимальное значение - " + " "+ arrayList1.get(index1)  + " " +  str1);


        System.out.println("\n ex 4 ");
        ArrayList<String> stringArrayList1 = new ArrayList<>();
        System.out.println("Введите значения: ");
        stringArrayList1.add(scanner.nextLine());
        stringArrayList1.add(scanner.nextLine());
        stringArrayList1.add(scanner.nextLine());
        stringArrayList1.add(scanner.nextLine());
        stringArrayList1.add(scanner.nextLine());
        stringArrayList1.add(scanner.nextLine());
        stringArrayList1.add(scanner.nextLine());
        stringArrayList1.add(scanner.nextLine());
        stringArrayList1.add(scanner.nextLine());
        stringArrayList1.add(scanner.nextLine());


        for (String s : stringArrayList1) {
            System.out.println(s);
        }


        System.out.println("\n ex 5 ");
        ArrayList<String> list =  new ArrayList<>();
        for (int i = 0; i <= 5 ; i++) {
            list.add(scanner.nextLine());
        }
        for (int i = 0; i < 13; i++){
            String a = list.get(5);
            list.remove(5);
            list.add(0, a);
        }


        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }


//        System.out.println("\n ex 6 ");
//        ArrayList<String> lists = new ArrayList<>();
//        for (int i = 0; i < 10 ; i++) {
//            lists.add(scanner.nextLine());
//        }
//        int b = lists.get(0).length();
//        for (int i = 0; i < lists.size() ; i++) {
//            if (lists.get(0).length() > i && lists.get(0).length() < i){
//                System.out.println(lists.get(0).length() );
//            }
//        }


        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array3 = new ArrayList<>();
        int a = scanner.nextInt();
        for (int i = 1; i <= 20; i++) {
            array.add(i);
        }
        for (Integer i :  array) {
            if (i % 3 == 0 && i % 2 == 0) {
                array2.add(i);
                array1.add(i);
            }else if (i % 3 == 0) {
                array2.add(i);
            }else if (i % 2 == 0){
                array1.add(i);
            } else {
                array3.add(i);
            }



        }
        printList(array1);
        printList(array2);
        printList(array3);
    }

        public static void printList(ArrayList <Integer> array) {
            System.out.println("new Список ");
            for (int i = 0; i < array.size(); i++) {
                System.out.println(i);
            }
        }
    }










