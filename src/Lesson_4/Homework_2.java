package Lesson_4;

import java.util.Scanner;

public class Homework_2 {
    public static void main(String[] args) {

        System.out.println("\nЗадача №1 ");
        int a = 5;
        int b = 5;

        if (a > b) {
            System.out.println("Число меньше 5 ");
        } else if (a < b) {
            System.out.println("Число больше 5 ");
        } else if (a == b) {
            System.out.println("Число равно 5 ");
        } else
            System.out.println("Не то число");

        System.out.println("\nЗадача №2 ");

        int number = 55;

        if (number > 50 && number < 100) {
            System.out.println("Число " + number + " содержится в интервале");
        } else {
            System.out.println("Число " + number + " не содержится в интервале.");
        }
        System.out.println("\nЗадача №3 ");

//        Scanner scanner = new Scanner(System.in);
//
//        int month = scanner.nextInt();
//        switch (month) {
//            case 1:
//                System.out.println("Зима");
//                break;
//            case 2:
//                System.out.println("Весна");
//                break;
//            case 3:
//                System.out.println("Лето");
//                break;
//            case 4:
//                System.out.println("Осень");
//                break;
//            default:
//                System.out.println("Не понятное время года");







               System.out.println("\nЗадача №4 ");


        int m1 = -1;

        if (m1 > 0) {
            m1 = m1 * 2;
            System.out.println(m1);
        } else if (m1 < 0) {
            m1 = m1 + 1;
            System.out.println(m1);
        } else if (m1 == 0) {
            m1 = 0;
            System.out.println(m1);
        }

        System.out.println("\nЗадача №5 ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Число: ");
        int years = scanner.nextInt();

        if ( years % 400 == 0 && years % 4 == 0 ){
            System.out.println("Високосный год");
        }else if (years % 100 != 0){
            System.out.println("обычный год");
        }


        System.out.println("\nЗадача №6 ");

        System.out.println("Первая сторона треугольника: ");
        int a1 = scanner.nextInt();
        System.out.println("Вторая сторона треугольника: ");
        int b1 = scanner.nextInt();
        System.out.println("Третья сторона треугольника: ");
        int c1 = scanner.nextInt();

        if ( a1 > c1 && b1 > c1 ){
            System.out.println("Треугольник существует ");
        } else if ( b > ( c1 + a1 ) ) {
            System.out.println("Сравнение сторон");
        }else if (a1 >= b1 || c1 >= a1 || b1 >= c1){
            System.out.println("Треугольника не существует");
        }


        System.out.println("\nЗадача №7 ") ;

        System.out.println("Время: ");
        double f = scanner.nextDouble();


        if ( f == 1 ) {
            System.out.println("Зеленый");
        } else if (f == 2) {
            System.out.println("Желтый");
        } else if (f == 3) {
            System.out.println("Красный");
        } else if (f == 2.5) {
            System.out.println("Зеленый");
        }


    }

}















