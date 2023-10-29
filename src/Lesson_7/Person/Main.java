package Lesson_7.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFullName("Виктор" );
        person.setAge(32);
        person.move();
        Person person1 = new Person();
        person1.setFullName("Данил");
        person1.setAge(14);
        person1.talk();
    }
}
