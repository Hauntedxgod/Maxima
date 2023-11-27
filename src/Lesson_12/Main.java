package Lesson_12;

import Lesson_12.football.Team;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        HashMap<String , Integer  > hashMap = new HashMap<>();
        // 1 - Добавление через элемент PUT
//        hashMap.put("Zenit" , 20);
//        hashMap.put("Spartak" , 19);
//        hashMap.put("Rubin" , 15);
//        hashMap.put("Rubin" , 15);
//        hashMap.put("Rubin11" , null);
//        hashMap.put("Rubin22" , null);
//        hashMap.put("Lokomotic" , 10);
//        hashMap.put(null , 111);
//
//        // 2 - проверка наличие ключа
//
//
//        System.out.println(hashMap.containsKey("Zenit"));
//        System.out.println(hashMap.containsKey("CSKA"));

        // 3 - Проход по коллекции

//        List<String> list = new ArrayList<>();
//        list.add("A");
//        for (String s :list) {
//
//        }

        HashMap<String , Team> table = new HashMap<>();

        table.put("Zenit" , new Team(30,20,21));
        table.put("Spartak" , new Team(25,20,31));
        table.put("Rubin" , new Team(35,20,27));
        for (Map.Entry<String, Team> e :table.entrySet()) {
            System.out.println(e.getKey() + "\n Games " + e.getValue().getGames() + "\n Score" + e.getValue().getScore()
                    + "\n Goals " + e.getValue().getGoals());
        }

        // 4 - Печать ключей

        for (String s : table.keySet()) {
            System.out.println( s + " ; ");
        }

        //5 - вернуть значение по ключу

        for (String s : table.keySet()) {
            System.out.println("goals of  " + s + " = " + table.get(s).getGoals() + ";" );

        }

        // 6 - Удаление

        table.remove("Zenit");



        System.out.println();
    }
}
