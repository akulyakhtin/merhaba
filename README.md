##Unit test the Turkish language!

    @Test
    public void testMy() {
        assertEquals("adım", my("ad"));
    }

    @Test
    public void testPlural() {
        assertEquals("arkadaşlar", pluralOf("arkadaş"));
    }