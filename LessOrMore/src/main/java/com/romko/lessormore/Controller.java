package com.romko.lessormore;

import java.util.Scanner;


/**
 * Created by Roman Boiko1 on 16.04.2016.
 */
public class Controller {

    private Model model;
    private View view;
    private final int rangeMin = 0;
    private final int rangeMax = 100;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    public void processBot(){
        CompareResult guessResult = null;

        try {
            model.startGame(rangeMin, rangeMax);
        } catch (IllegalArgumentException ex) {
            view.printMessage(View.INVALID_ARGUMENT + ex.getMessage());
        }

        while (guessResult != CompareResult.EQUAL) {
            try {
                view.printRange(model.get_game().get_rangeMin(), model.get_game().get_rangeMax());
                view.printMessage(View.INPUT_GUESS);
                guessResult = model.get_game().guess(autoGuess());
                if (guessResult != CompareResult.EQUAL){
                    view.printCompareResult(guessResult);
                    view.printEmptyLine();
                }
            } catch (IllegalArgumentException ex) {
                view.printMessage(View.INVALID_ARGUMENT + ex.getMessage());
                view.printEmptyLine();
            }
        }
        view.printMessage(View.WIN);
        view.printAllGuesses(model.get_game().get_assumptionNumbers());
    }

    private int autoGuess() {
        int rangeMax = model.get_game().get_rangeMax();
        int rangeMin = model.get_game().get_rangeMin();
        return rangeMin + (rangeMax - rangeMin) / 2;
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);
        String inputLine;
        CompareResult guessResult = null;

        try {
            model.startGame(rangeMin, rangeMax);
        } catch (IllegalArgumentException ex) {
            view.printMessage(View.INVALID_ARGUMENT + ex.getMessage());
        }

        while (guessResult != CompareResult.EQUAL) {
            try {
                    view.printRange(model.get_game().get_rangeMin(), model.get_game().get_rangeMax());
                    view.printMessage(View.INPUT_GUESS);
                    while (!sc.hasNextInt()){
                        view.printMessage(View.INPUT_NOT_NUMBER);
                        inputLine = sc.next();
                    }
                inputLine = sc.next();
                guessResult = model.get_game().guess(Integer.parseInt(inputLine));
                if (guessResult != CompareResult.EQUAL){
                    view.printCompareResult(guessResult);
                    view.printEmptyLine();
                }
            } catch (IllegalArgumentException ex) {
                view.printMessage(View.INVALID_ARGUMENT + ex.getMessage());
                view.printEmptyLine();
            }
        }
        view.printMessage(View.WIN);
        view.printAllGuesses(model.get_game().get_assumptionNumbers());
    }

}
