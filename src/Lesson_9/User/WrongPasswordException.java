package Lesson_9.User;

public class WrongPasswordException extends Exception {
    public WrongPasswordException (String message){
        super(message);
    }
}
