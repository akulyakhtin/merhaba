##Unit test the Turkish language!

    @Test
    public void testMy() {
        assertEquals("adım", my("ad"));
    }

    @Test
    public void testPlural() {
        assertEquals("arkadaşlar", pluralOf("arkadaş"));
    }

    @Test
    public void testMyHouses() {
        assertEquals("evlerim", my(pluralOf("ev")));
    }