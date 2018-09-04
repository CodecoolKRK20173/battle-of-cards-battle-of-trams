package main.com.java.battleoftrams.model;

import java.util.concurrent.ThreadLocalRandom;

public enum Tramlines {
    Line_8   (1, 10, 1, 10, 1, 10, 1, 10),
    Line_10  (1, 10, 1, 10, 1, 10, 1, 10),
    Line_19  (1, 10, 1, 10, 1, 10, 1, 10),
    Line_24  (1, 10, 1, 10, 1, 10, 1, 10);

    private int minTravelTime;
    private int maxTravelTime;
    private int minZulCount;
    private int maxZulCount;
    private int minDriverRudeness;
    private int maxDriverRudeness;
    private int minKanarCount;
    private int maxKanarCount;

    private Tramlines(int minTravelTime, int maxTravelTime,
              int minZulCount, int maxZulCount,
              int minDriverRudeness, int maxDriverRudeness,
              int minKanarCount, int maxKanarCount) {
        this.minTravelTime = minTravelTime;
        this.maxTravelTime = maxTravelTime;
        this.minZulCount = minZulCount;
        this.maxZulCount = maxZulCount;
        this.minDriverRudeness = minDriverRudeness;
        this.maxDriverRudeness = maxDriverRudeness;
        this.minKanarCount = minKanarCount;
        this.maxKanarCount = maxKanarCount;
    }

    public int[] setCharacteristics(Tramlines tramType) {
        int[] characteristics = new int[4];

        if (tramType == Tramlines.Line_8) {
            characteristics[0] = ThreadLocalRandom.current()
                    .nextInt(Line_8.minTravelTime, Line_8.maxTravelTime + 1);
            characteristics[1] = ThreadLocalRandom.current()
                    .nextInt(Line_8.minZulCount, Line_8.maxZulCount + 1);
            characteristics[2] = ThreadLocalRandom.current()
                    .nextInt(Line_8.minDriverRudeness, Line_8.maxDriverRudeness + 1);
            characteristics[3] = ThreadLocalRandom.current()
                    .nextInt(Line_8.minKanarCount, Line_8.maxKanarCount + 1);
        } else if (tramType == Tramlines.Line_10) {
            characteristics[0] = ThreadLocalRandom.current()
                    .nextInt(Line_10.minTravelTime, Line_10.maxTravelTime + 1);
            characteristics[1] = ThreadLocalRandom.current()
                    .nextInt(Line_10.minZulCount, Line_10.maxZulCount + 1);
            characteristics[2] = ThreadLocalRandom.current()
                    .nextInt(Line_10.minDriverRudeness, Line_10.maxDriverRudeness + 1);
            characteristics[3] = ThreadLocalRandom.current()
                    .nextInt(Line_10.minKanarCount, Line_10.maxKanarCount + 1);
        } else if (tramType == Tramlines.Line_19) {
            characteristics[0] = ThreadLocalRandom.current()
                    .nextInt(Line_19.minTravelTime, Line_19.maxTravelTime + 1);
            characteristics[1] = ThreadLocalRandom.current()
                    .nextInt(Line_19.minZulCount, Line_19.maxZulCount + 1);
            characteristics[2] = ThreadLocalRandom.current()
                    .nextInt(Line_19.minDriverRudeness, Line_19.maxDriverRudeness + 1);
            characteristics[3] = ThreadLocalRandom.current()
                    .nextInt(Line_19.minKanarCount, Line_19.maxKanarCount + 1);
        } else if (tramType == Tramlines.Line_24) {
            characteristics[0] = ThreadLocalRandom.current()
                    .nextInt(Line_24.minTravelTime, Line_24.maxTravelTime + 1);
            characteristics[1] = ThreadLocalRandom.current()
                    .nextInt(Line_24.minZulCount, Line_24.maxZulCount + 1);
            characteristics[2] = ThreadLocalRandom.current()
                    .nextInt(Line_24.minDriverRudeness, Line_24.maxDriverRudeness + 1);
            characteristics[3] = ThreadLocalRandom.current()
                    .nextInt(Line_24.minKanarCount, Line_24.maxKanarCount + 1);
        }
        return characteristics;
    }

}