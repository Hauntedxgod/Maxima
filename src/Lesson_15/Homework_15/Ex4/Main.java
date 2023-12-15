package Lesson_15.Homework_15.Ex4;

import java.util.Scanner;

public class Main {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        StringBuilder vowel = new StringBuilder();
        StringBuilder con = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] sChar = s.toCharArray();
        for (char c : sChar) {
            if (c == 32) {
                continue;
            }
            if (isVowel(c)) {
                vowel.append(c).append("");
            } else {
                con.append(c).append("");
            }
            System.out.println(vowel.toString());
            System.out.println();
            System.out.println(con.toString());
        }
    }
    


    public static  boolean isVowel(char character) {
        character = Character.toLowerCase(character);
        for (char vowel : vowels) {
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }


}



