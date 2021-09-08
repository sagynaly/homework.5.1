package com.company;

public class Hero {
  private int health;
  private int Damage;
  private String HeroAttacTapy;

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return Damage;
    }

    public String getHeroAttacTapy() {
        return HeroAttacTapy;
    }

    public Hero(int health, int damage, String heroAttacTapy) {
        this.health = health;
        Damage = damage;
        HeroAttacTapy = heroAttacTapy;


    }

}
