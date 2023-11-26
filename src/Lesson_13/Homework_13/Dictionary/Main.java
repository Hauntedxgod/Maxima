package Lesson_13.Homework_13.Dictionary;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.addHuman("Павлов" , "Дмитрий");
        dictionary.addHuman("Павлов" , "Вася");
        dictionary.addHuman("Павлов" , "Семен");
        dictionary.addHuman("Павлов" , "Олег");
        dictionary.addHuman("Павлов" , "Саша");
        dictionary.addHuman("Павлов" , "Митя");
        dictionary.addHuman("Павлов" , "Федор");
        dictionary.addHuman("Павлов" , "Витя");
        dictionary.addHuman("Павлов" , "Алексей");
        dictionary.addHuman("Павлов" , "Миша");
        System.out.println();
        dictionary.addHuman("Павлов" , "Гена");
        dictionary.addHuman("Иванов" , "Гена");
        dictionary.addHuman("Смиронов" , "Гена");
        dictionary.addHuman("Кузнецов" , "Гена");
        dictionary.addHuman("Попов" , "Гена");
        dictionary.addHuman("Васильев" , "Гена");
        dictionary.addHuman("Петров" , "Гена");
        dictionary.addHuman("Соколов" , "Гена");
        dictionary.addHuman("Михайлов" , "Гена");
        dictionary.addHuman("Волков" , "Гена");
        System.out.println();
    }
}
