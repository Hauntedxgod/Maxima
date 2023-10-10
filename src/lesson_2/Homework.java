package lesson_2;



public class Homework {
    public static void main(String[] args){

     int a = 1;
     int b = 3;
     int c = 9;
     int d = 27;



        int result = -a + b - c + d;

        System.out.println(result);

        // Пусть цена товара A обычно составляет 1000 руб, и товара B составляет 500 руб.
        // Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.


            double a1 = 1000.0;

            double b1 = 500.0;


            double general = a1 + b1;
            System.out.println("Сумма в общем - " + general);
            double purchase = (a1 + b1) - ((a1 + b1) * 10) / 100;
            System.out.println("Сумма покупки со скидкой - " + purchase);
            double discount = (a1 + b1) / 10;
            System.out.println("Сумма скидки - " + discount);


            double rub = 200;
            double rub2 = 30;

            double took = (10 * rub) - ((10 * rub) / 100) * 15 + (2 * rub2);


            System.out.println("Итоговая цена - " + took);


            double tovar1 = 500;
            double tovar2 = 50;
            double itogtovara = (tovar1 * 7) - ((tovar1 * 7) / 100) * 50 + (1 * tovar2);

            System.out.println("Итоговая цена - " + itogtovara);


            int apple1 = 300;
            int onion = 20;

            int itog = (apple1 * 2) - ((apple1 * 2) / 100) * 10 + (onion * 3);

            System.out.println("Итог всего - " + itog);


        }
    }















