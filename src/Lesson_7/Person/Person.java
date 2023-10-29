package Lesson_7.Person;

public class Person {
    private String fullName;
    private int age;



    void move(){
        System.out.println("Такой то Person " + fullName +  ",его возраст " + age + ", говорит  привет."  );
    }
    void talk(){
        System.out.println("Такой то Person " + fullName +  ",его возраст " + age + ", говорит  пока ." );
    }

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
