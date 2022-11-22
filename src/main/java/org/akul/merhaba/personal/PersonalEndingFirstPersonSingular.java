package org.akul.merhaba.personal;

import org.akul.merhaba.harmony.MajorVowelHarmony;

public class PersonalEndingFirstPersonSingular extends PersonalEndingStartingWithVowel {
    public static final PersonalEndingFirstPersonSingular INSTANCE = new PersonalEndingFirstPersonSingular();

    protected String getAffix() {
        return MajorVowelHarmony.SYMBOL + "m";
    }


}
