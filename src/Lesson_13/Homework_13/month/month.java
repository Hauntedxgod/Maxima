package Lesson_13.Homework_13.month;

import java.util.HashMap;
import java.util.Scanner;

public class month {

// Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
// Используй коллекции.
        Scanner scanner = new Scanner(System.in);


        HashMap<String, Integer> hashMap = new HashMap<>();


        public void add() {
            System.out.println(" Введите месяц");
            String months = scanner.nextLine();
            System.out.println(" Введите число");
            Integer number = scanner.nextInt();
            while (true) {
                hashMap.put(months , number);
                System.out.println(months + " is the " + number + " month.");
                break;
            }
        }
    }

