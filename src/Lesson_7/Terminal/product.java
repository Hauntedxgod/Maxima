package Lesson_7.Terminal;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class product {
    int name;
    int price;
    int rating;

    public product(int name, int price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public int getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public static class Category{
     private  int name;
     ArrayList products;

        public Category(int name, ArrayList products) {
            this.name = name;
            this.products = new ArrayList<>();
        }

        public int getName() {
            return name;
        }

        public void setName(int name) {
            this.name = name;
        }

        public ArrayList getProducts() {
            return products;
        }

        public void setProducts(ArrayList products) {
            this.products = products;
        }
    }

    public static class Basket{
       ArrayList product;

        public Basket(ArrayList product) {
            this.product = new ArrayList<>();
        }
    }
    public static class User{
        String login;
        int password;
        private Basket basket;

        public User(String login, int password, Basket basket) {
            this.login = login;
            this.password = password;
            this.basket = basket;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public int getPassword() {
            return password;
        }

        public void setPassword(int password) {
            this.password = password;
        }

        public Basket getBasket() {
            return basket;
        }

        public void setBasket(Basket basket) {
            this.basket = basket;
        }
    }
}
