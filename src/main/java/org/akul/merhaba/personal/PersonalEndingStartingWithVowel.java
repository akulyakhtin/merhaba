package org.akul.merhaba.personal;

import org.akul.merhaba.alphabet.Vowels;

abstract public class PersonalEndingStartingWithVowel extends PersonalEnding {
    @Override
    public String applyTo(String s) {
        if (Vowels.endsWithVowel(s)) {
            s += "y";
        }
        return super.applyTo(s);
    }
}
