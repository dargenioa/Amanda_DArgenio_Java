package com.company;

import java.util.HashMap;
import java.util.Map;

public class IceCreamShopApplication {

    public static void main(String[] args) {
        IceCreamShop iceCreamShop = new IceCreamShop();
        IceCreamFactory iceCreamFactory = new IceCreamFactory();

        Map<String, IceCream> menu = new HashMap<>();
        menu.put("Strawberry", new IceCream("Strawberry", 2.50, 20));
        menu.put("Vanilla", new IceCream("Vanilla", 2.50, 30));
        menu.put("Chocolate", new IceCream("Chocolate", 2.50, 20));

        Map<String, IceCream> inventory = new HashMap<>();
        inventory.put("Strawberry", new IceCream("Strawberry", 2.50, 20));
        inventory.put("Vanilla", new IceCream("Vanilla", 2.50, 30));
        inventory.put("Chocolate", new IceCream("Chocolate", 2.50, 20));

        iceCreamShop.customerOrder(menu);
        iceCreamShop.addFlavors(menu, "Chocolate Chip", 5.00, 10);


        iceCreamFactory.customerOrder(inventory);
        iceCreamFactory.addFlavors(inventory,"Chocolate Chip Cookie Dough", 5.00, 10 );
        iceCreamFactory.makeNewIceCream("Chocolate Swirl", 10, true);

    }
}
