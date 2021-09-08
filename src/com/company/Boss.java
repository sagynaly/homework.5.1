package com.company;

public class Boss {
    private int health;
    private int Damage;
    private String ChooseBossDefence;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public String getChooseBossDefence() {
        return ChooseBossDefence;
    }

    public void setChooseBossDefence(String chooseBossDefence) {
        ChooseBossDefence = chooseBossDefence;
    }
}
