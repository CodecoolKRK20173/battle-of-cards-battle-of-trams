package main.com.java.battleoftrams.model;

import java.util.List;
import java.util.Random;
import java.util.Arrays;

public class Computer extends Player {

    public Computer(String name) {
        super(name);
    }

    @Override
    public String selectCharacteristic() {
        List<String> characteristicsList = Arrays.asList("travelTime", "zulCount", "driverRudeness", "canarCount");
        Random rand = new Random();
        int randomIndex = rand.nextInt(4);
        return characteristicsList.get(randomIndex);

    }

}