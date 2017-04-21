package com.roman.validation.controller;

import com.roman.validation.view.View;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        return result.trim();
    }
    public HashSet<Group> inputGroupsWithScanner(String regex, String message){
        String result;
        //view.printStringInput(message, regex);
        HashSet<Group> groups = new HashSet<>();
        do {
            view.printStringInput(message, regex);
            String[] separatedMessage = scanner.next().split(",");
            for (String str : separatedMessage){
                if (str.matches(regex)){
                    groups.add(Group.valueOf(str));
                }
            }
        } while (groups.size() == 0);
        return groups;
    }
}
