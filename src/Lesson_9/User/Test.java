package Lesson_9.User;

public class Test {
    public static void main(String[] args) {
        User user = new User("Вера" , "dadqeq" , "dadqeq");


        try {
            User.isLoginPassword(user.getLogin(), user.getPassword(), user.getConfirmPassword());
        }catch (WrongLoginException | WrongPasswordException e){
            System.out.println(e.getMessage());
        }

    }
}
