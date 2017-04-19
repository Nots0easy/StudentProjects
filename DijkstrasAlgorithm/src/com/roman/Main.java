package com.roman;

import com.roman.controller.Controller;
import com.roman.model.*;
import com.roman.view.View;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.processUser();
    }
}
