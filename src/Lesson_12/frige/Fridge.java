package Lesson_12.frige;

import com.sun.source.tree.CompilationUnitTree;

import java.beans.Introspector;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class Fridge {
    HashMap<String, Integer> products = new HashMap<>();

    public void addProducts(String name, Integer count) {
        if (products.containsKey(name)) {
            Integer alreadyInFridge = products.get(name);
            products.put(name, products.get(name) + count);
        } else {
            products.put(name, count);
        }


    }

    public void take(String name, Integer count) {
        if (!products.containsKey(name)) {
            System.out.println(name);
        } else
            products.put(name, products.get(name) - count);
        Integer alreadyInFridge = products.get(name);
        if (alreadyInFridge < count) {
            System.out.println("Вы хотите забрать " + count + ". У нас столько нет. Есть только " + alreadyInFridge);
            while (true) {
                Scanner scanner = new Scanner(System.in);
                Integer takeCount = scanner.nextInt();
                if (takeCount > alreadyInFridge) {
                    System.out.println("Вы хотите забрать " + takeCount + ". У нас столько нет. Есть только " + alreadyInFridge);
                } else if (takeCount < alreadyInFridge) {
                    products.put(name, alreadyInFridge - takeCount);
                    break;
                } else {
                    products.remove(name);
                    break;
                }
            }
        }
    }

    HashMap<String, Integer> orders = new HashMap<>();

    public void addOrders() throws InterruptedException {
        for (String s : products.keySet()) {
            System.out.println(" Сейчас в холодильнике есть " + products.get(s) + " : " + s );
        }
        // Сколько у меня есть продуктов
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ! ");
        String product = scanner.nextLine();
        System.out.println(" ! ");
        Integer howMany= scanner.nextInt();
        while (true) {
            if (products.containsKey(product)) {
                Integer all = products.get(product);
                System.out.println(product + "Уже есть в холодильнике " + " его количество " + all);
                System.out.println("Точно ли нужно заказать продукт ? ");
                scanner = new Scanner(System.in);
                String Answer = scanner.nextLine();
                if (Answer.equals("Да")){
                    Thread.sleep(1000);

                    products.put(product , all + howMany);
                    for (String s : products.keySet()) {
                        System.out.println(" Сейчас в холодильнике есть " + products.get(s) + " : " + s );
                    }
                    break;
                } else {
                    System.out.println("Error");
                    for (String s : products.keySet()) {
                        System.out.println(" Сейчас в холодильнике есть " + products.get(s) + " : " + s );
                    }
                    break;
                }
            } else {
                Thread.sleep(1000);
                products.put(product , howMany);
                for (String s : products.keySet()) {
                    System.out.println(" Сейчас в холодильнике есть " + products.get(s) + " : " + s );
                }
            }



//            if (howMany > all) {
//                System.out.println(product + "Продукта в этом количестве нету." + howMany + "Его количество " + all +
//                        " его нужно купить ");
//
//                products.remove(product, howMany);
//                orders.put(product, howMany);
//                System.out.println(all + " этот продукт добавлен в  shopping list " + product);
//            }
//            if (howMany < all) {
//                System.out.println(product + "В холодильнике есть такой продукт" + "его количество " + all);
//                break;
//            }


//        if ( count > 0) {
//            System.out.println(name + " этот продукт имеется" + ". Его количество " + count);
//        }
//        if ( count <= 0) {
//            System.out.println(name + " этого продукта нет " + count);
//            orders.put(name, count);
//            System.out.println("Не забудьте купить этот продукт - " + name);
//        }


        }
    }
}





