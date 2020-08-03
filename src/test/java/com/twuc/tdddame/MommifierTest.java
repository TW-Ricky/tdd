package com.twuc.tdddame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {

    @Test
    public void should_return_a_mommy_string_when_covert_given_string_with_a() {
        Mommifier mommifier = new Mommifier();
        String result = mommifier.covert("bcad");
        assertEquals("bcamommyd", result);
    }
}
