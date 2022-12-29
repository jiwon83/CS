package DesignPattern.factory;

public class CoffeeFactory {

    public static Coffee getCoffee(String type, int price) {
        //divide sort of coffee
        if (type.equalsIgnoreCase("latte")) return new Latte(price);
        else if (type.equalsIgnoreCase("espresso")) return new Espresso(price);
        else return new DefalutCoffee();
    }
}
