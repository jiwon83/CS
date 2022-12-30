package DesignPattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> itemList;
    int totalCost;

    public ShoppingCart() {
        this.itemList = new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.itemList.add(item);
    }
    public void removeItem(Item item){
        this.itemList.remove(item);
    }
    public int calculateTotal(){
        int price=0;
        for (Item item : itemList){
            price += item.getPrice();
        }
        return price;
    }
    public void pay(PaymentStrategy strategy){
        int amount = calculateTotal();
        strategy.pay(amount);
    }
}
