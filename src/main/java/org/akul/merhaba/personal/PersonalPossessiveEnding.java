package org.akul.merhaba.personal;

import org.akul.merhaba.alphabet.Consonants;
import org.akul.merhaba.alphabet.Vowels;
import org.akul.merhaba.harmony.MajorVowelHarmony;

abstract public class PersonalPossessiveEnding {

    public String applyTo(String s) {
        String ending = "";
        if (!Vowels.endsWithVowel(s)) {
            s = s.substring(0, s.length() - 1) + Consonants.addVoice(s.charAt(s.length() - 1));
            ending += MajorVowelHarmony.SYMBOL;
        }
        ending += getAffix();
        return MajorVowelHarmony.INSTANCE.harmonize(s + ending);
    }

    protected abstract String getAffix();
}
