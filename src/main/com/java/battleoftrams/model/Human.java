package main.com.java.battleoftrams.model;

import java.util.Scanner;

import main.com.java.battleoftrams.controler.Round;
import main.com.java.battleoftrams.view.View;

public class Human extends Player {

    public Human(String name) {
        super(name);
    }

    @Override
    public String selectCharacteristic(Scanner scanner) {
        View view = new View();
        view.printQuestionStatsToCompare();
        return scanner.next();
    }

}