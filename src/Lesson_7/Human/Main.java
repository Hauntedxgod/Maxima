package Lesson_7.Human;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();

        Human human1 = new Human("Вася", true , 32 );
        Human human2 = new Human("Вика",false,40 );
        Human human3 = new Human(" Генадий" ,  true ,  20 ,  human1 ,  human2, human1 , human1 );


        System.out.println(human3);
    }
}
