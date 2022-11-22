package org.akul.merhaba.plural;

import org.akul.merhaba.harmony.MinorVowelHarmony;

public class Plural {

    private static final String AFFIX = "l" + MinorVowelHarmony.SYMBOL + "r";

    public String of(String s) {
        return MinorVowelHarmony.INSTANCE.harmonize(s + AFFIX);
    }
}
