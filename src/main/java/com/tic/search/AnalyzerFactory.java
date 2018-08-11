package com.tic.search;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AnalyzerFactory {
    public static Set<Analyzer> getSupportedAnalyzers() {
        return new HashSet<Analyzer>(Arrays.asList(new DateAnalyzer(), new TextAnalyzer()));
    }
}
