package main.com.java.battleoftrams.controler;

import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedList;
import java.util.Scanner;

import main.com.java.battleoftrams.model.Player;
import main.com.java.battleoftrams.model.Card;
import main.com.java.battleoftrams.view.View;

public class Round {
    private View view;
    private LinkedList<Player> playersList;
    private Scanner sc;
    public static String selectedCharacteristic;

    public Round(LinkedList<Player> playersList, Scanner sc, View view) {
        this.view = view;
        this.playersList = playersList;
        this.sc = sc;
    }

    public boolean checkForLooser() {
        boolean flag = false;
        for (Player player : playersList) {
            if (player.getPlayerDeckSize() == 0) {
                return true;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    public Player getFirstPlayer() {
        Player firstPLayer = null;

        for (Player player : playersList) {
            if (player.getIsFirst()) {
                firstPLayer = player;
            } 
        }
        return firstPLayer;
    }

    public String getCharacteristicFromPlayer() {
        view.printQuestionStatsToCompare();
        return sc.next();
    }

    private TreeMap<Card, Player> getFirstCards() {
        Map<Card, Player> cards = new HashMap<>();
        for (Player player : playersList) {
            cards.put(player.getPlayerDeck().getLast(), player);
        }
        TreeMap<Card, Player> firstCards = new TreeMap<>(cards);
        return firstCards;
    }

    public Player checkTheWinner() {
        Collections.sort(playersList);
        return playersList.getLast();
    }

    public void setFirstPlayer() {
        Collections.sort(playersList);
        playersList.getFirst().setIsFirst(true);
    }

    public void startRound() {

        while(!checkForLooser()) {
            Player firstPlayer = getFirstPlayer();
            view.printMessage("Let's begin a new round:");
            view.printStatusOfPlayers(playersList);
            view.printCards(playersList, false);
            view.printMessage("And stat will be chosen by player: " 
                    + firstPlayer.getName());
            selectedCharacteristic = firstPlayer.selectCharacteristic(sc);
            view.printPlayerChoose(selectedCharacteristic);
            view.printMessage("And what do others have:");
            view.printStatusOfPlayers(playersList);
            view.printCards(playersList, true);
            
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            TreeMap<Card, Player> firstCards = getFirstCards();
            String roundWinner = firstCards.get(firstCards.lastKey()).getName();
            view.printMessage("In this round the winner is " + roundWinner + "!");

            for (Player player : playersList) {
                if (player.getName().equals(roundWinner)) {
                    player.addCardsWhenWin(playersList, player);
                    player.setIsFirst(true);
                } else {
                    player.setIsFirst(false);
                }
            }

        }
        view.printGameOver(checkTheWinner());
    }
   

}