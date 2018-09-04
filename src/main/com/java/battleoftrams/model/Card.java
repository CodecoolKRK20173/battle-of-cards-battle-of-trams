package main.com.java.battleoftrams.model;

import main.com.java.battleoftrams.controler.Game;

public abstract class Card implements Comparable{
    private int travelTime;
    private int zulCount;
    private int driverRudeness;
    private int kanarCount;

    Card(int travelTime, int zulCount, int driverRudeness, int kanarCount) {
        this.travelTime = travelTime;
        this.zulCount = zulCount;
        this.driverRudeness = driverRudeness;
        this.kanarCount = kanarCount;
    }

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
    
    @Override
    public int compareTo(Card card) {
        if (Game.getSelectedCharasteristic.equals("travelTime")) {
            return this.travelTime - card.travelTime;
        } else if (Game.getSelectedCharasteristic.equals("zulCount")) {
            return this.zulCount - card.zulCount;
        } else if (Game.getSelectedCharasteristic.equals("driverRudeness")) {
            return this.driverRudeness - card.driverRudeness;
        } else if (Game.getSelectedCharasteristic.equals("kanarCount")) {
            return this.kanarCount - card.kanarCount;
        }
    }
    
}