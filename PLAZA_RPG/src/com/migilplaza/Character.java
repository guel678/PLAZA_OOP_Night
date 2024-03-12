package com.migilplaza;

public class Character {
    private int health;
    private int damage;
    private int shield;

    public Character(int health, int damage, int shield) {
        this.health = health;
        this.damage = damage;
        this.shield = shield;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getShield() {
        return shield;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void receiveDamage(int damage) {
        int effectiveDamage = Math.max(0, damage - shield);
        health -= effectiveDamage;
        if (health <= 0) {
            System.out.println("Character has died");
        }
    }
}
