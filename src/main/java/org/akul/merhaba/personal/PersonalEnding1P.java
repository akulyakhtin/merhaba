package org.akul.merhaba.personal;

public class PersonalEnding1P extends PersonalEnding {
    public static final PersonalEnding1P INSTANCE = new PersonalEnding1P();

    public String applyTo(String word) {
        return applyTo(word, PossessivePersonalPronouns.OUR);
    }
}
