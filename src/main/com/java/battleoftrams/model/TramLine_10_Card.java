package main.com.java.battleoftrams.model;

public class TramLine_10_Card extends Card {
    String cardType = "Line no.10";

    TramLine_10_Card(int[] characteristics) {
        super(characteristics);
    }

    public String getCardType() {
        return cardType;
    }

}