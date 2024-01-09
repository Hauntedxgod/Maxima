package Lesson_20.blackjack;

import Lesson_20.blackjack.model.Croupier;
import Lesson_20.blackjack.model.Game;
import Lesson_20.blackjack.model.Player;

public class BlackJack {
    public static void main(String[] args) {
        // 1- Создать игру
        // 2 - Создаем игроков
        // 3 - Создаем крупье
        // 4 - Добавить игроков и крупье в игру
        // 5 - Добавить колоду карт
        // 6 - Добавить карту в колоду
        // 7 - Раздать по 2 карты игроку
        // 8- Раздавать по одной карте игроку
        Game  game = new Game();
        Player player1 = new Player("Igor");

        Player player2 = new Player("Victor");

        game.addPlayer(player1);

        game.addPlayer(player2);

        Croupier croupier = new Croupier();

        game.addCroupier(croupier);

        game.giveTwoRandomCardsEachPlayerOnStart();// Раздаем карты

        game.oneCardIfCroupierNeed();

        game.oneCardIfPlayerNeed();


        game.determineWinner();

    }
}
