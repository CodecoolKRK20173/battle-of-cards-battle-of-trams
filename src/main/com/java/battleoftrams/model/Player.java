package main.com.java.battleoftrams.model;

import java.util.LinkedList;
import java.util.List;

import javax.smartcardio.Card;

public abstract class Player implements Comparable<Player>{

    private String name;
    private int indexOfPlayer;
    private LinkedList<Card> playerDeck;
    private boolean isFirst;

    public Player(){
        this.name = name;
        this.indexOfPlayer = indexOfPlayer;
        this.playerDeck = playerDeck;
        this.isFirst = isFirst;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getIndexOfPlayer(){
        return this.indexOfPlayer;
    }

    public void setIndexOfPlayer(int indexOfPlayer){
        this.indexOfPlayer = indexOfPlayer;
    }

    public List getPlayerDeck(){
        return this.playerDeck;
    }

    public void setPlayerDeck(List playerDeck){
        this.playerDeck = playerDeck;
    }

    public boolean getIsFirst(){
        return this.isFirst;
    }

    public void setIsFirst(boolean isFirst){
        this.isFirst = isFirst;
    }

    public int getPlayerDeckSize(){
        return playerDeck.size();
    }

    public void addCardsWhenWin(){
        // needs improvement
        Card card = playerDeck.getLast();
        playerDeck.removeLast();
        playerDeck.addLast(card);

    }

    @Override
    public int compareTo(Player two){
        return this.getPlayerDeckSize() - two.getPlayerDeckSize();
    }

    public abstract String selectCharacteristic();
    
}