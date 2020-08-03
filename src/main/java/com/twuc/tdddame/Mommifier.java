package com.twuc.tdddame;

public class Mommifier {
    public String covert(String string) {
        string = string.replaceAll("o", "omommy");
        string = string.replaceAll("u", "umommy");
        string = string.replaceAll("i", "imommy");
        string = string.replaceAll("e", "emommy");
        string = string.replaceAll("a", "amommy");
        return string;
    }

    public String checkout(String string) {
        String copyString = string;
        copyString = copyString.replaceAll("a", "").replaceAll("e", "")
                .replaceAll("i", "").replaceAll("o", "")
                .replaceAll("u","");
        int vowelsCount = string.length() - copyString.length();
        double vowelsProportion = (float)vowelsCount / string.length();
        System.out.println(vowelsProportion);
        if(vowelsProportion - 0.3 > 0.00001) {
            string = covert(string);
        }
        return string;
    }
}
