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

    @Test
    public void should_return_a_mommy_string_when_covert_given_string_with_e() {
        Mommifier mommifier = new Mommifier();
        String result = mommifier.covert("bced");
        assertEquals("bcemommyd", result);
    }

    @Test
    public void should_return_a_mommy_string_when_covert_given_string_with_i() {
        Mommifier mommifier = new Mommifier();
        String result = mommifier.covert("bcid");
        assertEquals("bcimommyd", result);
    }

    @Test
    public void should_return_a_mommy_string_when_covert_given_string_with_o() {
        Mommifier mommifier = new Mommifier();
        String result = mommifier.covert("oo");
        assertEquals("omommyomommy", result);
    }

    @Test
    public void should_return_a_mommy_string_when_covert_given_string_with_u() {
        Mommifier mommifier = new Mommifier();
        String result = mommifier.covert("uu");
        assertEquals("umommyumommy", result);
    }

    @Test
    public void should_return_a_mommy_string_when_checkout_given_string_with_30_precent_of_vowels() {
        Mommifier mommifier = new Mommifier();
        String moreThanResult = mommifier.checkout("afefifofuf");
        assertEquals("amommyfemommyfimommyfomommyfumommyf", moreThanResult);

        String lessResult = mommifier.checkout("afefifffff");
        assertEquals("afefifffff", lessResult);
    }

}
