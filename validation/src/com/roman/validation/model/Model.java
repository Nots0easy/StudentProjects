package com.roman.validation.model;

import com.roman.validation.controller.Record;
import com.sun.javaws.exceptions.InvalidArgumentException;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by Roman Boiko1 on 16.04.2016.
 */
public class Model {
    private ArrayList<Record> notebook;

    public Model() {
        notebook = new ArrayList<Record>();
    }

    public void add(Record record){
        if (record == null){
            throw new NullPointerException();
        }
        notebook.add(record);
    }
}
