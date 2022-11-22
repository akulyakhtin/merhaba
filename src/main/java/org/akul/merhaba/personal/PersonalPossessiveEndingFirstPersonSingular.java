package org.akul.merhaba.personal;

import org.akul.merhaba.harmony.MajorVowelHarmony;

public class PersonalPossessiveEndingFirstPersonSingular extends PersonalPossessiveEnding {
    public static final PersonalPossessiveEndingFirstPersonSingular INSTANCE = new PersonalPossessiveEndingFirstPersonSingular();

    @Override
    protected String getAffixAfterVowel() {
        return "m";
    }

    protected String getAffixAfterConsonant() {
        return MajorVowelHarmony.SYMBOL + "m";
    }


}
