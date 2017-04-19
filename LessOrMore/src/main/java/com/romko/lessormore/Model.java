package com.romko.lessormore;

import com.sun.javaws.exceptions.InvalidArgumentException;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by Roman Boiko1 on 16.04.2016.
 */
public class Model {
    private LessOrMoreGame _game;

    public LessOrMoreGame get_game() {
        return _game;
    }

    public void startGame(int rangeMin, int rangeMax) {
        _game = new LessOrMoreGame(rangeMin, rangeMax);
    }
}
