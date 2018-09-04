package main.com.java.battleoftrams.view;

import java.util.List;

import main.com.java.battleoftrams.model.Player;

public class View{
    private String whiteSpace = " ";
    private String border = "*";
    private String leftBracket = "(";
    private String rightBracket = ")";
    private int numberOfPlayers = 4;

    public void printMenu(){
        System.out.println("Menu:\n\t 1. Play\n\t 2. How to play\n\t 3. Quit");
    }

    public void printStatus(List<Player> listOfPlayers){
        String status = "";
        for (int i = 0; i < numberOfPlayers; i++){
            status.format("%10s %10s %s %2d %s %10s ", 
            whiteSpace, listOfPlayers.get(i).getName(), 
            leftBracket, listOfPlayers.get(i).getListSize(), 
            rightBracket, whiteSpace);
        }
        System.out.println(status);
    }
}