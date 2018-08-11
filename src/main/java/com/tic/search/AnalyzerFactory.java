package com.tic.search;

import java.util.*;

public class AnalyzerFactory {
    static List<Analyzer> createAnalyzers() {
        return Arrays.asList(new DateAnalyzer(), new TextAnalyzer());
    }

}
