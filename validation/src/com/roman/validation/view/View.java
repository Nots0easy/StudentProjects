package com.roman.validation.view;

/**
 * Created by Roman Boiko1 on 16.04.2016.
 */
public class View {
    // Text's constants
   // public static final String INPUT_HELLO = "Input 'Hello'";
    //public static final String INPUT_WORLD = "Input 'world!'";
   // public static final String INVALID_ARGUMENT = "You input invalid value! ";
  //  public static final String RESULT = "Process completed. Result: ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printStringInput(String message) {
        print("SMTH" , message);
    }

    public void print(String... messages){
        StringBuilder builder = new StringBuilder();
        for (String str : messages) {
            builder.append(str);
        }
        System.out.println(builder.toString());
    }

    public void printWrongStringInput(String message) {
        print("Fuck wrong input", message);
    }
}
