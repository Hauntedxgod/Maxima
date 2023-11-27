package Lesson_3;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        /**Операторы сравнения

         == Проверяет, равны или нет значения двух операндов, если да,
         то условие становится истинным (A == B) – не верны

         != Проверяет, равны или нет значения двух операндов,
         если значения не равны, то условие становится истинным (A != B) – значение истинна

         > Проверяет, является ли значение левого операнда больше,
         чем значение правого операнда, если да, то условие становится истинным (A > B) – не верны

         < Проверяет, является ли значение левого операнда меньше,
         чем значение правого операнда, если да, то условие становится истинным (A < B) – значение истинна

         >= Проверяет, является ли значение левого операнда больше или равно значению правого операнда,
         если да, то условие становится истинным (A >= B) – значение не верны

         <= Проверяет, если значение левого операнда меньше или равно значению правого операнда,
         если да, то условие становится истинным (A <= B) – значение истинна*/


//        int a = 10;

//        int b = 10;

//        boolean c = a <= b ;

//        System.out.println(c);

        /**Логические операторы

         && Называется логический оператор «И». Если оба операнда являются не равны нулю, то условие становится истинным
         || Называется логический оператор «ИЛИ». Если любой из двух операндов не равен нулю, то условие становится истинным
         ! Называется логический оператор «НЕ». Использование меняет логическое состояние своего операнда.
         Если условие имеет значение true, то оператор логического «НЕ» будет делать false*/

// 2 условия - если оба совпадают тогда true, если нет то folse.
//        boolean bool1 = 10 > 5 && 15 < 10;


        // 2 условия - если хотя бы одно из них true, тогда true
//        boolean bool2 = 100 > 50 || 50 > 100;


//        System.out.println(!bool2);


//        int age = 11;

 //       if (age > 14 ) {
//            System.out.println("Ок,проходите на фильм");

//        }
//        else {
//            System.out.println("Нет,на фильм нельзя");
//       }

//        int height = 125;

//        if (height > 125 && height < 220 ){
//            System.out.println("Да,можно");
//        }else {
//            System.out.println("Нет, прохода нет");
//        }


//       int k1 = 5;

//        if (k1 == 1) {
//            System.out.println("Сегодня понедельник");

//        } else if (k1 == 2) {
//            System.out.println("Сегодня вторние");

//        } else if (k1 == 3) {
//            System.out.println("Сегодня ср");
//        } else if (k1 == 4) {
//            System.out.println("Сегодня чт");
//        } else if (k1 == 5) {
//            System.out.println("Сегодня пт");
//        } else if (k1 == 6) {
//            System.out.println("Сегодня суб");
//        } else {
//            System.out.println("Сегодня неизвестный день ");
//        }

















//        int s = 125;

//        if ( s < 49 && s < 100){
//            System.out.println("Это число не совподает");
//        }else {
//            System.out.println("Совподате");
//        }








//        int n = 10;
//        System.out.println();
//        Scanner scanner = new Scanner(System.in);

//        int day = scanner.nextInt();



//        switch (day){
//            case (1):
//                System.out.println("Сегодня понедельник");
//                break;
//            case (2):
//                System.out.println("Сегодня вт");
//                break;
//            case (3):
//                System.out.println("Сегодня ср");
//                break;
//            case (4):
//                System.out.println("Сегодня чт");
//                break;
//           case (5):
//                System.out.println("Сегодня пт");
//               break;
//          case (6):
//                System.out.println("Сегодня сб");
//                break;
//            default:
//                System.out.println("Неизвестно");



        Scanner scanner = new Scanner(System.in);

        int temp = scanner.nextInt();

        switch (temp){
            case (- 15) :
                System.out.println("Сегодня холодно");
                break;
            case (0):
                System.out.println("Сегодня нормально");
                break;
            case (15):
                System.out.println("Сегодня тепло");
                break;
            default:
                System.out.println("Не понятно");

        }


        }
}
















