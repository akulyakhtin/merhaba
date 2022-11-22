package org.akul.merhaba.personal;

import org.junit.Test;

import static org.akul.merhaba.Turkish.my;
import static org.akul.merhaba.Turkish.your1;
import static org.junit.Assert.assertEquals;

public class PersonalPossessiveEndingsTest {

    @Test
    public void testMy() {
        assertEquals("kitabım", my("kitap"));
        assertEquals("örümceğim", my("örümcek"));
        assertEquals("kapım", my("kapı"));
        assertEquals("şapkam", my("şapka"));
    }

    @Test
    public void testYour() {
        assertEquals("adın", your1("ad"));
        assertEquals("iyiyin", your1("iyi"));
    }
}
