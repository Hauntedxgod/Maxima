package Lesson_15.Homework_15.Ex5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> resultList = new ArrayList<>();
        List<String> input = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            input.add(scanner.nextLine());
        }
        List<Integer> numbers = new ArrayList<>();
        List<String> words = new ArrayList<>();
        for (String word : input) {
            if (isNumber(word)){
                numbers.add(Integer.valueOf(word));
            }else {
                words.add(word);
            }
        }
        words = words.stream().sorted().toList();
        numbers = numbers.stream().sorted().toList();
        Collections.reverse(numbers);

        int wordI = 0;
        int numberI = 0;
        for(String word : input){
            if (isNumber(word)){
                resultList.add(numbers.get(numberI).toString());
                numberI++;

            }else {
                resultList.add(words.get(wordI));
                wordI++;
            }
        }

        for (int i = 0; i < resultList.size(); i++) {
            System.out.println(resultList.get(i));
        }
    }
    private static boolean isNumber(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (!Character.isDigit(string.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}

