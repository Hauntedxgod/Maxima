package Lesson_7.Human;

public class Human {

    private String name;
    private boolean floor;

    private int age;
    private Human dad;
    private Human mom;

    private Human grandFathers;
    private Human grandMothers;


    public Human() {
    }

    public Human(String name, boolean floor, int age, Human dad, Human mom) {
        this.name = name;
        this.floor = floor;
        this.age = age;
        this.dad = dad;
        this.mom = mom;
    }

    public Human(String name, boolean floor, int age) {
        this.name = name;
        this.floor = floor;
        this.age = age;
    }


    public Human(String name, boolean floor, int age, Human dad, Human mom, Human grandFathers, Human grandMothers) {
        this.name = name;
        this.floor = floor;
        this.age = age;
        this.dad = dad;
        this.mom = mom;
        this.grandFathers = grandFathers;
        this.grandMothers = grandMothers;
    }

    public Human getGrandFathers() {
        return grandFathers;
    }

    public void setGrandFathers(Human grandFathers) {
        this.grandFathers = grandFathers;
    }

    public Human getGrandMothers() {
        return grandMothers;
    }

    public void setGrandMothers(Human grandMothers) {
        this.grandMothers = grandMothers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFloor() {
        return floor;
    }

    public void setFloor(boolean floor) {
        this.floor = floor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human getDad() {
        return dad;
    }

    public void setDad(Human dad) {
        this.dad = dad;
    }

    public Human getMom() {
        return mom;
    }

    public void setMom(Human mom) {
        this.mom = mom;
    }

    public String toString(){
        String text = "";
        text += " Имя " + this.name;
        text += ", пол " + (this.floor ? " Мужской " : " Женский " );
        text += ", Возраст " + this.age;
        if(this.dad != null){
            text += ", Отец " + this.dad.name;
        }  if (this.mom != null){
            text += ", Мама " + this.mom.name;
        } if (this.grandFathers != null){
            text += ", Дедушка " + grandFathers.name;
        }  if (this.grandMothers != null ) {
            text += ", Бабушка " + grandMothers.name;
        }

        return text;
    }

}
