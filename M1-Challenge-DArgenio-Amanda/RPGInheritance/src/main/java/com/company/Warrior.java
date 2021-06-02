package com.company;

import java.util.Objects;

public class Warrior extends Character {
    private int shieldStrength;

    public Warrior(String name) {
        super(name, 75, 100, 100, 50, 10);
        this.shieldStrength = 100;
    }

    public Warrior() {
    }

    public void decreaseShieldStrength(int value) {
       setShieldStrength(this.getShieldStrength() - value);
       System.out.println("Your shield strength has decreased by " + value + ".  It is now " + this.getShieldStrength());

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

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Warrior warrior = (Warrior) o;
        return shieldStrength == warrior.shieldStrength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), shieldStrength);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "shieldStrength=" + shieldStrength +
                '}';
    }
}
