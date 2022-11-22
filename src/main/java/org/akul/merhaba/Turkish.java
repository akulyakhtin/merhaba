package org.akul.merhaba;

import org.akul.merhaba.harmony.MajorVowelHarmony;
import org.akul.merhaba.harmony.MinorVowelHarmony;
import org.akul.merhaba.plural.Plural;

public class Turkish {

    private static final Plural PLURAL = new Plural();

    public static String minorVowelHarmony(String s) {
        return MinorVowelHarmony.INSTANCE.harmonize(s);
    }

    public static String majorVowelHarmony(String s) {
        return MajorVowelHarmony.INSTANCE.harmonize(s);
    }

    public static String pluralOf(String s) {
        return PLURAL.of(s);
    }
}
