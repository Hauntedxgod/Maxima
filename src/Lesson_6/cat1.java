package Lesson_6;

public class cat1 {
    String name;
    int ves;
    int age;
    String color;
    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVes() {
        return ves;
    }

    public void setVes(int ves) {
        if (ves < 5) {
            ves = 6;
        }
        this.ves = ves;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            age = 0;
        }
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

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


