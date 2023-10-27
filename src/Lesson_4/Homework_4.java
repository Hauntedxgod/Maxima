package Lesson_4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Homework_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = new String[10];

        for (int i = 0; i < 8; i++) {
            array[i] = scanner.nextLine();
            System.out.println("Ввести 8 строк - " + i);

        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println("Вывести весь массив в обратном порядке -  " + array[i]);

        }

        int[] array2 = new int[10];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }

        int max = 0;

        for (int i = 0; i < array2.length; i++) {

            if (max > array2[i]) {
                max = array2[i];

            }

            System.out.println(max);


        }

        String[] str1 = new String[10];
        int[] array3 = new int[10];

        for (int i = 0; i < str1.length; i++) {
            str1[i] = scanner.nextLine();


        }
        for (int i = 0; i < array3.length; i++) {
            array3[i] = str1[i].length();


        }
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }


        System.out.println("\nЗадание №4");
        int[] array4 = new int[10];

        for (int i = 0; i < 10; i++) {
            array4[i] = scanner.nextInt();
        }
        for (int i = array4.length - 1; i >= 0; i--) {

            System.out.println("Вывести в обратном порядке - " + array4[i]);
        }

        System.out.println("\nЗадание №5");
        int[] array5 = new int[20];
        for (int i = 0; i < array5.length; i++) {
            array5[i] = scanner.nextInt();

        }
        int[] array6 = new int[10];
        for (int i = 1; i < array6.length; i++) {

        }
        int[] array7 = new int[10];
        for (int i = array7.length; i <= 20; i++) {
            System.out.println("второй массив " + array5[i]);
        }

            int[] array8 = new int[20];


            for (int i = 0; i < array8.length; i++) {
                array8[i] = scanner.nextInt();
            }

            int max1 = array8[0];


            int min = array8[0];

            for (int i = 0; i < array8.length; i++) {
                if (max1 < array8[i]) {
                    max1 = array8[i];
                }
            }
            for (int i = 0; i < array8.length; i++) {
                if (min > array8[i]) {
                    min = array8[i];

                }
                }


                for (int maxMin : array8) {
                    System.out.println(max + " , " + min);
                }


                int[] array9 = new int[20];


                for (int i = 0; i < array9.length; i++) {
                }


                for (int i = array9.length - 1; i >= 0; i--) {
                    System.out.println(array9[i]);

                }
            }
        }





















            
























