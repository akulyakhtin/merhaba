package org.akul.merhaba.personal;

import org.akul.merhaba.alphabet.Consonants;
import org.akul.merhaba.harmony.MajorVowelHarmony;

public class PersonalEndingThirdPersonSingular extends PersonalPossessiveEnding {
    public static final PersonalEndingThirdPersonSingular INSTANCE = new PersonalEndingThirdPersonSingular();


    protected String getAffixAfterVowel() {
        return "s" + MajorVowelHarmony.SYMBOL;
    }

    protected String getAffixAfterConsonant() {
        return MajorVowelHarmony.SYMBOL;
    }

    @Override
    protected String changeLastConsonant(String s) {
        return s.substring(0, s.length() - 1) + Consonants.addVoiceToK(s.charAt(s.length() - 1));
    }
}
