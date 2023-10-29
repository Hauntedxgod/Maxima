package Lesson_7;

public class Cat extends Animal {

    private String catName;


    public Cat(String food, String location) {
        super(food, location);
    }

    public Cat(String food, String location, String catName) {
        super(food, location);
        this.catName = catName;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Мяу");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Кошка спит");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Кошка ест");
    }


}

