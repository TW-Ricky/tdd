package com.twuc.tdddame;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mommifier {

    public static final String EMPTY_STRING = "";
    public static final double THRESHOLD = 0.00001;
    public static final double MAX_PRECENT = 0.3;
    public static final String MOMMY = "mommy";
    public static final String VOWELS = "[aeiouAEIOU]";
    public static final String CONTINUOUS_VOWELS = "[aeiouAEIOU]{2,}";

    public String covert(String string) {
        if (checkout(string)) {
            Pattern pattern = Pattern.compile(CONTINUOUS_VOWELS);
            Matcher matcher = pattern.matcher(string);
            while (matcher.find()) {
                string = string.replaceAll(matcher.group(), String.join(MOMMY, matcher.group().split("")));
            }
        }
        return string;
    }

    private Boolean checkout(String string) {
        String copyString = string;
        copyString = copyString.replaceAll(VOWELS, EMPTY_STRING);
        int vowelsCount = string.length() - copyString.length();
        double vowelsProportion = (float)vowelsCount / string.length();
        if(vowelsProportion - MAX_PRECENT > THRESHOLD) {
            return true;
        }
        return false;
    }
}
