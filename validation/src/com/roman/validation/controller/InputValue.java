package com.roman.validation.controller;

import com.roman.validation.view.View;

import java.util.Scanner;

/**
 * Created by Roman_Boiko1 on 4/19/2017.
 */
public class InputValue {
    private Scanner _scanner;
    private View _view;

    public InputValue(Scanner _scanner, View _view) {
        this._scanner = _scanner;
        this._view = _view;
    }

    public String inputValueWithScanner(String regex, String message){
        String result;
        _view.printStringInput(message);
        while (!(_scanner.hasNext() && (result = _scanner.next()).matches(regex))) {
            _view.printWrongStringInput(message);
        }
        return result;
    }
}
