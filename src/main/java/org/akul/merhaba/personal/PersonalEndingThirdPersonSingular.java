package org.akul.merhaba.personal;

import org.akul.merhaba.alphabet.Consonants;
import org.akul.merhaba.alphabet.Vowels;
import org.akul.merhaba.harmony.MajorVowelHarmony;

public class PersonalEndingThirdPersonSingular extends PersonalPossessiveEnding {
    public static final PersonalEndingThirdPersonSingular INSTANCE = new PersonalEndingThirdPersonSingular();

    @Override
    public String applyTo(String s) {
        String ending;
        if (Vowels.endsWithVowel(s)) {
            ending = "s" + MajorVowelHarmony.SYMBOL;
        } else {
            s = s.substring(0, s.length() - 1) + Consonants.addVoiceToK(s.charAt(s.length() - 1));
            ending = MajorVowelHarmony.SYMBOL;
        }
        return MajorVowelHarmony.INSTANCE.harmonize(s + ending);
    }
}
