package Lesson_9.User;




public class User {
    private String Login;
    private String password;

    private String confirmPassword;

    public User(String login, String password, String confirmPassword) {
        Login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static boolean isTrue(String s) {
        if (s == null || s.length() > 20) {
            return true;
        }
        String s1 = s.replaceAll("dadadad" , "");
        if (s1.equals(s)){
            return true;
        } else return false;

    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    static void isLoginPassword (String login , String password , String confirmPassword) throws  WrongPasswordException , WrongLoginException{
        if (isTrue(login)){
            throw new WrongLoginException("Логин не верный!");
        } else if (isTrue(password)) {
            throw new WrongPasswordException("Пароль не верный");
        } else if (password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        } else if (isTrue(login) && isTrue(password) && password.equals(confirmPassword)) {
            System.out.println(true);
        }

    }

}






