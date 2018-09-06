package main.com.java.battleoftrams.controler;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import main.com.java.battleoftrams.model.Computer;
import main.com.java.battleoftrams.model.Human;
import main.com.java.battleoftrams.model.Player;
import main.com.java.battleoftrams.view.View;

public class Game {

    private LinkedList<Player> playersList;
    private Deck deck;
    private View view;

    public Game() {
        this.deck = new Deck();
        this.view = new View();
    }

    public LinkedList getPlayersList() {
        return playersList;
    }

    public void setPlayersList(LinkedList playersList) {
        this.playersList = playersList;
    }

    public Deck getDeck() {
        return this.deck;
    }

    public View getView() {
        return this.view;
    }

    public int getNumberOfPlayers() {
        return playersList.size();
    }

    public void createPlayers(int numberOfHumanPlayers) {
        for (int i = 0; i < numberOfHumanPlayers; i++) {
            playersList.add(new Human());
        }

        for (int i = 0; i < 4 - numberOfHumanPlayers; i++) {
            playersList.add(new Computer());
        }
    }

    public Player getFirstRanomPlayer() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(4);
        Player randomPlayer = playersList.get(randomIndex);
        randomPlayer.setIsFirst(true);
        return randomPlayer;
    }

    private void dealCards() {
        int downBound = 0;
        int upperBound = 15;

        for (Player player : playersList) {
            player.setPlayerDeck(deck.getDeck().subList(downBound, upperBound));
            downBound += 15;
            upperBound += 15;
        }
    }

    private int getUserMenuInput(Scanner sc, int menuBounds) {
        boolean correctInput = false;
        int choice;
        while (!correctInput) {
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException err) {
                view.printErrorMessage();
            }

            if (choice < menuBounds && choice > 0) {
                correctInput = true;
                return choice;
            }
        }
    }

    private void play(Scanner sc) {
        view.printQuestionNumberOfPlayers();
        int numberOfHumanPlayers = getUserMenuInput(sc, 5);
        createPlayers(numberOfHumanPlayers);
        Player firstPlayer = getFirstRanomPlayer();
        dealCards();
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            view.printLogo();
            view.printMenu();
            int choice = getUserMenuInput(sc, 4);
            switch (choice) {
            case 1:
                play(sc);
                break;
            case 2:
                view.printHowToPlay();
                break;
            case 3:
                exit = true;
                break;
            }

        }
    }
}