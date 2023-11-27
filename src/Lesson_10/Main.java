package Lesson_10;

import java.util.ArrayList;
import java.util.LinkedList;

    public class Main {
        public static void main(String[] args) {
            int[] arr = new int[0];

            System.out.println(arr.length);

            byte c = 15;
            String s = "Hello World!";
            Integer b = 10;
            Byte d = 15;
            Short e = 100;
            Long l = 1L;

            ArrayList<Integer> list = new ArrayList<>();

            // 1 - добавление элементов в коллекцию

            list.add(5);
            list.add(6);
            list.add(7);
            list.add(8);
            // 2 - добавление элементов в коллекцию с указанием индекса на котором этот элемент будет лежать

            list.add(3, 10);

            // 3 - замена элемента

            list.set(3 , 20);

            // 4 - удаление обьекта из коллекции

            list.remove(2);

            ArrayList<String> stringArrayList = new ArrayList<>();

            stringArrayList.add("AAA");
            stringArrayList.add("BBB");
            stringArrayList.add("CCC");
            stringArrayList.add("DDD");
            stringArrayList.remove("BBB");


            System.out.println(stringArrayList);



            System.out.println(list);

            // 5 - узнать длину коллекции

            System.out.println("Size of stringArrayList is " + stringArrayList.size());


            // 6 - печать листа и проход по листу

            System.out.println("Third element is " + stringArrayList.get(2));

//        for (int i = 0; i < stringArrayList.size(); i++) {
//            System.out.println( i +  "element is " + stringArrayList.get(i));
//        }

            for (String x : stringArrayList) {
                System.out.println(x);
            }

            // 7 - как узнать индекс определенного элемента и его наличие в коллекции

            System.out.println("Element CCC is " + stringArrayList.indexOf("CCC") + " int our collection");

            // 8 - узнать пустая коллекция или нет

            ArrayList<String> List1 = new ArrayList<>();

            List1.add("AAA");
            List1.add("BBB");
            List1.add("CCC");
            List1.add("DDD");

            ArrayList<String> List2 = new ArrayList<>();

            System.out.println("Collection list1 is empty?"+ List1.isEmpty());
            System.out.println("Collection list2 is empty?"+ List2.isEmpty());

            // 9 - удалять все элементы из коллекции

            List1.clear();


            LinkedList<Integer> linkedList = new LinkedList<>();

            linkedList.add(1);
            linkedList.add(2);
            linkedList.add(3);
            linkedList.add(4);
            linkedList.add(5);

            System.out.println();


            ArrayList<Integer> list5 = new ArrayList<>();




        }


    }

