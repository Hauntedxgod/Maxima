package Lesson_6;

public class cat1 {
    String name;
    int ves = 5;
    int age = 12;
    String color;
    String address;



    public cat1(String name) {
        this.name = name;
    }

    public cat1(String name, int ves, int age) {
        this.name = name;
        this.ves = ves;
        this.age = age;
    }

    public cat1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public cat1(int ves, String color) {
        this.ves = ves;
        this.color = color;
    }

    public cat1(int ves, String color, String address) {
        this.ves = ves;
        this.color = color;
        this.address = address;
    }

    public String toString() {
        return "Name: " + name + ", Color: " + color + ", Address: " + address + ", Weight: " + ves + ", Age: " + age;
    }
}


