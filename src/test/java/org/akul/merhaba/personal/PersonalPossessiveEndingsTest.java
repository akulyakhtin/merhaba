package org.akul.merhaba.personal;

import org.junit.Test;

import static org.akul.merhaba.Turkish.*;
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
    public void testYou1() {
        assertEquals("kalemin", your1("kalem"));
        assertEquals("fıncanın", your1("fıncan"));
        assertEquals("kedin", your1("kedi"));
        assertEquals("araban", your1("araba"));
    }

    @Test
    public void testHis() {
        assertEquals("bisikleti", his("bisiklet"));
        assertEquals("gözlüğü", his("gözlük"));
        assertEquals("havlusu", his("havlu"));
        assertEquals("çerçevisi", his("çerçevi"));
        assertEquals("kaynaması", his("kaynama"));
    }

    @Test
    public void testOur() {
        assertEquals("odamız", our("oda"));
    }

    @Test
    public void testYour() {
        assertEquals("komşunuz", your("komşu"));
    }

    @Test
    public void testTheirs() {
        assertEquals("kitabı", theirs("kitap"));
    }
}
