package Lesson_7;

public class Dog extends Animal{


    private String dogName;

    public Dog(String food, String location) {
        super(food, location);
    }

    public Dog(String food, String location, String dogName) {
        super(food, location);
        this.dogName = dogName;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Гав гав");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Собака спит");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Собака ест");
    }
}
