package Lesson_8.ex2;

public class Aspirant extends Student {
    private String firstName;
    private String lastName;
    private String group;

    private double averageMark;

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getGroup() {
        return group;
    }

    @Override
    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public double getAverageMark() {
        return averageMark;
    }

    @Override
    public void setAverageMark(double averageMark) {
        super.setAverageMark(averageMark);
    }
    int getScholarship(){
        return averageMark == 5 ? 2500 : 2200;
    }

//    @Override
//    public String toString() {
//        String text = "";
//        if ( this.averageMark == 5 ? 2500 % 2200):
//            text += "2500грн";
//        } else if ( ){
//            text += "2200грн";
//        }
//        return text;
//    }
}
