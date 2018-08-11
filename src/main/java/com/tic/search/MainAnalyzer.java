package com.tic.search;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class MainAnalyzer {
    private List<Analyzer> analyzers;

    MainAnalyzer() {
        this.analyzers = AnalyzerFactory.createAnalyzers();
    }

    public Set<Tuple<String, Type>> analyze(String text) {
        Set<Tuple<String, Type>> tuples = new HashSet<>();

        String[] textArray = text.split(" ");
        for (String word : textArray) {
            for (Analyzer analyzer : analyzers) {
                Optional<Type> optType = analyzer.analyze(word);
                if (optType.isPresent()) {
                    tuples.add(new Tuple<>(word, optType.get()));
                    break;
                }
            }
        }
        return tuples;
    }
}
