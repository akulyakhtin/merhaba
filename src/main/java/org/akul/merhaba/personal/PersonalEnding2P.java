package org.akul.merhaba.personal;

public class PersonalEnding2P extends PersonalEnding {
    public static final PersonalEnding2P INSTANCE = new PersonalEnding2P();

    public String applyTo(String word) {
        return applyTo(word, PossessivePersonalPronouns.YOUR);
    }
}
