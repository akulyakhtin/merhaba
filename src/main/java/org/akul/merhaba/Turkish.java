package org.akul.merhaba;

import org.akul.merhaba.harmony.MajorVowelHarmony;
import org.akul.merhaba.harmony.MinorVowelHarmony;
import org.akul.merhaba.personal.PersonalEndingSecondPersonSingular;
import org.akul.merhaba.personal.PersonalEndingThirdPersonSingular;
import org.akul.merhaba.personal.PersonalPossessiveEndingFirstPersonSingular;
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
        return PersonalPossessiveEndingFirstPersonSingular.INSTANCE.applyTo(s);
    }

    public static String your1(String s) {
        return PersonalEndingSecondPersonSingular.INSTANCE.applyTo(s);
    }

    public static String his(String s) {
        return PersonalEndingThirdPersonSingular.INSTANCE.applyTo(s);
    }
}
