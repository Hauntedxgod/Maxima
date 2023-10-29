package Lesson_7;

public class Horse extends  Animal {

    private String horseName;

    public Horse(String food, String location) {
        super(food, location);
    }

    public Horse(String food, String location, String horseName) {
        super(food, location);
        this.horseName = horseName;
    }

    public String getHorseName() {
        return horseName;
    }

    public void setHorseName(String horseName) {
        this.horseName = horseName;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("И го-го");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Лошадь спит");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Лошадь ест");
    }
}
