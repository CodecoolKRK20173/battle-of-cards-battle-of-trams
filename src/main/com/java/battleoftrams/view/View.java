package main.com.java.battleoftrams.view;

import java.util.List;

import main.com.java.battleoftrams.model.Player;

//    Name1 (15)       Name2 (15)       Name3 (15)       Name4 (15) 
// ***************  ***************  ***************  ***************
// * Line   24   *  * Line   10   *  * Line   19   *  * Line   08   *
// ***************  ***************  ***************  ***************
// * Time   40   *  * Time   60   *  * Time   45   *  * Time   75   *
// * Żule   05   *  * Żule   12   *  * Żule   07   *  * Żule   09   *
// * MRF    34   *  * MRF    34   *  * MRF    34   *  * MRF    34   *
// * Kanary 12   *  * Kanary 08   *  * Kanary 12   *  * Kanary 12   *
// ***************  ***************  ***************  ***************

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
            status += String.format("%s %5s %s %2d %s %4s ", 
            whiteSpace, listOfPlayers.get(i).getName(), 
            leftBracket, listOfPlayers.get(i).getListSize(), 
            rightBracket, whiteSpace);
        }
        System.out.println(status);
    }

    public void printCards(List<Player> listOfPlayers){
        StringBuilder table = StringBuilder();
        table.append(cardBorders()).append("\n");
        table.append(border).append(" ").append(listOfPlayers.get(0).getClass().toString()).append("  ").append(border).append(" ");
        
    }

    private String cardBorders(){
        return String.format("%15s   %15s   %15s    %15s", border, border, border, border);
    }
}