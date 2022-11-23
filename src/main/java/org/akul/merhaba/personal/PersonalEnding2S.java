package org.akul.merhaba.personal;

public class PersonalEnding2S extends PersonalEnding {
    public static final PersonalEnding2S INSTANCE = new PersonalEnding2S();

    public String applyTo(String word) {
        return applyTo(word, PossessivePersonalPronouns.YOUR1);
    }
}
