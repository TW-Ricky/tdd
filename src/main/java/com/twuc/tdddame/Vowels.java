package com.twuc.tdddame;

public enum Vowels {
    A("a"),
    E("e"),
    I("i"),
    O("o"),
    U("u");
    private String value;

    Vowels(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
