package DesignPattern.factory;

public class Main {
    public static void main(String[] args) {
        Coffee first = CoffeeFactory.getCoffee("Latte", 3500);
        System.out.print("Here it is. you can pay ");
        System.out.println(first.getPrice());

    }
}
