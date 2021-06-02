package com.company;

import java.util.*;

public class IceCreamFactory extends IceCream{
    protected boolean dairy;

    public IceCreamFactory(String name, double price, int quantity, boolean dairy) {
        super(name, price, quantity);
        this.dairy = dairy;
    }

    public IceCreamFactory() {
    }

    public void makeNewIceCream(String name, int quantity, boolean dairy) {
        setName(name);
        setQuantity(quantity);
        setDairy(dairy);
        System.out.println("You've created a new flavor called " + this.name + ".");
    }

    @Override
    public void addFlavors(Map<String, IceCream> inventory, String name,  double price, int quantity) {
        IceCream icecream = new IceCream(name, price, quantity);
        inventory.put(icecream.getName(), icecream);
        System.out.println("Here is your updated inventory " + inventory);

    }

    @Override
    public double customerOrder(Map<String, IceCream> order) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        System.out.println("What flavor would you like?");
        setName(scanner.nextLine());
        System.out.println("How many would you like?");
        setQuantity(scanner.nextInt());

        Set<Map.Entry<String, IceCream>> orderComplete = order.entrySet();
        for(Map.Entry<String, IceCream> selected : orderComplete) {
            if(selected.getKey().equals(this.name)) {
                total += selected.getValue().price * this.quantity;
                System.out.println("Thank you for your bulk order of " + this.name + "." +
                        " Your total is " + total);
            }
        }
        return total;
    }

    public boolean isDairy() {
        return dairy;
    }

    public void setDairy(boolean dairy) {
        this.dairy = dairy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        IceCreamFactory that = (IceCreamFactory) o;
        return dairy == that.dairy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dairy);
    }

    @Override
    public String toString() {
        return "IceCreamFactory{" +
                "dairy=" + dairy +
                '}';
    }
}
