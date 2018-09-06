package main.com.java.battleoftrams.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

import main.com.java.battleoftrams.model.*;

public class View{
    private final String LOGOLINK = "resources/logo.txt";
    private final String HOWTOLINK = "resources/howto.txt";
    private final String CONGRATSLINK = "resources/congrats.txt";
    private String whiteSpace = " ";
    private String border = "*";
    private String leftBracket = "(";
    private String rightBracket = ")";
    private int numberOfPlayers = 4;
    private int sizeOfCard = 15;


    public void printMenu(){
        System.out.println("Menu:\n\t 1. Play\n\t 2. How to play\n\t 3. Don't Play");
    }

    public void printQuestionNumberOfPlayers(){
        System.out.println("Enter number of human players (max 4): ");
    }

    public void printQuestionPlayerName(){
        System.out.print("Enter name (5 characters long) for player ");
    }

    public void printQuestionStatsToCompare(){
        System.out.println("Enter statistic to compare (time, zule, driver or kanary):");
    }

    public void printPlayerChoose(String choose) {
        System.out.println("Player have chosen option " + choose + "\n");
    }

    public void printMessage(String message) {
        System.out.println("\n" + message + "\n");
    }

    public void printMessageWithNewLine(String message) {
        System.out.print(message + "\n");
    }

