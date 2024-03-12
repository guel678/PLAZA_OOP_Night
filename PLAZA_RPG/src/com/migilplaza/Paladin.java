package com.migilplaza;

public class Paladin extends Swordsman {

    private boolean hasResurrected;

    public Paladin() {
        super();
        this.hasResurrected = false;
    }

    public boolean hasResurrected() {
        return hasResurrected;
    }

    public void setHasResurrected(boolean hasResurrected) {
        this.hasResurrected = hasResurrected;
    }

    @Override
    public void receiveDamage(int damage) {
        int effectiveDamage = Math.max(0, damage - getShield());

        if (effectiveDamage % 2 == 0) {
            effectiveDamage /= 2;
        }

        setHealth(getHealth() - effectiveDamage);

        if (getHealth() <= 0) {
            resurrect();
        }
    }

    public void resurrect() {
        if (!hasResurrected) {
            hasResurrected = true;
            setHealth(100);
        } else {
            System.out.println("Paladin has died");
        }
    }
}
