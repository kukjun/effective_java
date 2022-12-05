package chapter2.item5.staticutil;

import chapter2.item5.Lexicon;

import java.util.ArrayList;
import java.util.List;

public class SpellChecker {
    private static final Lexicon dictionary = new Lexicon();

    private SpellChecker() {}

    public static boolean isValid(String word) {
//        ...
        return true;
    }

    public static List<String> suggestions(String typo) {
//        ...
        return new ArrayList<>();
    }
}
