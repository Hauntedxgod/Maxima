package Lesson_8.ex2;

public class Student {
    private String firstName;
    private String lastName;
    private String group;

    private double averageMark;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

     int getScholarship(){
        return averageMark == 5 ? 2000 : 1900;
    }


    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

//    @Override
//    public String toString() {
//        String text = "";
//        if (this.averageMark == 5 ? 2000 : 1900) {
//            text += "2000грн";
//        }
//        return text;
//    }
}
