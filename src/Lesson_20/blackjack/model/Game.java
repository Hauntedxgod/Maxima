package Lesson_20.blackjack.model;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> playersInGame = new ArrayList<>();
    private DeckOfCards deck = new DeckOfCards();
    private Croupier croupier;


    public void addCroupier(Croupier croupier) {
       this.croupier = croupier;
    }

    public void addPlayer(Player player) {
        playersInGame.add(player);
    }


    public void giveTwoRandomCardsEachPlayerOnStart() {
        for (Player player : playersInGame) {
            player.takeCard(deck.getRandomCard());
            player.takeCard(deck.getRandomCard());
        }
        for (int i = 0; i < 2 ; i++) {
            croupier.takeCard(deck.getRandomCard());
        }
    }

    public void oneCardIfPlayerNeed() {
        for (Player player : playersInGame) {
            while (player.isNeedCard()) {
                player.takeCard(deck.getRandomCard());
            }
        }
    }

    public void oneCardIfCroupierNeed() {
            while (croupier.isNeedCard()) {
                croupier.takeCard(deck.getRandomCard());
            }
        }


    public void determineWinner() {
        int a = 21;
            for (Player player : playersInGame) {
//                if (croupier.sumValuesOnHandCroupier() <= a ) {
                if (croupier.sumValuesOnHand() <= a && player.sumValuesOnHand() > a){
                    System.out.println("Выиграл крупье " + croupier.getNamePlayer());
                } else if (player.sumValuesOnHand() == a && a == croupier.sumValuesOnHand()){
                    System.out.println("Ничья - " + player.getNamePlayer()+ ". " + croupier.getNamePlayer());
                }
                if (player.sumValuesOnHand() <= a && croupier.sumValuesOnHand() != a) {
                    System.out.println("Игрок " + player.getNamePlayer() +  " выиграл");
                }else  if (player.sumValuesOnHand() != a && croupier.sumValuesOnHand() <= a){
                    System.out.println("Вы Проиграли " + player.getNamePlayer());
                }
        }
    }
}
