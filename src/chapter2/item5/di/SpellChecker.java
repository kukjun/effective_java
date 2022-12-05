package chapter2.item5.di;

import chapter2.item5.Lexicon;

import java.util.ArrayList;
import java.util.List;

public class SpellChecker {
    private final Lexicon dictionary;

    public SpellChecker(Lexicon lexicon) {
        dictionary = lexicon;
    }

    public boolean isValid(String word) {
//        ...
        return true;
    }

    public List<String> suggestions(String typo) {
//        ...
        return new ArrayList<>();
    }
}
