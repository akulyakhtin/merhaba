package org.akul.merhaba;

import org.akul.merhaba.harmony.MajorVowelHarmony;
import org.akul.merhaba.harmony.MinorVowelHarmony;
import org.akul.merhaba.personal.PersonalEnding1P;
import org.akul.merhaba.personal.PersonalEnding1S;
import org.akul.merhaba.personal.PersonalEnding2S;
import org.akul.merhaba.personal.PersonalEnding3S;
import org.akul.merhaba.plural.Plural;

public class Turkish {

    public static String minorVowelHarmony(String s) {
        return MinorVowelHarmony.INSTANCE.harmonize(s);
    }

    public static String majorVowelHarmony(String s) {
        return MajorVowelHarmony.INSTANCE.harmonize(s);
    }

    public static String pluralOf(String s) {
        return Plural.INSTANCE.applyTo(s);
    }

    public static String my(String s) {
        return PersonalEnding1S.INSTANCE.applyTo(s);
    }

    public static String your1(String s) {
        return PersonalEnding2S.INSTANCE.applyTo(s);
    }

    public static String his(String s) {
        return PersonalEnding3S.INSTANCE.applyTo(s);
    }

    public static String our(String s) {
        return PersonalEnding1P.INSTANCE.applyTo(s);
    }
}
