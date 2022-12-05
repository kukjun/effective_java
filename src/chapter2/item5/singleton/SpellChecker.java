package chapter2.item5.singleton;

import chapter2.item5.Lexicon;

import java.util.ArrayList;
import java.util.List;

public class SpellChecker {
    private final Lexicon dictionary;

    private SpellChecker() {
        dictionary = new Lexicon();
    }

    public static SpellChecker INSTANCE = new SpellChecker();

    public boolean isValid(String word) {
//        ...
        return true;
    }

    public List<String> suggestions(String typo) {
//        ...
        return new ArrayList<>();
    }
}

