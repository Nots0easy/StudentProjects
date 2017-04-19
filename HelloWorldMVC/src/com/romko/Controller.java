package com.roman.validation.controller;

import java.util.Scanner;


/**
 * Created by Roman Boiko1 on 16.04.2016.
 */
public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);
        String inputLine;

        while (!model.isProcessEnded()) {
            try {
                if (model.getHelloWorld() == null) {
                    view.printMessage(View.INPUT_HELLO);
                } else {
                    view.printMessage(View.INPUT_WORLD);
                }
                inputLine = sc.next();
                model.setHelloWorld(inputLine);
            } catch (IllegalArgumentException ex) {
                view.printMessage(View.INVALID_ARGUMENT);
            }
        }

        view.printMessage(View.RESULT + model.getHelloWorld());
    }

}
