package Lesson_20.blackjack.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Player {

    private String namePlayer;
    private List<Card> cardOnHands = new ArrayList<>();

    public Player(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public void takeCard(Card card) {
        cardOnHands.add(card);
    }

    public int sumValuesOnHand() {
        int count = 0;
        for (Card card : cardOnHands) {
            count += card.getValue();

        }
        return count;
    }

    public void showCards() {
        cardOnHands.forEach(x -> System.out.println(x.getName()));
    }

    public boolean isNeedCard() {
        System.out.println("-----Ваши карты-----");
        showCards();
        System.out.println("Нужна ли вам еще одна карта " + namePlayer + " ? Сумма ваших карт - " + sumValuesOnHand());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Я понимаю толька yes or no, введите значение");
        String answer = scanner.nextLine();
            if ("yes".equals(answer)) {
                return true;
            } else if ("no".equals(answer)) {
                return false;
            }
            return false;
    }
}
