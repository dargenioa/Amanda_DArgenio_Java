package com.company;

import java.util.*;

public class IceCreamShop extends IceCream{
    protected String toppings;

    public IceCreamShop(String name, double price, int quantity, String toppings) {
        super(name, price, quantity);
        this.toppings = toppings;
    }

    public IceCreamShop() {
    }

    @Override
    public void addFlavors(Map<String, IceCream> menu, String name, double price, int quantity) {
        IceCream icecream = new IceCream(name, price, quantity);
        menu.put(icecream.getName(), icecream);
        System.out.println("Here is your updated menu " + menu);

    }

    public void addToppings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What toppings would you like?");
        setToppings(scanner.nextLine());
        System.out.println("You've added " + this.toppings + " to your order.");

    }

    @Override
    public double customerOrder(Map<String, IceCream> order) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        System.out.println("What flavor would you like?");
        setName(scanner.nextLine());
        System.out.println("How many would you like?");
        setQuantity(scanner.nextInt());
        addToppings();

        Set<Map.Entry<String, IceCream>> orderComplete = order.entrySet();
        for(Map.Entry<String, IceCream> selected : orderComplete) {
            if(selected.getKey().equals(this.name)) {
                total += selected.getValue().price * this.quantity;
                System.out.println("Thank you for your order of " + this.name + "." +
                        " Your total is " + total);
              }
        }
        return total;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        IceCreamShop that = (IceCreamShop) o;
        return Objects.equals(toppings, that.toppings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), toppings);
    }

    @Override
    public String toString() {
        return "IceCreamShop{" +
                "toppings='" + toppings + '\'' +
                '}';
    }
}
