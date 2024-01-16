package Lesson_20.blackjack.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Croupier  extends Player{
    public Croupier (String namePlayer){
        super(namePlayer);
    }

    @Override
    public boolean isNeedCard() {
        if(this.sumValuesOnHand() <  21){
            System.out.println("---Карты Croupier--- ");
            System.out.println("Card " + getNamePlayer()+ " " + sumValuesOnHand());
            return true;
        } else {
            System.out.println("Croupier добрала карты \n" + getNamePlayer() + " Card " + sumValuesOnHand());
            System.out.println(" ");
            return false;

        }
    }
}
