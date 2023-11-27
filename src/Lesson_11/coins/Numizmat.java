package Lesson_11.coins;

import java.util.HashSet;
import java.util.TreeSet;

public class Numizmat {
    public static void main(String[] args) {
        Coin coin1 = new Coin(10 , 15.3 , "Russia" , 2008);
        Coin coin2 = new Coin(5 , 21.1 , "Belarus" , 2008);
        Coin coin3 = new Coin(2 , 19.3 , "Spain" , 2002);
        Coin coin4 = new Coin(3 , 21.4 , "Georgy" , 2002);
        Coin coin5 = new Coin(10 , 15.3 , "Russia" , 2008);



        HashSet<Coin> collection = new HashSet<>();
        collection.add(coin1);

        collection.add(coin2);

        collection.add(coin3);

        collection.add(coin4);

        collection.add(coin5);

        boolean compareTwoCoins = coin1.equals(coin2);

        System.out.println(compareTwoCoins);

        System.out.println(coin1.hashCode());

        System.out.println(coin1);

        TreeSet<Coin> coinTreeSet = new TreeSet<>();
        coinTreeSet.add(coin1);
        coinTreeSet.add(coin2);
        coinTreeSet.add(coin3);
        coinTreeSet.add(coin4);
//        coinTreeSet.add(coin6);
//        coinTreeSet.add(coin7);
//        coinTreeSet.add(coin8);
//        coinTreeSet.add(coin9);



        System.out.println(coin1);

    }
}
