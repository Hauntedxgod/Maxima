package Lesson_8.library;

public class Reader {
    private String fullName;
    private int ticketNumber;
    private String faculty;
    private int dateOfBrith;
    private int number;


    public Reader(String fullName, int ticketNumber, String faculty, int dateOfBrith, int number) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.dateOfBrith = dateOfBrith;
        this.number = number;
    }


     boolean takeBook( ){
         System.out.println("Взял 3 книги");
         return true;
     }



//    static {
//         takeBook("Петров В. В. взял 3 книги: " , "Приключения, Словарь, Энциклопедия");
//    }


   boolean returnBook(){
        System.out.println("Вернул 3 книги");

       return true;
   }

//    static {
//         returnBook("Петров В. В. вернул 3 книги: ","Приключения, Словарь, Энциклопедия");
//    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getDateOfBrith() {
        return dateOfBrith;
    }

    public void setDateOfBrith(int dateOfBrith) {
        this.dateOfBrith = dateOfBrith;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }



}
