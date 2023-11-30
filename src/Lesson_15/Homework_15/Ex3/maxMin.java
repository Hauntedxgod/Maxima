package Lesson_15.Homework_15.Ex3;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class maxMin {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        int[] arr1 = new int[30];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 30; i++) {
            arr1[i] = sc.nextInt();
            arr.add(arr1[i]);
        }


        System.out.println(arr1[10]);
        System.out.println(arr1[11]);


            System.out.println(arr.stream().mapToInt(x -> x)
                    .max()
                    .orElseThrow(NoSuchFieldError::new));
    }
}







