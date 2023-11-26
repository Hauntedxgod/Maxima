package Lesson_13.Homework_13.Dictionary;

import java.util.HashMap;

public class Dictionary {

//Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
//2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
//3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
//4. Вывести содержимое Map на экран.

    HashMap<String , String> Human = new HashMap<>();

    public void addHuman (String surname , String name){
        if (Human.containsKey(name)){
        }else {
            Human.put(surname , name);
            System.out.println(" Фамилия " + surname + " Имя " + name);
        }
        }
    }


