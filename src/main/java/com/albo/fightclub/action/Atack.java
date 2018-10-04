package com.albo.fightclub.action;

import com.albo.fightclub.person.AbstractPerson;
import com.albo.fightclub.utils.PrintUtils;
import com.albo.fightclub.utils.UserInput;

import java.util.Random;

public class Atack {

    private static final String ATACK_CHOICE_MSG = "\nChose which part of the body you want to attack:\n1. Head\n2. Body\n3. Legs";

    public String userAtackChoice(AbstractPerson atacker){
        atacker.clearAtackCash();
        PrintUtils.log(ATACK_CHOICE_MSG);
        int choice = UserInput.getChoiceNumber();
        return atackChoice(atacker, choice);
    }

    public String botActackChoice(AbstractPerson atacker){
        atacker.clearAtackCash();
        int choice = new Random().nextInt(3) + 1;
        return atackChoice(atacker, choice);
    }

    private String atackChoice(AbstractPerson atacker, int choice){
        atacker.clearAtackCash();
        switch(choice){
            case 1:
                atacker.setHeadAtack(true);
                return "HEAD";
            case 2:
                atacker.setBodyAtack(true);
                return "BODY";
            case 3:
                atacker.setLegsAtack(true);
                return "LEGS";
            default:
                PrintUtils.log("That Was wrong choice! Know You will just skip you attack turn!");
                return "";
        }

    }

}
