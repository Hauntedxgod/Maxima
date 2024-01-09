package Lesson_20.blackjack.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckOfCards { // Колода карт
    private List <Card> cards;


    public DeckOfCards() {
        cards = List.of(new Card("Двойка Пики", 2),
                new Card("Двойка Трефы", 2),
                new Card("Двойка Бубны", 2),
                new Card("Двойка Червы", 2),

                new Card("Тройка Пики", 3),
                new Card("Тройка Трефы", 3),
                new Card("Тройка Бубны ", 3),
                new Card("Тройка Червы", 3),

                new Card("Четверка Пики", 4),
                new Card("Четверка Трефы", 4),
                new Card("Четверка Бубны", 4),
                new Card("Четверка Червы", 4),

                new Card("Пятерка Пики", 5),
                new Card("Пятерка Трефы", 5),
                new Card("Пятерка Бубны", 5),
                new Card("Пятерка Червы", 5),

                new Card("Шестерка Пики", 6),
                new Card("Шестерка Трефы", 6),
                new Card("Шестерка Бубны", 6),
                new Card("Шестерка Червы", 6),

                new Card("Семерка Пики", 7),
                new Card("Семерка Трефы", 7),
                new Card("Семерка Бубны", 7),
                new Card("Семерка Червы", 7),

                new Card("Восьмерка Пики", 8),
                new Card("Восьмерка Трефы", 8),
                new Card("Восьмерка Бубны", 8),
                new Card("Восьмерка Червы", 8),

                new Card("Девятка Пики", 9),
                new Card("Девятка Трефы", 9),
                new Card("Девятка Бубны", 9),
                new Card("Девятка Червы", 9),

                new Card("Десятка Пики", 10),
                new Card("Десятка Трефы", 10),
                new Card("Десятка Бубны", 10),
                new Card("Десятка Червы", 10),

                new Card("Валет Пики", 10),
                new Card("Валет Трефы", 10),
                new Card("Валет Бубны", 10),
                new Card("Валет Червы", 10)

                , new Card("Дама Пики", 10)
                , new Card("Дама Трефы", 10)
                , new Card("Дама Бубны", 10)
                , new Card("Дама Червы", 10)

                , new Card("Король Пики", 10)
                , new Card("Король Трефы", 10)
                , new Card("Король Бубны", 10)
                , new Card("Король Червы", 10)

                , new Card("Туз Пики", 11)
                , new Card("Туз Трефы", 11),
                new Card("Туз Бубны", 11),
                new Card("Туз Червы", 11));
    }
    public Card getRandomCard(){
        Random random = new Random();
        return cards.get(random.nextInt(0,cards.size() ));
    }
}
