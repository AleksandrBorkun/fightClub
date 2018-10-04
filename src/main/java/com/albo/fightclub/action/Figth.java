package com.albo.fightclub.action;

import com.albo.fightclub.person.AbstractPerson;
import com.albo.fightclub.utils.PrintUtils;

public class Figth {

    public void goToBattle(AbstractPerson hero, AbstractPerson bot) {
        if(LevelUp.levelUpIfNeeded(hero)){
            PrintUtils.logFormat("NEW LEVEL FOR YOU %s", hero.getName().toUpperCase());
        }

        Atack atack = new Atack();
        Defend defend = new Defend();

        String heroAtack = atack.userAtackChoice(hero);
        String heroDefens = defend.userDefendChoice(hero);
        atackChoiceMessage(hero, heroAtack, heroDefens);

        String enemyAtack = atack.botActackChoice(bot);
        String enemyDefend = defend.botDefendChoice(bot);
        atackChoiceMessage(bot, enemyAtack, enemyDefend);

        if (bot.isHeadAtack()) {
            figthHelper(hero.isHeadBlocked(), bot, hero, enemyAtack);
        } else if (bot.isBodyAtack()) {
            figthHelper(hero.isBodyBlocked(), bot, hero, enemyAtack);
        } else if (bot.isLegsAtack()) {
            figthHelper(hero.isLegsBlocked(), bot, hero, enemyAtack);
        }

        if (hero.isHeadAtack()) {
            figthHelper(bot.isHeadBlocked(), hero, bot, heroAtack);
        } else if (hero.isBodyAtack()) {
            figthHelper(bot.isBodyBlocked(), hero, bot, heroAtack);
        } else if (hero.isLegsAtack()) {
            figthHelper(bot.isLegsBlocked(), hero, bot, heroAtack);
        }

        if (hero.getHealthPoint() <= 0) {
            hero.setAlive(false);
        }
        if (bot.getHealthPoint() <= 0) {
            bot.setAlive(false);
        }

    }


    private void atackChoiceMessage(AbstractPerson pers, String atack, String defend) {
        PrintUtils.logFormat("%s will atack %s and defend %s", pers.getName(), atack, defend);
    }


    private void figthHelper(boolean isBlocked, AbstractPerson atacker, AbstractPerson defender, String body) {
        if (isBlocked) {
            defenceWorkMessage(atacker, defender, body);
        } else {
            kickMsg(atacker, defender, body, atacker.getKickPower());
            defender.setHealthPoint(defender.getHealthPoint() - atacker.getKickPower());
        }
    }

    private void defenceWorkMessage(AbstractPerson atacker, AbstractPerson defender, String body) {
        PrintUtils.log(String.format("%s try to bit %s to %s but he is blocking the punch", atacker.getName(),
                defender.getName(), body));
    }

    private void kickMsg(AbstractPerson atacker, AbstractPerson defender, String body, int points) {
        PrintUtils.log(String.format("%s bit %s to %s and took %s hitpoints", atacker.getName(), defender.getName(),
                body, points));
    }


}
