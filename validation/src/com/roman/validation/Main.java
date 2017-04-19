package com.roman.validation;

import com.roman.validation.controller.Controller;
import com.roman.validation.model.Model;
import com.roman.validation.view.View;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.processUser();
    }
}
