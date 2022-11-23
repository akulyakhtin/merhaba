package org.akul.merhaba.personal;

import org.akul.merhaba.affixes.AccusativeCaseSuffix;
import org.akul.merhaba.alphabet.Consonants;
import org.akul.merhaba.alphabet.Vowels;
import org.akul.merhaba.harmony.MajorVowelHarmony;

abstract public class PersonalEnding {

    private static final AccusativeCaseSuffix accusativeCaseSuffix = new AccusativeCaseSuffix();

    public String forPossessive(String word, PossessivePersonalPronouns person) {

        String accSuff = accusativeCaseSuffix.forWord(word);
        String posSuf = person.suffix();

        String suff = "";
        if (Vowels.endsWithVowel(word)) {
            if (person == PossessivePersonalPronouns.HIS) {
                suff = accSuff;
            }
        } else {
            suff = accSuff;
        }
        return suff + posSuf;
    }

    public String applyTo(String word, PossessivePersonalPronouns person) {
        if (word.charAt(word.length() - 1) == 'k' || word.charAt(word.length() - 1) == 'p') {
            String ch = Consonants.addVoice(word.charAt(word.length() - 1));
            word = word.substring(0, word.length() - 1) + ch;
        }
        return MajorVowelHarmony.INSTANCE.harmonize(word + forPossessive(word, person));
    }

    abstract public String applyTo(String word);
}
