package Lesson_20.blackjack.model;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> playersInGame = new ArrayList<>();
    private DeckOfCards deck = new DeckOfCards();
    private List<Croupier> croupiersInGame = new ArrayList<>();


    public void addCroupier(Croupier croupier) {
        croupiersInGame.add(croupier);
    }

    public void addPlayer(Player player) {
        playersInGame.add(player);
    }


    public void giveTwoRandomCardsEachPlayerOnStart() {
        for (Player player : playersInGame) {
            player.takeCard(deck.getRandomCard());
            player.takeCard(deck.getRandomCard());
            for (Croupier croupier : croupiersInGame) {
                croupier.takeCardCroupier(deck.getRandomCard());
            }
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
        for (Croupier croupier : croupiersInGame) {
            while (croupier.isNeedCardCroupier()) {
                croupier.takeCardCroupier(deck.getRandomCard());
            }
        }
    }

    public void determineWinner() {
        int a = 21;
        for (Croupier croupier : croupiersInGame) {
            for (Player player : playersInGame) {
//                if (croupier.sumValuesOnHandCroupier() <= a ) {
                if (croupier.sumValuesOnHandCroupier() <= a && player.sumValuesOnHand() > a){
                    System.out.println("Выиграл крупье " + croupier.name());
                } else if (player.sumValuesOnHand() == croupier.sumValuesOnHandCroupier()){
                    System.out.println("Ничья - " + player.namePlayers()+ ". " + croupier.name());
                }
                if (player.sumValuesOnHand() <= a && croupier.sumValuesOnHandCroupier() != a) {
                    System.out.println("Игрок " + player.namePlayers() +  " выиграл");
                }else  if (player.sumValuesOnHand() != a && croupier.sumValuesOnHandCroupier() <= a){
                    System.out.println("Вы Проиграли( " + player.namePlayers());
                }
            }
        }
    }
}
