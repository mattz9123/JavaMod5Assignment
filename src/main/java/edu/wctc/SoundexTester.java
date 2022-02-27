package edu.wctc;

import org.apache.commons.codec.language.Soundex;

public class SoundexTester {
    public static void main(String[] args) {
        Soundex soundex = new Soundex();
        String encoding = soundex.encode("Zwerlein");
        System.out.println(encoding);
    }
}
