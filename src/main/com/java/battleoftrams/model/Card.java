package main.com.java.battleoftrams.model;

import main.com.java.battleoftrams.controler.Game;
import main.com.java.battleoftrams.controler.Round;

public abstract class Card implements Comparable{
    private int travelTime;
    private int zulCount;
    private int driverRudeness;
    private int kanarCount;

    Card(int[] characteristics) {
        this.travelTime = characteristics[0];
        this.zulCount = characteristics[1];
        this.driverRudeness = characteristics[2];
        this.kanarCount = characteristics[3];
    }

    abstract String getCardType();

    public int getTravelTime() {
        return travelTime;
    }

    public int getZulCunt() {
        return zulCount;
    }

    public int getDriverRudeness() {
        return driverRudeness;
    }

    public int getKanarCount() {
        return kanarCount;
    }

    @Override // Requires static method getSelectedCharasteristic in Game/Round class
    public int compareTo(Object object) {
        Card card = (Card) object;

        if (Round.getSelectedCharasteristic.equals("travelTime")) {
            return this.travelTime - card.travelTime;
        } else if (Round.getSelectedCharasteristic.equals("zulCount")) {
            return this.zulCount - card.zulCount;
        } else if (Round.getSelectedCharasteristic.equals("driverRudeness")) {
            return this.driverRudeness - card.driverRudeness;
        } else if (Round.getSelectedCharasteristic.equals("kanarCount")) {
            return this.kanarCount - card.kanarCount;
        }
    }

}