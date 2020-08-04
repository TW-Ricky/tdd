package com.twuc.tdddame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {

    @Test
    public void should_return_a_mommy_string_when_covert_given_a_string_with_continuous_set_of_vowels() {
        Mommifier mommifier = new Mommifier();
        String result = mommifier.covert("aabbcco");
        String expected = "amommyabbcco";
        assertEquals(expected, result);
    }

    @Test
    public void should_return_a_string_when_covert_given_a_string_with_discontinuous_vowels() {
        Mommifier mommifier = new Mommifier();
        String result = mommifier.covert("afefifofuf");
        String expected = "afefifofuf";
        assertEquals(expected, result);
    }

    @Test
    public void should_return_a_mommy_string_when_covert_given_a_string_with_more_than_30_precent_vowels() {
        Mommifier mommifier = new Mommifier();
        String moreThanResult = mommifier.covert("aeffifouff");
        assertEquals("amommyeffifomommyuff", moreThanResult);
    }

    @Test
    public void should_return_a_string_when_covert_given_a_string_with_less_30_precent_vowels() {
        Mommifier mommifier = new Mommifier();
        String lessResult = mommifier.covert("aeffifffff");
        assertEquals("aeffifffff", lessResult);
    }
}
