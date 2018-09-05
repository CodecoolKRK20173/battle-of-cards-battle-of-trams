package main.com.java.battleoftrams.view;

import java.util.List;

import main.com.java.battleoftrams.model.Player;
import main.com.java.battleoftrams.model.Card;

public class View{
    private String whiteSpace = " ";
    private String border = "*";
    private String leftBracket = "(";
    private String rightBracket = ")";
    private int numberOfPlayers = 4;
    private int sizeOfCard = 15;


    public void printMenu(){
        System.out.println("Menu:\n\t 1. Play\n\t 2. How to play\n\t 3. Quit");
    }

    public void printQuestionNumberOfPlayers(){
        System.out.println("Enter number of players (max 4): ");
    }

    public void printQuestionPlayerName(){
        System.out.println("Enter your name (5 characters long)");
    }

    public void printStatusOfPlayers(List<Player> listOfPlayers){
        String status = "";
        for (int i = 0; i < numberOfPlayers; i++){
            status += String.format("%s %5s %s %2d %s %4s ", 
            whiteSpace, listOfPlayers.get(i).getName(), 
            leftBracket, listOfPlayers.get(i).getPlayerDeckSize(), 
            rightBracket, whiteSpace);
        }
        System.out.println(status);
    }


//    Name1 (15)       Name2 (15)       Name3 (15)       Name4 (15) 

// ***************  ***************  ***************  ***************
// * Line   24   *  * Line   10   *  * Line   19   *  * Line   08   *
// ***************  ***************  ***************  ***************
// * Time   40   *  * Time   60   *  * Time   45   *  * Time   75   *
// * Żule   05   *  * Żule   12   *  * Żule   07   *  * Żule   09   *
// * MRF    34   *  * MRF    34   *  * MRF    34   *  * MRF    34   *
// * Kanary 12   *  * Kanary 08   *  * Kanary 12   *  * Kanary 12   *
// ***************  ***************  ***************  ***************

    public void printCards(List<Player> listOfPlayers){
        StringBuilder table = new StringBuilder();
        String [] stats = {" Time   ", " Żule   ", " MRF    ", " Kanary "};
        table.append(cardBorders()).append("\n");
        for (int i = 0; i < numberOfPlayers; i++){
            table.append(border).append(" LINE   ")
            .append(listOfPlayers.get(i).getPlayerDeck().get(0).getCardType())
            .append("   ").append(border).append(" ");
        }
        table.append("\n");
        table.append(cardBorders());
        table.append("\n");
        for (int j = 0; j < stats.length; j++){
            for (int i = 0; i < numberOfPlayers; i++){
                if (listOfPlayers.get(i).getIsFirst() == true){
                    table.append(border).append(stats[j]).
                    append(listOfPlayers.get(i).getPlayerDeck().get(0).getTravelTime()).
                    append("   ").
                    append(border).append(" ");
                    
                } else {
                    table.append(border).append(stats[j]).
                    append(" -").append("   ").
                    append(border).append(" ");
                }
            }

        }
        
        
    }

    private String cardBorders(){
        StringBuilder borders = new StringBuilder();
        for (int j = 0; j < numberOfPlayers; j++){
            for (int i = 0; i < sizeOfCard; i++){
                borders.append("*");
            }
            borders.append("  ");
        }

        return borders.toString();
    }

}