package org.akul.merhaba.personal;

import org.akul.merhaba.harmony.MajorVowelHarmony;

public class PersonalEndingSecondPersonSingular extends PersonalPossessiveEnding {
    public static final PersonalEndingSecondPersonSingular INSTANCE = new PersonalEndingSecondPersonSingular();

    @Override
    protected String getAffixAfterVowel() {
        return "n";
    }

    protected String getAffixAfterConsonant() {
        return MajorVowelHarmony.SYMBOL + "n";
    }
}
