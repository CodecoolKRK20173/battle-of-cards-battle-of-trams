package main.com.java.battleoftrams.model;

public class TramLine_8_Card extends Card {
    String cardType = "08";

    TramLine_8_Card(int[] characteristics) {
        super(characteristics);
    }

    public String getCardType() {
        return cardType;
    }

}