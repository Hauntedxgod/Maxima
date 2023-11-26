package Lesson_13.Homework_13.Products;

import java.util.Comparator;
import java.util.HashMap;

public class Products {
    HashMap<String, String> prod = new HashMap();

    public void addProd(String name, String division) {
        if (prod.containsKey(name)) {
        } else {
            prod.put(name, division);
            System.out.println(name + " - " +  division);
        }
    }
}

