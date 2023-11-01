package Lesson_8.library;

public class Test {

    public static void main(String[] args) {
        Reader reader = new Reader("DA", 3, "Химия", 16, 2);
        Book book = new Book("ds", 2, "БИО", 16, 6);
        Reader[] readers = {reader, book};


        for (Reader a : readers) {
            System.out.println(a.takeBook());
        }
        for (Reader a : readers) {
            System.out.println(a.returnBook());
        }
    }
}



