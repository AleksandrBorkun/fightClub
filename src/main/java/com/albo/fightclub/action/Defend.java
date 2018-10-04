package com.albo.fightclub.action;

import com.albo.fightclub.person.AbstractPerson;
import com.albo.fightclub.utils.PrintUtils;
import com.albo.fightclub.utils.UserInput;

import java.util.Random;

public class Defend {

    private static final String BLOCK_CHOICE_MSG = "\nChose which part of the body you want to defend:\n1. Head\n2. Body\n3. Legs";

    public String userDefendChoice(AbstractPerson atacker) {
        PrintUtils.log(BLOCK_CHOICE_MSG);
        int choice = UserInput.getChoiceNumber();
        return defendChoice(atacker, choice);
    }

    public String botDefendChoice(AbstractPerson atacker) {
        int choise = new Random().nextInt(3) + 1;
        return defendChoice(atacker, choise);
    }

    private String defendChoice(AbstractPerson atacker, int choice) {
        atacker.clearDefenseCash();
        switch (choice) {
            case 1:
                atacker.setHeadBlocked(true);
                return "HEAD";
            case 2:
                atacker.setBodyBlocked(true);
                return "BODY";
            case 3:
                atacker.setLegsBlocked(true);
                return "LEGS";
            default:
                PrintUtils.log("That Was wrong choice! Know You will just skip you defence turn!");
                return "wait";
        }
    }
}
