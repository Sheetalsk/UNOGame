package com.tic.search;

import com.tic.common.Tuple;

import java.util.Set;

public interface Analyzer {
    Set<Tuple<String, Type>> analyze(String input);
}
