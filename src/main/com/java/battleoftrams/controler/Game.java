package main.com.java.battleoftrams.controler;

import java.util.LinkedList;

import main.com.java.battleoftrams.model.Computer;
import main.com.java.battleoftrams.model.Human;
import main.com.java.battleoftrams.model.Player;

public class Game{

    private LinkedList<Player> playersList;

    public LinkedList getPlayersList() {
        return playersList;
    }

    public void setPlayersList(LinkedList playersList) {
        this.playersList = playersList;
    }

    public int getNumberOfPlayers(){
        return playersList.size();
    }

    public void createPlayers(int numberOfHumanPlayers){
        for(int i = 0; i < numberOfHumanPlayers; i++){ 
            playersList.add(new Human());
        }

        for(int i = 0; i < 4-numberOfHumanPlayers; i++){
            playersList.add(new Computer());
        }
    }

    public Player getFirstRanomPlayer(){
        Random rand = new Random();
        int randomIndex = rand.nextInt(4);
        Player randomPlayer = playersList.get(randomIndex);
        randomPlayer.setIsFirst(true);
        return randomPlayer;
    }


    
}