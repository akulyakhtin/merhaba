package org.akul.merhaba.plural;

import org.akul.merhaba.harmony.MinorVowelHarmony;

public class Plural {

    public static final Plural INSTANCE = new Plural();

    private static final String AFFIX = "l" + MinorVowelHarmony.SYMBOL + "r";

    public String applyTo(String s) {
        return MinorVowelHarmony.INSTANCE.harmonize(s + AFFIX);
    }
}
