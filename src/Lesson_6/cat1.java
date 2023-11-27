package Lesson_6;

public class cat1 {
    String name;
    int ves;
    int age;
    String breed;
    String color;
    String address;

    public String getBreed() {
        return breed;
    }

    public cat1(String name, int age, String breed, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVes() {
        return ves;
    }

    @Override
    public String toString() {
        return "cat1{" +
                "name='" + name + '\'' +
                ", ves=" + ves +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void setVes(int ves) {
        this.ves = ves;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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

}


