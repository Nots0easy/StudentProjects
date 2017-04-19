package com.romko.lessormore;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());

        //Bot playing
        controller.processBot();

        //User playing
        controller.processUser();
    }
}
