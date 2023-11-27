package Lesson_13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestLambda {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("Hello");
        strings.add("A");
        strings.add("GGGG");
        strings.add("Hello World");
        strings.add("He");

        strings.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()){
                    return 1;
                }else if (o1.length() == o2.length()){
                    return 0;
                }else {
                    return -1;
                }

            }
        });
        System.out.println(strings);
        strings.sort((o1, o2) -> o2.length() - o1.length());

        int a = 10;
        strings.forEach(x -> {
            System.out.println(x);
            System.out.println(x + "!!!");
        });




    }
}
