package com.roman.validation.controller;

import com.roman.validation.model.Model;
import com.roman.validation.view.View;

import java.util.Scanner;


/**
 * Created by Roman Boiko1 on 16.04.2016.
 */
public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputNotebookRecord notebookRecord = new InputNotebookRecord(view, sc);
        Record record = notebookRecord.inputRecord();
        model.add(record);

       /* view.print(record.getFirstName());
        view.print(record.getSecondName());
        view.print(record.getShortName());
        view.print(record.getComment());
        view.print(record.getCreateDate().getTime().toString());
        view.print(record.getModifyDate().getTime().toString());
        view.print(record.getEmail());
        view.print(record.getHomePhoneNumber());*/
    }
}
