package com.company;

public class Constable extends Character{
    private String jurisdiction;

    public Constable(String name, String jurisdiction) {
        super(name, 60, 100, 60, 20, 5);
        this.jurisdiction = jurisdiction;
    }

    public Constable() {
    }

    public void arrest() {
        System.out.println("I am Constable " + this.getName() +
                "." + "Your are under arrest in the jurisdiction of " + this.getJurisdiction());
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

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }
}
