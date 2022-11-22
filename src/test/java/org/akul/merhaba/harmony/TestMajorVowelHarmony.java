package org.akul.merhaba.harmony;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.akul.merhaba.Turkish.majorVowelHarmony;

public class TestMajorVowelHarmony {

    @Test
    public void testI() {
        assertEquals("akıllı", majorVowelHarmony("akıl" + "l" + MajorVowelHarmony.SYMBOL));
    }

    @Test
    public void testA() {
        assertEquals("sıcaklı", majorVowelHarmony("sıcak" + "l" + MajorVowelHarmony.SYMBOL));
    }
}
