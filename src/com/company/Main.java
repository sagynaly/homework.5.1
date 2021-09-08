package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss();
    boss.setChooseBossDefence("PYISIKAL");
    boss.setDamage(500);
    boss.setHealth(200);
        System.out.println(boss.getHealth() + "HP," + boss.getDamage() + "AT," + boss.getChooseBossDefence());

        for (int i = 0; i < craetHeroes().length; i++) {
            System.out.println(craetHeroes()[i].getHealth() +"," + craetHeroes()[i].getDamage() + "," + craetHeroes() [i].getHeroAttacTapy());
        }
    }

    private static Hero[] craetHeroes() {
        Hero heroPYISIKAL = new Hero(300, 40, "PYISIKAL");
        Hero heroMagic = new Hero(200, 45, "Magic");
        Hero heroSagyn = new Hero(340, 23, "Sagyn");

        Hero [] superhero = {heroPYISIKAL,heroMagic,heroSagyn };
                return superhero;

    }

}
