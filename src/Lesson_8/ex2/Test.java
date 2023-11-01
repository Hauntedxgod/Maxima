package Lesson_8.ex2;

public class Test  {
    public static void main(String[] args) {
        Student student = new Student("Evgeniy" , "Laskov" , "1301" , 5);
        Aspirant aspirant = new Aspirant("Oleg" , "Evreev" , "1901" , 5);
        Student[] students = {student , aspirant};

        for (Student a : students) {
            System.out.println(a.getScholarship());
        }
    }
}
