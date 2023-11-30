package Lesson_15.Homework_15.Ex2;

import java.util.HashMap;
import java.util.Scanner;

public class Couple {
    public static void main(String[] args) {

        // Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
        //Нужно сделать так, чтобы программа вводила с клавиатуры пары (число и строку) и сохраняла их в HashMap.
        //
        //Ключевые требования:
        //Пустая строка - конец ввода данных.
        //Числа могут повторяться.
        //Строки всегда уникальны.
        //Введенные данные не должны потеряться!
        //Затем программа должна выводить содержание HashMap на экран.
        //Каждую пару - с новой строки.


        HashMap<Integer, String> map = new HashMap<>();

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Введите число ");
            Integer number = scanner.nextInt();


            System.out.println("Введите стоку ");
            scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                map.put(number, line);
                System.out.println(number + " " + line);
                break;
            }
            map.put(number, line);
            System.out.println(number + " " + line);
        }
        for (Integer s : map.keySet()) {
            System.out.println(s + map.get(s));

        }
        //
    }
}








