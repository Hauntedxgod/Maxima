package Lesson_4;

import java.util.Scanner;

public class Homework_3 {
    public static void main(String[] args) {


        int[] premougol = {2, 1};
        for (int i = 1; i < premougol.length; i++) {
            System.out.println("8888");
        }
        for (int i = 1; i < premougol.length; i++) {
            System.out.println("8888");
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(8);
            System.out.println();

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Число: ");
        int a = scanner.nextInt();
        System.out.println("Число: ");
        int b = scanner.nextInt();
        System.out.println("Число: ");
        int c = scanner.nextInt();


        if (a < b && a > c) {
            System.out.println(a);
        } else if (a < b && b < c) {
            System.out.println(b);
        } else
            System.out.println(c);


        System.out.println("Введите  число: ");
        int counter = 0;
        int number = scanner.nextInt();
        while (true) {
            counter += number;
            if (number == -1) {
                break;
            }



                for (int i1 = 0; i1 <= 10; i1++) {
                    for (int j = 0; j <= 10; j++) {
                        System.out.printf("%4d", j * i1);
                    }
                    System.out.println( );
                }


                String str1 = scanner.nextLine();
                System.out.println("Меня зову " + str1);
                int a2 = scanner.nextInt();
                int b1 = scanner.nextInt();
                int c1 = scanner.nextInt();
                System.out.print("Дата рождения " + a + "." + b + "." + c);


            }

            }
        }

