    public void printStatusOfPlayers(List<Player> listOfPlayers){
        String status = "";
        for (int i = 0; i < numberOfPlayers; i++){
            status += String.format("%s %5s %s%2d%s %4s ", 
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

    public void printCards(LinkedList<Player> listOfPlayers, boolean showOpponentCards){
        StringBuilder table = new StringBuilder();
        String [] stats = {" Time   ", " Żule   ", " MRF    ", " Kanary "};
        table.append(cardBorders()).append("\n");
        for (int i = 0; i < numberOfPlayers; i++){
            table.append(border).append(" LINE   ")
            .append(listOfPlayers.get(i).getPlayerDeck().get(0).getCardType())
            .append("   ").append(border).append("  ");
        }
        table.append("\n");
        table.append(cardBorders());
        table.append("\n");
        
        if (!showOpponentCards) {
            //for (int j = 0; j < stats.length; j++){
                int statsIndex = 0;
                for (int i = 0; i < numberOfPlayers; i++){
                    if (listOfPlayers.get(i).getIsFirst() == true){
                        int time = listOfPlayers.get(i).getPlayerDeck().get(0).getTravelTime();
                        int timeLength = String.valueOf(time).length();
                        table.append(border).append(stats[statsIndex]);
                        if (timeLength == 1) {
                            table.append(time + " ");
                        } else if (timeLength == 2) {
                            table.append(time);
                        }
                        table.append("   ").append(border).append("  ");
                        
                    } else {
                        table.append(border).append(stats[statsIndex]).
                        append(" -").append("   ").
                        append(border).append("  ");
                    }
                }
                table.append("\n");
                statsIndex++;
                for (int i = 0; i < numberOfPlayers; i++){
                    if (listOfPlayers.get(i).getIsFirst() == true){
                        int zule = listOfPlayers.get(i).getPlayerDeck().get(0).getZulCount();
                        int zuleLength = String.valueOf(zule).length();
                        table.append(border).append(stats[statsIndex]);
                        if (zuleLength == 1) {
                            table.append(zule + " ");
                        } else if (zuleLength == 2) {
                            table.append(zule);
                        }
                        table.append("   ").append(border).append("  ");
                        
                    } else {
                        table.append(border).append(stats[statsIndex]).
                        append(" -").append("   ").
                        append(border).append("  ");
                    }
                }
                table.append("\n");
                statsIndex++;
                for (int i = 0; i < numberOfPlayers; i++){
                    if (listOfPlayers.get(i).getIsFirst() == true){
                        int rudeness = listOfPlayers.get(i).getPlayerDeck().get(0).getDriverRudeness();
                        int rudenessLength = String.valueOf(rudeness).length();
                        table.append(border).append(stats[statsIndex]);
                        if (rudenessLength == 1) {
                            table.append(rudeness + " ");
                        } else if (rudenessLength == 2) {
                            table.append(rudeness);
                        }
                        table.append("   ").append(border).append("  ");
                        
                    } else {
                        table.append(border).append(stats[statsIndex]).
                        append(" -").append("   ").
                        append(border).append("  ");
                    }
                }
                table.append("\n");
                statsIndex++;
                for (int i = 0; i < numberOfPlayers; i++){
                    if (listOfPlayers.get(i).getIsFirst() == true){
                        int kanar = listOfPlayers.get(i).getPlayerDeck().get(0).getKanarCount();
                        int kanarLength = String.valueOf(kanar).length();
                        table.append(border).append(stats[statsIndex]);
                        if (kanarLength == 1) {
                            table.append(kanar + " ");
                        } else if (kanarLength == 2) {
                            table.append(kanar);
                        }
                        table.append("   ").append(border).append("  ");
                        
                    } else {
                        table.append(border).append(stats[statsIndex]).
                        append(" -").append("   ").
                        append(border).append("  ");
                    }
                }
                table.append("\n" + cardBorders());
                table.append("\n");
            //}
        } else {
            // for (int j = 0; j < stats.length; j++){
                int statsIndex = 0;
                for (int i = 0; i < numberOfPlayers; i++){
                    
                    int time = listOfPlayers.get(i).getPlayerDeck().get(0).getTravelTime();
                    int timeLength = String.valueOf(time).length();
                    table.append(border).append(stats[statsIndex]);
                    if (timeLength == 1) {
                        table.append(time + " ");
                    } else if (timeLength == 2) {
                        table.append(time);
                    }
                    table.append("   ").append(border).append("  ");
                        
                    
                }
                table.append("\n");
                statsIndex++;

                for (int i = 0; i < numberOfPlayers; i++){
                    
                    int zule = listOfPlayers.get(i).getPlayerDeck().get(0).getZulCount();
                    int zuleLength = String.valueOf(zule).length();
                    table.append(border).append(stats[statsIndex]);
                    if (zuleLength == 1) {
                        table.append(zule + " ");
                    } else if (zuleLength == 2) {
                        table.append(zule);
                    }
                    table.append("   ").append(border).append("  ");
                        
               
                }
                table.append("\n");
                statsIndex++;

                for (int i = 0; i < numberOfPlayers; i++){
                    
                    int rudeness = listOfPlayers.get(i).getPlayerDeck().get(0).getDriverRudeness();
                    int rudenessLength = String.valueOf(rudeness).length();
                    table.append(border).append(stats[statsIndex]);
                    if (rudenessLength == 1) {
                        table.append(rudeness + " ");
                    } else if (rudenessLength == 2) {
                        table.append(rudeness);
                    }
                    table.append("   ").append(border).append("  ");
              
                }
                table.append("\n");
                statsIndex++;

                for (int i = 0; i < numberOfPlayers; i++){
                   
                    int kanar = listOfPlayers.get(i).getPlayerDeck().get(0).getKanarCount();
                    int kanarLength = String.valueOf(kanar).length();
                    table.append(border).append(stats[statsIndex]);
                    if (kanarLength == 1) {
                        table.append(kanar + " ");
                    } else if (kanarLength == 2) {
                        table.append(kanar);
                    }
                    table.append("   ").append(border).append("  ");
              
                }
                table.append("\n" + cardBorders());
                table.append("\n");
                
            // }

        }
        System.out.println(table);
        
    }
    
    public void printErrorMessage() {}

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

    public void printLogo() {
        System.out.println(getStringFromFile(LOGOLINK));
    }

    public void printHowTo() {
        System.out.println(getStringFromFile(HOWTOLINK));
    }
    
    public void printGameOver(Player winner) {
        String congratulations = getStringFromFile(CONGRATSLINK);
        StringBuilder winMessage = new StringBuilder();    
    
        winMessage.append(cardBorders()).append("\n\n");
        winMessage.append(congratulations).append("\n\n");       
        winMessage.append("And the winner is: " + winner.getName() + "\n");
        winMessage.append("With total of " + winner.getPlayerDeckSize() + " cards in hand!\n");      
        winMessage.append("\n\n").append(cardBorders()).append("\n\n"); 
        
        System.out.println(winMessage.toString());
    }
    
    public String getStringFromFile(String fileName) {
        StringBuilder content = new StringBuilder();
    
            try {
                BufferedReader buffReader = new BufferedReader(new FileReader(fileName));
    
                String line;
                while ((line = buffReader.readLine()) != null) {
                content.append(line + "\n");
                }
                buffReader.close();         
            } catch(IOException exception) {
                exception.printStackTrace();
            }
            return content.toString();
        
    
    }

}