package Lesson_15;

import org.apache.log4j.Logger;


public class TestFormat {
    private static final Logger LOGGER = Logger.getLogger(TestFormat.class);
    public static void main(String[] args) {
        int age = 32;
        String name = "Victor";

//        System.out.printf("Hello! My name is %s. My age is %d ", name , age );
        LOGGER.debug("Hello! My name is Damir. My age is 21");
        LOGGER.error("Hello! My name is Damir. My age is 21");
    }


}
