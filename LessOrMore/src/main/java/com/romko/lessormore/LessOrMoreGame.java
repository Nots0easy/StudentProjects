package com.romko.lessormore;

//import java.util.concurrent.*;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Romko on 17.04.2017.
 */
public class LessOrMoreGame {
    static final String INVALID_INPUT_NUMBER = "Number should be in range: ";
    static final String INVALID_MAX_INPUT = "Max range limit should be more then min";
    private int _rangeMax = 100;
    private int _rangeMin = 0;
    private int _numberForGuess;
    private ArrayList<Integer> _assumptionNumbers = new ArrayList<Integer>();

    public LessOrMoreGame() {
        _numberForGuess = rand();
    }

    public LessOrMoreGame(int _rangeMax) {
        if (_rangeMax < this._rangeMin){
            throw  new IllegalArgumentException(LessOrMoreGame.INVALID_MAX_INPUT);
        }
        this._rangeMax = _rangeMax;
        _numberForGuess = rand();
    }

    public LessOrMoreGame(int _rangeMin, int _rangeMax) {
        if (_rangeMax < _rangeMin){
            int temp = _rangeMax;
            _rangeMax = _rangeMin;
            _rangeMin = temp;
            //throw  new IllegalArgumentException(LessOrMoreGame.INVALID_MAX_INPUT);
        }
        this._rangeMax = _rangeMax;
        this._rangeMin = _rangeMin;
        _numberForGuess = rand();
    }

    public int get_rangeMax() {
        return _rangeMax;
    }

    public int get_rangeMin() {
        return _rangeMin;
    }

    public ArrayList<Integer> get_assumptionNumbers() {
        return _assumptionNumbers;
    }

    public int rand(int randMin, int randMax) {
        if (randMax < randMin) {
            int temp = randMax;
            randMax = randMin;
            randMin = temp;
        }
        Random random = new Random();
        return random.nextInt((randMax - randMin) + 1) + randMin;
    }

    public int rand(int randMax) {
        if (randMax < _rangeMin) {
            throw new IllegalArgumentException(LessOrMoreGame.INVALID_MAX_INPUT);
        }
        Random random = new Random();
        return random.nextInt((randMax - _rangeMin) + 1) + _rangeMin;
    }

    public int rand(){
        Random random = new Random();
        return random.nextInt((_rangeMax - _rangeMin) + 1) + _rangeMin;
    }

    public CompareResult guess(int number) throws IllegalArgumentException{
        CompareResult guessResult;
        if ((number < _rangeMin) || (number > _rangeMax)){
            throw  new IllegalArgumentException(LessOrMoreGame.INVALID_INPUT_NUMBER +
                    "[ " + _rangeMin + ", " + _rangeMax + " ]");
        }
        _assumptionNumbers.add(number);
        if (number < _numberForGuess){
            _rangeMin = number + 1;
            return CompareResult.GREATER;
        } else if (number > _numberForGuess){
            _rangeMax = number - 1;
            return CompareResult.SMALLER;
        } else {
            return CompareResult.EQUAL;
        }
    }
}
