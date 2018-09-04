package main.com.java.battleoftrams.model;

import java.util.concurrent.ThreadLocalRandom;

public enum Tramlines {
    Line_8   (1, 10, 1, 10, 1, 10, 1, 10),      // These
    Line_10  (1, 10, 1, 10, 1, 10, 1, 10),      // will
    Line_19  (1, 10, 1, 10, 1, 10, 1, 10),      // be
    Line_24  (1, 10, 1, 10, 1, 10, 1, 10);      // varied

    private final int minTravelTime;
    private final int maxTravelTime;
    private final int minZulCount;
    private final int maxZulCount;
    private final int minDriverRudeness;
    private final int maxDriverRudeness;
    private final int minKanarCount;
    private final int maxKanarCount;

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
                    .nextInt(Tramlines.Line_8.minTravelTime, Tramlines.Line_8.maxTravelTime + 1);
            characteristics[1] = ThreadLocalRandom.current()
                    .nextInt(Tramlines.Line_8.minZulCount, Tramlines.Line_8.maxZulCount + 1);
            characteristics[2] = ThreadLocalRandom.current()
                    .nextInt(Tramlines.Line_8.minDriverRudeness, Tramlines.Line_8.maxDriverRudeness + 1);
            characteristics[3] = ThreadLocalRandom.current()
                    .nextInt(Tramlines.Line_8.minKanarCount, Tramlines.Line_8.maxKanarCount + 1);
        } else if (tramType == Tramlines.Line_10) {
            characteristics[0] = ThreadLocalRandom.current()
                    .nextInt(Tramlines.Line_10.minTravelTime, Tramlines.Line_10.maxTravelTime + 1);
            characteristics[1] = ThreadLocalRandom.current()
                    .nextInt(Tramlines.Line_10.minZulCount, Tramlines.Line_10.maxZulCount + 1);
            characteristics[2] = ThreadLocalRandom.current()
                    .nextInt(Tramlines.Line_10.minDriverRudeness, Tramlines.Line_10.maxDriverRudeness + 1);
            characteristics[3] = ThreadLocalRandom.current()
                    .nextInt(Tramlines.Line_10.minKanarCount, Tramlines.Line_10.maxKanarCount + 1);
        } else if (tramType == Tramlines.Line_19) {
            characteristics[0] = ThreadLocalRandom.current()
                    .nextInt(Tramlines.Line_19.minTravelTime, Tramlines.Line_19.maxTravelTime + 1);
            characteristics[1] = ThreadLocalRandom.current()
                    .nextInt(Tramlines.Line_19.minZulCount, Tramlines.Line_19.maxZulCount + 1);
            characteristics[2] = ThreadLocalRandom.current()
                    .nextInt(Tramlines.Line_19.minDriverRudeness, Tramlines.Line_19.maxDriverRudeness + 1);
            characteristics[3] = ThreadLocalRandom.current()
                    .nextInt(Tramlines.Line_19.minKanarCount, Tramlines.Line_19.maxKanarCount + 1);
        } else if (tramType == Tramlines.Line_24) {
            characteristics[0] = ThreadLocalRandom.current()
                    .nextInt(Tramlines.Line_24.minTravelTime, Tramlines.Line_24.maxTravelTime + 1);
            characteristics[1] = ThreadLocalRandom.current()
                    .nextInt(Tramlines.Line_24.minZulCount, Tramlines.Line_24.maxZulCount + 1);
            characteristics[2] = ThreadLocalRandom.current()
                    .nextInt(Tramlines.Line_24.minDriverRudeness, Tramlines.Line_24.maxDriverRudeness + 1);
            characteristics[3] = ThreadLocalRandom.current()
                    .nextInt(Tramlines.Line_24.minKanarCount, Tramlines.Line_24.maxKanarCount + 1);
        }
        return characteristics;
    }

}

/* HOW TO USE IT:

-> In order to create card subclass instance with use of this enum, first call
   enum method to create random characteristics and assign it to an array, e.g.:

int[] some_card_number_8_characteristics = Tramlines.Line_8.setCharacteristics(Tramlines.Line_8);

-> And than just create instance of a card passing to its constructor created array as a parameter , e.g.:

Card card8 = new TramLine_8_Card(some_card_number_8_characteristics);

*/