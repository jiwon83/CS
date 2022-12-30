package DesignPattern.strategy;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("Mango Juice", 300);
        Item item2 = new Item("Yoga Set", 100000);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.removeItem(item1);
//        System.out.println(Collections.unmodifiableList(cart.itemList));
        cart.pay(new NAVERPayStrategy("exam@naver.com","12345"));
        cart.pay(new GeneralPaymentStrategy("jiwon","1234","123","2022-12-30"));
    }
}
