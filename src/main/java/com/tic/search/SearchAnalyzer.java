package com.tic.search;

import com.tic.common.Tuple;

import java.util.Set;

public class SearchAnalyzer implements Analyzer{
    private Set<Analyzer> analyzers = AnalyzerFactory.getSupportedAnalyzers();

    public Set<Tuple<String, Type>> analyze(String input) {
        return null;
    }
}
