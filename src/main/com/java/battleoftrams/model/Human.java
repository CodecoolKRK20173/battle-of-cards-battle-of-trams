package main.com.java.battleoftrams.model;

public class Human extends Player{

    public Human(){
        super();
    }

    @Override
    public String selectCharacteristic(){
        return selectedCharacteristic;
    }
    
}