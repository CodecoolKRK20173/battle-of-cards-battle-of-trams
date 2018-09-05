package main.com.java.battleoftrams.model;

import main.com.java.battleoftrams.controler.Round;

public class Human extends Player {

    public Human() {
        super();
    }

    @Override
    public String selectCharacteristic() {
        return Round.selectCharacteristic;
    }

}