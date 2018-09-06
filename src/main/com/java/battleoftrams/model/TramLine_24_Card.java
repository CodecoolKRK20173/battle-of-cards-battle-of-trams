package main.com.java.battleoftrams.model;

public class TramLine_24_Card extends Card {
    private String cardType = "24";

    TramLine_24_Card(int[] characteristics) {
        super(characteristics);
    }

    public String getCardType() {
        return this.cardType;
    }

}