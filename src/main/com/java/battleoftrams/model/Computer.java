package main.com.java.battleoftrams.model;

import java.util.List;
import java.util.Random;

public class Computer extends Player {

    public Computer() {
        super();
    }

    @Override
    public String selectCharacteristic() {
        List<String> characteristicsList = Arrays.asList("travelTime", "zulCount", "driverRudeness", "canarCount");
        Random rand = new Random();
        int randomIndex = rand.nextInt(4);
        characteristicsList.get(randomIndex);
    }

}