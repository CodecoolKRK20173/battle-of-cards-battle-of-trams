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

    public abstract String getCardType();

    public int getTravelTime() {
        return travelTime;
    }

    public int getZulCount() {
        return zulCount;
    }

    public int getDriverRudeness() {
        return driverRudeness;
    }

    public int getKanarCount() {
        return kanarCount;
    }

    @Override
    public int compareTo(Object object) {
        Card card = (Card) object;

        if (Round.selectedCharacteristic.equals("travelTime")) {
            return this.travelTime - card.travelTime;
        } else if (Round.selectedCharacteristic.equals("zulCount")) {
            return this.zulCount - card.zulCount;
        } else if (Round.selectedCharacteristic.equals("driverRudeness")) {
            return this.driverRudeness - card.driverRudeness;
        } else {
            return this.kanarCount - card.kanarCount;
        }
    }

}