package main.com.java.battleoftrams.model;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public abstract class Player implements Comparable<Player> {

    private String name;
    private int indexOfPlayer;
    private LinkedList<Card> playerDeck;
    private boolean isFirst;

    public Player(String name) {
        this.name = name;
        this.playerDeck = new LinkedList<Card>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndexOfPlayer() {
        return this.indexOfPlayer;
    }

    public void setIndexOfPlayer(int indexOfPlayer) {
        this.indexOfPlayer = indexOfPlayer;
    }

    public LinkedList<Card> getPlayerDeck() {
        return this.playerDeck;
    }

    public void setPlayerDeck(LinkedList<Card> playerDeck) {
        this.playerDeck = playerDeck;
    }

    public boolean getIsFirst() {
        return this.isFirst;
    }

    public void setIsFirst(boolean isFirst) {
        this.isFirst = isFirst;
    }

    public int getPlayerDeckSize() {
        return playerDeck.size();
    }

    public void addCardsWhenWin(LinkedList<Player> playersList, Player p) {

        LinkedList<Player> copiedPlayerList = new LinkedList<Player> (playersList);
        copiedPlayerList.remove(p);

        for (Player player : copiedPlayerList) {
            
            Card card = player.playerDeck.getFirst();
            p.playerDeck.add(p.playerDeck.getFirst());
            p.playerDeck.removeFirst();
            player.playerDeck.removeFirst();
            p.playerDeck.addLast(card);
                  
            
        }

    }

    @Override
    public int compareTo(Player two) {
        return this.getPlayerDeckSize() - two.getPlayerDeckSize();
    }

    public abstract String selectCharacteristic(Scanner scanner);

}