package Lesson_6;

import java.util.Scanner;

public class Homework_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nЗадание 1 ");
        Human human = new Human();

        Human human1 = new Human( "Вася " , true ,  23);
        Human human2 = new Human( "Саша " , false ,  11);
        Human human3 = new Human( "Олег " , false ,  76);
        Human human4 = new Human( "Митя " , true ,  2);
        Human human5 = new Human( "Айгуль " , false ,  44 , human1, human1 );
        Human human6 = new Human( "Айрат " , true ,  11 , human2 , human3 );
        Human human7 = new Human( "Дмитрий " , true ,  31 ,human4, human3 );
        Human human8 = new Human( "Валик " , false,  41,human5, human6 );
        Human human9 = new Human( "Валя " , true ,  13,human7,human8);
        System.out.println( human1 + "\n" + human2 + "\n" + human3 + "\n" + human4 + "\n" + human5 + "\n" + human6 +
                "\n" + human7
                + "\n" + human8 + "\n" + human9 );


        System.out.println("\nЗадание 3 ");
        Solution.Man man = new Solution.Man("Гена ", 21, " Минская");
        Solution.Man man1 = new Solution.Man("Витя", 50, "Pushkina");
        Solution.Man man2 = new Solution.Man("Valera ", 11, " Prospekt");

        Solution.Man.Woman woman = new Solution.Man.Woman("Varya ", 30, " Фучика");
        Solution.Man.Woman woman1 = new Solution.Man.Woman("Anna ", 21, " Дубравная");
        Solution.Man.Woman woman2 = new Solution.Man.Woman("Elezaveta ", 29, " Мавлютово");
        System.out.println(man.getName() + "," + man.getAge() + "," + man.getAddress());
        System.out.println(man1.getName() + "," + man1.getAge() + "," + man1.getAddress());
        System.out.println(man2.getName() + "," + man2.getAge() + "," + man2.getAddress());
        System.out.println(woman.getName() + "," + woman.getAge() + "," + woman.getAddress());
        System.out.println(woman1.getName() + "," + woman1.getAge() + "," + woman1.getAddress());
        System.out.println(woman2.getName() + "," + woman2.getAge() + "," + woman2.getAddress());

        System.out.println("\n Задание №4");

        int sum = 0;
        while(true){
            String str1 = scanner.nextLine();
            if (str1.equals("сумма")){
                break;
            }else {
                sum = sum + Integer.parseInt(str1);
            }
            System.out.println(sum);
        }




        System.out.println("\n Задание №5");

        int[] array = new int[5];

        for (int i = 0; i <array.length ; i++) {
            array[i] = scanner.nextInt();
        }


        for (int i = 0; i < array.length; i++) {

            if (array[i] > 0) {
                System.out.println("Числа больше 0 -" + array[i]);
            }

        }
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < max){
                max = array[i];
        }
            System.out.println("макстмальное число " + max);

        }


    }
}





















