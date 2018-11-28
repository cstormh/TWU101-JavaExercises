package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster {
    private int hitpoint = 20;
    private String name = "Orc";

    @Override
    public void takeDamage(int amount) {

        System.out.println("Attack for " + amount + " damage.");

        int damage = amount;

        System.out.println("Doing damage " + damage + " to monster.");

        if (damage <= hitpoint) {
            hitpoint = hitpoint - damage;
        }
        else {
            hitpoint = 0;
        }
    }

    @Override
    public void reportStatus() {
        System.out.println("Monster name is: " + name);
        System.out.println("Monster hitpoint is: " + hitpoint);
    }
}
