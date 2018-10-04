package com.albo.fightclub.person;

public class Hero extends AbstractPerson {

    public Hero(String name, int power, int speed) {
        super(name);
        this.lvl = 1;
        this.power = power;
        this.speed = speed;
        renumerateHealth();
    }

    @Override
    public int getKickPower() {
        return 3*lvl + (int)(power*0.3);
    }

    @Override
    public void renumerateHealth() {
        this.setHealthPoint(50*lvl);

    }
}
