package org.akul.merhaba.personal;

import org.akul.merhaba.alphabet.Vowels;
import org.akul.merhaba.harmony.MajorVowelHarmony;

public class PersonalEndingFirstPersonSingular extends PersonalEnding {
    public static final PersonalEndingFirstPersonSingular INSTANCE = new PersonalEndingFirstPersonSingular();

    protected String getAffix() {
        return MajorVowelHarmony.SYMBOL + "m";
    }

    @Override
    public String applyTo(String s) {
        if (Vowels.endsWithVowel(s)) {
            s += "y";
        }
        return super.applyTo(s);
    }
}
