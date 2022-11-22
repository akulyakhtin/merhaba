package org.akul.merhaba.personal;

import org.junit.Test;

import static org.akul.merhaba.Turkish.my;
import static org.akul.merhaba.Turkish.your1;
import static org.junit.Assert.assertEquals;

public class PersonalAffixesTest {

    @Test
    public void testMy() {
        assertEquals("adım", my("ad"));
    }

    @Test
    public void testMyEndsWithVowel() {
        assertEquals("iyiyim", my("iyi"));
    }

    @Test
    public void testYour() {
        assertEquals("adın", your1("ad"));
    }
}
