package com.roman.view;

/**
 * Created by Roman Boiko1 on 17.03.2016.
 */
public class View {
    // Text's constants
    public static final String INPUT_PATH_DATE_IN_FILE = "Input PATH to data-in file = ";
    public static final String INPUT_OUTGOING_NODE = "Input outgoing node";
    public static final String INPUT_INCOMING_NODE = "Input incoming node";
    public static final String WRONG_INPUT_FORMAT= "Wrong input file format! ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String SHORTEST_WAY_VALUE = "SHORTEST WAY = ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndInt(String message, int value){
        System.out.println(message + value);
    }

}
