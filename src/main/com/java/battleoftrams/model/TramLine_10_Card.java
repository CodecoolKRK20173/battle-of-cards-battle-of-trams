package main.com.java.battleoftrams.model;

public class TramLine_10_Card extends Card {
    private String cardType = "10";

    TramLine_10_Card(int[] characteristics) {
        super(characteristics);
    }

    public String getCardType() {
        return this.cardType;
    }

}