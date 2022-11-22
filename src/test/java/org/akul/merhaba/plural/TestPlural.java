package org.akul.merhaba.plural;

import org.junit.Test;

import static org.akul.merhaba.Turkish.pluralOf;
import static org.junit.Assert.assertEquals;

public class TestPlural {

    @Test
    public void testLar() {
        assertEquals("arkadaşlar", pluralOf("arkadaş"));
    }

    @Test
    public void testLer() {
        assertEquals("şehirler", pluralOf("şehir"));
    }
}
