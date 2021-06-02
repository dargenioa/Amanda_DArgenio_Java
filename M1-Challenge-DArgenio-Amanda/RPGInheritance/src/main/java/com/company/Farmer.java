package com.company;

public class Farmer extends Character {

    public Farmer(String name) {
        super(name, 75, 100, 75, 10, 1);
    }

    public Farmer() {
    }

    public void plow() {
       System.out.println(this.getName() + " is plowing.");
       setStrength(this.getStrength() - 2);
       System.out.println("Your new strength is  " + this.getStrength() + " points");
    }

    public void harvest() {
        System.out.println(this.getName() + " is harvesting.");
        setStrength(this.getStrength() - 2);
        System.out.println("Your new strength is  " + this.getStrength() + " points");
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " is running.");
        setStamina(this.getStamina() - 5);
        System.out.println("Your new strength is  " + this.getStrength() + " points");
    }

    @Override
    public void attack() {
        System.out.println(this.getName() + " is using " + this.getAttackPower() + " points to attack.");
        setAttackPower(this.getAttackPower() - 5);
        System.out.println("Your new attack power is " + this.getAttackPower() + " points");
    }

    @Override
    public void heal() {
        System.out.println(this.getName() + " is healing...");
        setHealth(100);
        System.out.println("You are now back to your default health of " + this.getHealth());
    }

    @Override
    public void decreaseHealth(int value) {
        setHealth(this.getHealth() - value);
        System.out.println("Your health has decreased by " + value + ".  It is now " + this.getHealth());
    }

    @Override
    public void decreaseStamina(int value) {
        setStamina(this.getStamina() - value);
        System.out.println("Your stamina has decreased by " + value + ".  It is now " + this.getStamina());

    }

    @Override
    public void increaseStamina(int value) {
        setStamina(this.getStamina() + value);
        System.out.println("Your stamina has increased by " + value + ".  It is now " + this.getStamina());
    }

    @Override
    public String toString() {
        return "Farmer{}";
    }
}
