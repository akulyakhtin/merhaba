package org.akul.merhaba.personal;

import org.akul.merhaba.alphabet.Consonants;
import org.akul.merhaba.alphabet.Vowels;
import org.akul.merhaba.harmony.MajorVowelHarmony;

abstract public class PersonalPossessiveEnding {

    public final String applyTo(String s) {
        String ending;
        if (Vowels.endsWithVowel(s)) {
            ending = getAffixAfterVowel();
        } else {
            s = changeLastConsonant(s);
            ending = getAffixAfterConsonant();
        }
        return MajorVowelHarmony.INSTANCE.harmonize(s + ending);
    }

    protected String changeLastConsonant(String s) {
        return s.substring(0, s.length() - 1) + Consonants.addVoice(s.charAt(s.length() - 1));
    }

    protected abstract String getAffixAfterVowel();

    protected abstract String getAffixAfterConsonant();
}
