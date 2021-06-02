package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class IceCream {
    protected String name;
    protected double price;
    protected int quantity;

    public IceCream(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public IceCream() {
    }

    public void addFlavors(Map<String, IceCream> menu, String name, double price, int quantity){

    }

    public double customerOrder(Map<String, IceCream> order){
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.price, price) == 0 && quantity == iceCream.quantity && Objects.equals(name, iceCream.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
