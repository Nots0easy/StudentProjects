package com.roman.validation.view;

/**
 * Created by Roman Boiko1 on 16.04.2016.
 */
public class View {

    public void printStringInput(String message, String format) {
        print(message, format);
    }


    public void printWrongStringInput(String message, String format) {
        print(Messages.INPUT_WRONG_FORMAT, message, format);
    }

    public void print(String... messages){
        StringBuilder builder = new StringBuilder();
        for (String str : messages) {
            builder.append(str);
        }
        System.out.println(builder.toString());
    }
}
