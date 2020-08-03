package com.twuc.tdddame;

public class Mommifier {
    public String covert(String string) {
        string = string.replaceAll("e", "emommy");
        return string.replaceAll("a", "amommy");
    }
}
