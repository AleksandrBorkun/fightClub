package com.albo.fightclub.utils;

import java.util.Scanner;

public class UserInput {

    private static Scanner in = new Scanner(System.in);

    public static int getChoiceNumber(){
        try{
            return in.nextInt();
        }finally {
            PrintUtils.clearConsole();
        }
    }

    public static String getString(){
        return in.next();
    }

    public static void close() {
        in.close();
        in = null;
    }
}
