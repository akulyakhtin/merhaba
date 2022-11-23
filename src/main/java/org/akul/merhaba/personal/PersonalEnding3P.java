package org.akul.merhaba.personal;

public class PersonalEnding3P extends PersonalEnding {
    public static final PersonalEnding3P INSTANCE = new PersonalEnding3P();

    public String applyTo(String word) {
        return applyTo(word, PossessivePersonalPronouns.THEIR);
    }
}
