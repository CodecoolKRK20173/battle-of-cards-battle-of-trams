package main.com.java.battleoftrams.model;

import main.com.java.battleoftrams.controler.Round;

public class Human extends Player {

    public Human(String name) {
        super(name);
    }

    @Override
    public String selectCharacteristic() {
        return Round.selectedCharacteristic;
    }

}