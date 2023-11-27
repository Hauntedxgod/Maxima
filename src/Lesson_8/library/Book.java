package Lesson_8.library;

public class Book  extends Reader {
    private String name;
    private String avtor;

    public Book(String fullName, int ticketNumber, String faculty, int dateOfBrith, int number) {
        super(fullName, ticketNumber, faculty, dateOfBrith, number);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvtor() {
        return avtor;
    }


    @Override
    boolean returnBook() {
        super.returnBook();
        return true;
    }

    @Override
    public boolean takeBook(String... nameBook) {
        super.takeBook(nameBook);
        return false;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;



    }
}
