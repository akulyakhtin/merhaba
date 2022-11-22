package org.akul.merhaba.harmony;

import org.akul.merhaba.alphabet.Vowels;

abstract public class VowelHarmony {
    public String harmonize(String s) {
        StringBuilder sb = new StringBuilder(s);
        int ndx;
        while((ndx = sb.indexOf(getSymbol())) != -1) {
            if(ndx == 0) throw new IllegalArgumentException("A vowel must precede a vowel harmony symbol in the word.");
            for(int i = ndx-1; i>=0; --i) {
                char prevVowel = Vowels.checkVowel(s.charAt(i));
                if(prevVowel != '\0') {
                    sb.replace(ndx, ndx+1, harmonyVowel(prevVowel));
                    break;
                }
            }
        }
        if(sb.indexOf(getSymbol()) != -1) {
            throw new IllegalArgumentException("A vowel must precede a vowel harmony symbol in the word.");
        }
        return sb.toString();
    }

    protected abstract String harmonyVowel(char prevVowel);

    protected abstract String getSymbol();
}
