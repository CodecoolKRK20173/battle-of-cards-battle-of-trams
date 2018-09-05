package main.com.java.battleoftrams.controler;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

import main.com.java.battleoftrams.model.Player;

public class Round {

    static String selectedCharacteristic;

    public Round() {
        this.selectedCharacteristic = selectedCharacteristic;
    }

    public boolean checkForLooser(LinkedList<Player> playersList) {
        boolean flag = false;
        for (Player player : playersList) {
            if (player.getPlayerDeckSize() == 0) {
                flag = true;
            } else {
                flag = false;
            }
        }

        return flag;
    }

    public Player getFirstPlayer() {
        for (Player player : playersList) {
            if (player.getFirstPlayer == true) {
                return player;
            } else {
                return null;
            }
        }
    }

    public String getCharacteristic(Scanner scanner) {
        return scanner.next();
    }

    public Player checkTheWinner(LinkedList<Player> playersList) {
        Collections.sort(playersList);
        return playersList.getFirst();
    }

    public void setFirstPlayer(LinkedList<Player> playersList) {
        Collections.sort(playersList);
        playersList.getFirst().setIsFirst(true);
    }

}