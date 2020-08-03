package com.twuc.tdddame;

public class Mommifier {

    public static final String EMPTY_STRING = "";
    public static final double THRESHOLD = 0.00001;
    public static final double MAX_PRECENT = 0.3;
    public static final String MOMMY = "mommy";

    public String covert(String string) {
        string = string.replaceAll(Vowels.O.getValue(), Vowels.O.getValue() + MOMMY)
                .replaceAll(Vowels.U.getValue(), Vowels.U.getValue() + MOMMY)
                .replaceAll(Vowels.I.getValue(), Vowels.I.getValue() + MOMMY)
                .replaceAll(Vowels.E.getValue(), Vowels.E.getValue() + MOMMY)
                .replaceAll(Vowels.A.getValue(), Vowels.A.getValue() + MOMMY);
        return string;
    }

    public String checkout(String string) {
        String copyString = string;
        copyString = copyString.replaceAll(Vowels.O.getValue(), EMPTY_STRING)
                .replaceAll(Vowels.U.getValue(), EMPTY_STRING)
                .replaceAll(Vowels.I.getValue(), EMPTY_STRING)
                .replaceAll(Vowels.E.getValue(), EMPTY_STRING)
                .replaceAll(Vowels.A.getValue(), EMPTY_STRING);
        int vowelsCount = string.length() - copyString.length();
        double vowelsProportion = (float)vowelsCount / string.length();
        if(vowelsProportion - MAX_PRECENT > THRESHOLD) {
            string = covert(string);
        }
        return string;
    }
}
