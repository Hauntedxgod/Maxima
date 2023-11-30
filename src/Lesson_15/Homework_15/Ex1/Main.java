package Lesson_15.Homework_15.Ex1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

        // напишите тут ваш код

        HashMap<Character, Integer> map = new HashMap<>();
        for (String s : list) {
            for (Character c : s.toCharArray()) {
                for (int i = 0; i < alphabet.size(); i++) {
                    if (c == alphabet.get(i)) {
                        map.put(c, map.get(c) + 1);
                    }
                }
            }
        }

                for (Map.Entry d : map.entrySet()) {

                    System.out.println(d.getKey() + " " + d.getValue());
                }
     }
}



