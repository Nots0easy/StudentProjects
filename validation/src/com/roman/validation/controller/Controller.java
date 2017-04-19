package com.roman.validation.controller;

import com.roman.validation.model.Model;
import com.roman.validation.view.View;

import java.util.Scanner;


/**
 * Created by Roman Boiko1 on 16.04.2016.
 */
public class Controller {

    private Model _model;
    private View _view;

    public Controller(Model model, View view) {
        _model = model;
        _view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);
        String inputLine;

        while (!_model.isProcessEnded()) {
            try {
                if (_model.getHelloWorld() == null) {
                    _view.printMessage(View.INPUT_HELLO);
                } else {
                    _view.printMessage(View.INPUT_WORLD);
                }
                inputLine = sc.next();
                _model.setHelloWorld(inputLine);
            } catch (IllegalArgumentException ex) {
                _view.printMessage(View.INVALID_ARGUMENT);
            }
        }

        _view.printMessage(View.RESULT + _model.getHelloWorld());
    }

}
