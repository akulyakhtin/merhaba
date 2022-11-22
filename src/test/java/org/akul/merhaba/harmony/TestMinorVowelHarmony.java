package org.akul.merhaba.harmony;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.akul.merhaba.Turkish.minorVowelHarmony;

public class TestMinorVowelHarmony {

    @Test
    public void testA() {
        assertEquals("merhabalar", minorVowelHarmony("merhabal" + MinorVowelHarmony.SYMBOL + "r"));
    }

    @Test
    public void testE() {
        assertEquals("geceler", minorVowelHarmony("gecel" + MinorVowelHarmony.SYMBOL + "r"));
    }
}
