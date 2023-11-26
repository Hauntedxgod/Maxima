package Lesson_13.Homework_13.Coll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long (56));
        map.put("Food", new Character ('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);


        for (Map.Entry<String , Object>  e: map.entrySet()) {
            String k = e.getKey();
            Object value = e.getValue();
            System.out.println(k + " - " + value);
        }

        //        Collections.sort(map , new Comparator<Map.Entry<String, Object>>() {
//            @Override
//            public int compare(Map.Entry<String, Object> o1, Map.Entry<String, Object> o2) {
//                return o1.getValue().compareTo (o2.getValue());
//            }
//        });
//        //напишите тут ваш код


    }

}
