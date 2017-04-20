package com.roman.validation.controller;

import com.roman.validation.view.View;

import java.util.Scanner;

/**
 * Created by Roman_Boiko1 on 4/19/2017.
 */
public class InputValue {
    private Scanner scanner;
    private View view;

    public InputValue(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public String inputValueWithScanner(String regex, String message){
        String result;
        view.printStringInput(message, regex);
        while (!(scanner.hasNext() && (result = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message, regex);
        }
        return result;
    }
}
