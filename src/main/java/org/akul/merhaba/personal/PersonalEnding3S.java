package org.akul.merhaba.personal;

public class PersonalEnding3S extends PersonalEnding {

    public static final PersonalEnding3S INSTANCE = new PersonalEnding3S();

    public String applyTo(String word) {
        return applyTo(word, PossessivePersonalPronouns.HIS);
    }
}
