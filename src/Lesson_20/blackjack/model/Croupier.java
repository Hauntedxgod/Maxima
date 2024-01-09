package Lesson_20.blackjack.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Croupier {
    private List<Croupier> croupiers = new ArrayList<>();

    public List<Croupier> getCroupiers() {
        return croupiers;
    }

    public void setCroupiers(List<Croupier> croupiers) {
        this.croupiers = croupiers;
    }
    public String name(){
        String name = "Katrina";
        return name;
    }
    private List<Card> cardOnHandsCroupier = new ArrayList<>();

    public void takeCardCroupier(Card card) {
        cardOnHandsCroupier.add(card);
    }

    public int sumValuesOnHandCroupier() {
        int count = 0;
        for (Card card : cardOnHandsCroupier) {
            count += card.getValue();

        }
        return count;
    }

    public void showCardsCroupier() {
        cardOnHandsCroupier.forEach(x -> System.out.println(x.getName()));
    }
    public boolean isNeedCardCroupier() {
        System.out.println("-----Ваши карты-----");
        showCardsCroupier();
        System.out.println("Нужна ли вам еще одна карта " +  name() + " ? Сумма ваших карт - " + sumValuesOnHandCroupier());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Я понимаю толька да или нет, введите значение");
        if ("yes".equals(scanner.nextLine())) {
            return true;
        } else if ("no".equals(scanner.nextLine())) {
            return false;
        }
        return false;
    }
}
