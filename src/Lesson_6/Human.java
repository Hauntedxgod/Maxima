package Lesson_6;


public class Human {
    String name;
    int age;

    boolean gender;
    Human mom;
    Human father;


    public Human() {
    }


    public Human(String name, boolean gender, int age, Human mom, Human father) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.mom = mom;
        this.father = father;
    }

    public Human(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    public String toString() {
        String Human = "";
        Human += " Имя:" + this.name;
        Human += ", Пол: " + (this.gender ? "Мужской " : "Женский ");
        Human += ", Возраст: " + this.age;

        if (this.father != null) {
            Human += ", Отец " + this.father.name;
        }
        if (this.mom != null) {
            Human += ", Мать " + this.mom.name;
        }

        return Human;







        }
        }








