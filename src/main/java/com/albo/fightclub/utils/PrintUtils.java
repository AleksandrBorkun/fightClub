package com.albo.fightclub.utils;

public class PrintUtils {

    public static void log(String message){
        System.out.println(message);
        //file = new File("GameLog.txt");
        //file.write(message);
    }

    public static void logFormat(String message, Object ... messages){
        System.out.println(String.format(message, messages));
        //file = new File("GameLog.txt");
        //file.write(String.format(message, messages));

        //write line to file java
    }


    public static void clearConsole() {
        for (int i = 0; i < 50; ++i) System.out.println();
    }
}
