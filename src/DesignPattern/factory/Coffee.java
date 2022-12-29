package DesignPattern.factory;

abstract class Coffee {
    public abstract int getPrice();
}

class DefalutCoffee extends Coffee {
    private int price;

    public DefalutCoffee() {
        this.price = -1;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
class Latte extends Coffee{
    private int price;

    public Latte(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
class Espresso extends Coffee{
    private int price;

    public Espresso(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

