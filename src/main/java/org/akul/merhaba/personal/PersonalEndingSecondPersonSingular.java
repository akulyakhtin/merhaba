package org.akul.merhaba.personal;

import org.akul.merhaba.harmony.MajorVowelHarmony;

public class PersonalEndingSecondPersonSingular extends PersonalEnding {
    public static final PersonalEndingSecondPersonSingular INSTANCE = new PersonalEndingSecondPersonSingular();

    protected String getAffix() {
        return MajorVowelHarmony.SYMBOL + "n";
    }
}
