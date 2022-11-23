package org.akul.merhaba.personal;

public class PersonalEnding1S extends PersonalEnding {
    public static final PersonalEnding1S INSTANCE = new PersonalEnding1S();

    public String applyTo(String word) {
        return applyTo(word, PossessivePersonalPronouns.MY);
    }
}
