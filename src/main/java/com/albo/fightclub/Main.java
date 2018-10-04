package com.albo.fightclub;

import com.albo.fightclub.action.Figth;
import com.albo.fightclub.person.AbstractPerson;
import com.albo.fightclub.person.Enemy;
import com.albo.fightclub.person.Hero;
import com.albo.fightclub.utils.PrintUtils;
import com.albo.fightclub.utils.UserInput;

import java.util.Random;

public class Main {

    static Figth figth = new Figth();

    public static void main(String[] args) {
        PrintUtils.log("Welcome To Fight Club!\n\n\nRemember Never Tell About Fight Club!\nWhat is your name?");
        Hero hero = new Hero(UserInput.getString(), 10, 10);
        Enemy enemy = createRandomEnemy(hero);

        PrintUtils.logFormat("Very well %s\nYor first enemy is %s! Kill or prepare to die!", hero.getName(),
                enemy.getName());
        int expPoint = enemy.getHealthPoint();

        while (hero.isAlive()) {

            if (enemy.isAlive()) {
                PrintUtils.logFormat("\nEnemy Health %s. %s Health %s", enemy.getHealthPoint(), hero.getName(), hero.getHealthPoint());
                figth.goToBattle(hero, enemy);
            } else {
                hero.setExperince(hero.getExperince() + expPoint);
                PrintUtils.logFormat("Well Done! Your crash %s.\nYou have %s health. You on %s level ", enemy.getName(),
                        String.valueOf(hero.getHealthPoint()), String.valueOf(hero.getLvl()));
                enemy = createRandomEnemy(hero);
                PrintUtils.logFormat("Your new enemy is %s. Prepare for the battle!", enemy.getName());
                PrintUtils.logFormat("\nEnemy Health %s. %s Health %s", enemy.getHealthPoint(), hero.getName(), hero.getHealthPoint());
                expPoint = enemy.getHealthPoint();
                figth.goToBattle(hero, enemy);
            }
        }
        PrintUtils.logFormat(
                "SHAAAME! You die on %s lvl. And Your name %s will never stay in the history of Fight Club!",
                String.valueOf(hero.getLvl()), hero.getName());
        UserInput.close();
    }

    static Enemy createRandomEnemy(AbstractPerson hero) {

        switch (new Random().nextInt(hero.getLvl()) + 1) {// 1 - 1
            case 1:
                return new Enemy("Goblin");
            case 2:
                return new Enemy("Skeleton", 3);
            case 3:
                return new Enemy("Zombie", 4);
            case 4:
                return new Enemy("Wolf", 10);
            case 5:
                return new Enemy("Robot", 15);
            case 6:
                return new Enemy("Psycho", 20);
            default:
                return new Enemy("Assasin", 30);
        }
    }
}
