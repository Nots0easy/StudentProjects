package com.romko;

import com.sun.javaws.exceptions.InvalidArgumentException;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by Roman Boiko1 on 16.04.2016.
 */
public class Model {
    private String _helloWorld;
    private boolean _processEnded;

    public boolean isProcessEnded() {
        return _processEnded;
    }

    public String getHelloWorld() {
        return _helloWorld;
    }

    public void setHelloWorld(String string) throws IllegalArgumentException {
        if (string.equals("Hello")){
            _helloWorld = string;
        }
        else if ((string.equals("world!")) && (helloWorld.equals("Hello"))){
            _helloWorld += " " + string;
            _processEnded = true;
        }
        else {
            throw new IllegalArgumentException();
        }
    }
}
