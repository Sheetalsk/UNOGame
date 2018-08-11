package com.tic.search;

import java.util.Optional;

public class TextAnalyzer implements Analyzer {
    public Optional<Type> analyze(String text) {
        return Optional.of(Type.TYPE_TEXT);
    }
}
