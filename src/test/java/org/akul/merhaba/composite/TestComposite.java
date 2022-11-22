package org.akul.merhaba.composite;

import org.junit.Test;

import static org.akul.merhaba.Turkish.my;
import static org.akul.merhaba.Turkish.pluralOf;
import static org.junit.Assert.assertEquals;

public class TestComposite {

    @Test
    public void testMyHouses() {
        assertEquals("evlerim", my(pluralOf("ev")));
    }
}
