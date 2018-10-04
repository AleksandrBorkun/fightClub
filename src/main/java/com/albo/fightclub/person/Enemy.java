package com.albo.fightclub.person;

public class Enemy extends AbstractPerson {

    public Enemy(String name) {
        this(name, 1);
    }

    public Enemy(String name, int lvl) {
        super(name);
        this.lvl = lvl;
        renumerateHealth();
    }

    @Override
    public int getKickPower() {
        return lvl*3;
    }

    @Override
    public void renumerateHealth() {//10*1+0
        this.setHealthPoint(10*lvl + (int)(0.3*lvl));

    }
}
