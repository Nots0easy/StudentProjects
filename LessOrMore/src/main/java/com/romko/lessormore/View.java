package com.romko.lessormore;

import java.util.ArrayList;

/**
 * Created by Roman Boiko1 on 16.04.2016.
 */
public class View {
    // Text's constants
    public static final String INPUT_GUESS = "Guess number: ";
    public static final String RANGE = "Number you need to guess places in range: ";
    public static final String INVALID_ARGUMENT = "You input invalid value! ";
    public static final String INPUT_NOT_NUMBER = "You input wrong value! You have to input the number.";
    public static final String WIN = "Congratulation. You guessed number we think of.";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printRange(int rangeMin, int rangeMax){
        System.out.println(RANGE + "[ " + rangeMin + ", " + rangeMax + " ]");
    }

    public void printCompareResult(CompareResult compareResult){
        System.out.println("The conceived number is " + compareResult + " than that");
    }

    public void printAllGuesses(ArrayList<Integer> guesses){
        System.out.println("See your assumptions chronology: ");
        int count = 1;
        for (Integer number : guesses) {
            System.out.println(count + ") " + number);
            count++;
        }
    }

    public void printEmptyLine(){
        System.out.println();
    }

}
