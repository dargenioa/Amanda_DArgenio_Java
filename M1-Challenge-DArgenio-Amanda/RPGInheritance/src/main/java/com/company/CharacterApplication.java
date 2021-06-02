package com.company;

public class CharacterApplication {
    public static void main(String[] args) {
        Farmer farmer = new Farmer("Amanda");
        Constable constable = new Constable("Justin", "Glendale");
        Warrior warrior = new Warrior("Desi");

        farmer.plow();
        farmer.harvest();
        farmer.run();
        farmer.attack();
        farmer.heal();
        farmer.decreaseHealth(2);
        farmer.increaseStamina(5);
        farmer.decreaseStamina(2);

        constable.arrest();
        constable.run();
        constable.attack();
        constable.heal();
        constable.decreaseHealth(1);
        constable.increaseStamina(3);
        constable.decreaseStamina(1);

        warrior.decreaseShieldStrength(2);
        warrior.run();
        warrior.attack();
        warrior.heal();
        warrior.decreaseHealth(1);
        warrior.increaseStamina(3);
        warrior.decreaseStamina(1);



    }
}
