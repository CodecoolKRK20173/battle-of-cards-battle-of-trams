package main.com.java.battleoftrams.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Deck {
    private LinkedList<Card> deck;
    int deckSize;

    public Deck() {
        this.deckSize = 60;
        deck = new LinkedList<Card>();
    }

    public Deck(int deckSize) {
        this.deckSize = deckSize;
    }

    public LinkedList<Card> getDeck() {
        return this.deck;
    }

    public void createDeck() {
	    int indexOfTramNo8 = 0;
	    int indexOfTramNo10 = 1;
	    int indexOfTramNo19 = 2;
	    int indexOfTramNo24 = 3;
        
        Random random = new Random();

        for (int i = 0; i < deckSize; i++) {
            int randomTramIndex = random.nextInt(Tramlines.values().length);
            int[] card_characteristics = Tramlines.values()[randomTramIndex].
                    setCharacteristics(Tramlines.values()[randomTramIndex]);
            if (randomTramIndex == indexOfTramNo8) {
                deck.add(new TramLine_8_Card(card_characteristics));
            } else if (randomTramIndex == indexOfTramNo10) {
                deck.add(new TramLine_10_Card(card_characteristics));
            } else if (randomTramIndex == indexOfTramNo19) {
                deck.add(new TramLine_19_Card(card_characteristics));
            } else if (randomTramIndex == indexOfTramNo24) {
                deck.add(new TramLine_24_Card(card_characteristics));
            }
        }
    }
    
}