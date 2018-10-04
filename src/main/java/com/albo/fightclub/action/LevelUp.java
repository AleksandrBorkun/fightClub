package com.albo.fightclub.action;

import com.albo.fightclub.person.AbstractPerson;

public class LevelUp {


    private static int abstractPointToNextLevel = 10;
    private static int difficult = 5;

    public static boolean levelUpIfNeeded(AbstractPerson hero) {//10*1*5 = 50
        if (hero.getExperince() >= (abstractPointToNextLevel * hero.getLvl() * difficult) && hero.getLvl() <= 10) {
            hero.setLvl(hero.getLvl() + 1);
            hero.setExperince(0);
            hero.renumerateHealth();
            hero.setPower(hero.getPower() + 1);
            hero.setSpeed(hero.getSpeed() + 1);
            return true;
        }
        return false;
    }

}
